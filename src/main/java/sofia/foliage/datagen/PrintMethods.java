package sofia.foliage.datagen;

import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import java.lang.reflect.Method;

public class PrintMethods {
    public static void main(String[] args) {
        for (Method m : BlockLootTableGenerator.class.getDeclaredMethods()) {
            if (m.getReturnType().getName().contains("LootTable")) {
                System.out.println(m.getName() + " " + m.getParameterCount());
                for (Class<?> p : m.getParameterTypes()) {
                    System.out.println("  " + p.getSimpleName());
                }
            }
        }
    }
}
