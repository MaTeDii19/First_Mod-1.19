package net.MaTeDii.mod.item;

import net.MaTeDii.mod.mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(mod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, SAPPHIRE);
        addToItemGroup(ItemGroups.COMBAT, SAPPHIRE_SWORD);

        addToItemGroup(ModItemsGroup.SAPPHIRE, SAPPHIRE);
        addToItemGroup(ModItemsGroup.SAPPHIRE, SAPPHIRE_SWORD);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        mod.LOGGER.info("Registering Mod Items for " + mod.MOD_ID);

        addItemsToItemGroup();
    }

}
