package edu.byui.thecopperage.materials;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;

import java.util.EnumMap;
import java.util.function.Supplier;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.crafting.Ingredient;

public enum CopperArmorMaterials implements ArmorMaterial {
    COPPER("copper", 0, new int[]{2,4,5,2}, 12, () -> Ingredient.of(Items.COPPER_INGOT));

    private static final int[] durability = new int[]{134,200,195,165};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
        private static final EnumMap<ArmorItem.Type, Integer> DURABILITY_MAP = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 13);
        map.put(ArmorItem.Type.LEGGINGS, 15);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 11);
    });
    private final EnumMap<ArmorItem.Type, Integer> protectionAmountMap;

    CopperArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, Supplier<Ingredient> p_40481_Supplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.protectionAmountMap = new EnumMap<>(ArmorItem.Type.class);
        this.protectionAmountMap.put(ArmorItem.Type.BOOTS, slotProtections[EquipmentSlot.FEET.getIndex()]);
        this.protectionAmountMap.put(ArmorItem.Type.LEGGINGS, slotProtections[EquipmentSlot.LEGS.getIndex()]);
        this.protectionAmountMap.put(ArmorItem.Type.CHESTPLATE, slotProtections[EquipmentSlot.CHEST.getIndex()]);
        this.protectionAmountMap.put(ArmorItem.Type.HELMET, slotProtections[EquipmentSlot.HEAD.getIndex()]);
    }

    public int getDurabilityForType(ArmorItem.Type type) {
        return DURABILITY_MAP.get(type);
    }

    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmountMap.get(type);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return durability[p_40484_.getIndex()] + this.durabilityMultiplier;
    }
    
    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }
    
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }
    
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.COPPER_INGOT);
    }
    
    public String getName() {
        return this.name;
    }
    
    public float getToughness() {
        return 0;
    }
    
    public float getKnockbackResistance() {
        return 0;
    }
}
