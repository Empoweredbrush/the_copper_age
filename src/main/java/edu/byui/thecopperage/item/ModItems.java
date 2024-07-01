package edu.byui.thecopperage.item;

import edu.byui.thecopperage.thecopperage;
import edu.byui.thecopperage.materials.CopperArmorMaterials;
import edu.byui.thecopperage.materials.ToolMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, thecopperage.MOD_ID);
    //TOOLS
        public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ToolMaterials.COPPER, 2, -2.4f, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ToolMaterials.COPPER, 7, -2.8f, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ToolMaterials.COPPER, 4, -1.8f, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ToolMaterials.COPPER, 3, -2.4f, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ToolMaterials.COPPER, 1, 0.5f, new Item.Properties()));

    //ARMOR
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
        () -> new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        
        public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
        () -> new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
        
        public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
        () -> new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        
        public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
        () -> new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    
    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
    }