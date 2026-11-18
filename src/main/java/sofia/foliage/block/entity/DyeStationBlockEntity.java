package sofia.foliage.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import sofia.foliage.dyeing.DyeStorage;
import sofia.foliage.screen.DyeStationScreenHandler;

public class DyeStationBlockEntity extends BlockEntity implements NamedScreenHandlerFactory {
    private final int[] colorings = new int[DyeStorage.SIZE];

    /** View of the storage that the screen handler syncs to the client. */
    private final PropertyDelegate storage = new PropertyDelegate() {
        @Override
        public int get(int index) {
            return colorings[index];
        }

        @Override
        public void set(int index, int value) {
            colorings[index] = value;
            markDirty();
        }

        @Override
        public int size() {
            return DyeStorage.SIZE;
        }
    };

    public DyeStationBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DYE_STATION, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("container.colored-foliage.dye_station");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new DyeStationScreenHandler(syncId, playerInventory, storage, ScreenHandlerContext.create(world, pos));
    }

    /** Gives back the stored dye as items when the block is broken (leftover partial dyes are lost). */
    public void dropStoredDyes(World world, BlockPos pos) {
        for (int i = 0; i < DyeStorage.SIZE; i++) {
            int dyes = colorings[i] / DyeStorage.COLORINGS_PER_DYE;
            while (dyes > 0) {
                ItemStack stack = DyeStorage.dyeItem(i);
                int count = Math.min(dyes, stack.getMaxCount());
                stack.setCount(count);
                ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(), stack);
                dyes -= count;
            }
            colorings[i] = 0;
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putIntArray("Colorings", colorings);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        int[] saved = nbt.getIntArray("Colorings");
        for (int i = 0; i < colorings.length; i++) {
            colorings[i] = i < saved.length ? saved[i] : 0;
        }
    }
}
