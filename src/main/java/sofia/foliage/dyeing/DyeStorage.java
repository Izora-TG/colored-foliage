package sofia.foliage.dyeing;

import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.util.DyeColor;
import sofia.foliage.item.ModItems;

/**
 * Shared rules for the dye station's storage. The storage is 17 counters of
 * "colorings": one per {@link DyeColor} (index = color id) plus one for
 * Universal Dye ({@link #UNIVERSAL}).
 */
public final class DyeStorage {
    /** How many flowers one dye item can color. Crafting by hand costs 1 dye per flower. */
    public static final int COLORINGS_PER_DYE = 4;
    /** Capacity per color, in colorings (= 64 dyes). */
    public static final int CAPACITY = 64 * COLORINGS_PER_DYE;
    public static final int UNIVERSAL = 16;
    public static final int SIZE = 17;

    private DyeStorage() {}

    /** Storage index for a dye item, or -1 if the stack is not a dye. */
    public static int indexOf(ItemStack stack) {
        if (stack.isOf(ModItems.UNIVERSAL_DYE)) return UNIVERSAL;
        if (stack.getItem() instanceof DyeItem dye) return dye.getColor().getId();
        return -1;
    }

    public static ItemStack dyeItem(int index) {
        return index == UNIVERSAL ? new ItemStack(ModItems.UNIVERSAL_DYE) : new ItemStack(DyeItem.byColor(DyeColor.byId(index)));
    }

    /** True if one coloring in {@code color} is available, from its own counter or from Universal Dye. */
    public static boolean canColor(PropertyDelegate storage, DyeColor color) {
        return storage.get(color.getId()) > 0 || storage.get(UNIVERSAL) > 0;
    }

    /** Uses up one coloring: the color's own dye first, Universal Dye only when that is empty. */
    public static void consume(PropertyDelegate storage, DyeColor color) {
        int index = storage.get(color.getId()) > 0 ? color.getId() : UNIVERSAL;
        storage.set(index, Math.max(0, storage.get(index) - 1));
    }

    /**
     * Moves as many dyes from {@code stack} into the storage as fit and shrinks
     * the stack accordingly. Returns true if anything was absorbed.
     */
    public static boolean absorb(PropertyDelegate storage, ItemStack stack) {
        int index = indexOf(stack);
        if (index < 0) return false;
        int free = (CAPACITY - storage.get(index)) / COLORINGS_PER_DYE;
        int taken = Math.min(free, stack.getCount());
        if (taken <= 0) return false;
        storage.set(index, storage.get(index) + taken * COLORINGS_PER_DYE);
        stack.decrement(taken);
        return true;
    }
}
