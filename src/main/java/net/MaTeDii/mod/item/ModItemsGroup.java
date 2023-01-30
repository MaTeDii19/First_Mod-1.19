package net.MaTeDii.mod.item;

import net.MaTeDii.mod.mod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static ItemGroup SAPPHIRE;

    public static void registerItemGroups() {
        SAPPHIRE = FabricItemGroup.builder(new Identifier(mod.MOD_ID, "sapphire"))
                .displayName(Text.translatable("itemgroup.sapphire"))
                .icon(() -> new ItemStack(ModItems.SAPPHIRE)).build();
    }
}
