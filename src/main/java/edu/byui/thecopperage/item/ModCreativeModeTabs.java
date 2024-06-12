package edu.byui.thecopperage.item;

import edu.byui.thecopperage.thecopperage;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = thecopperage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab COPPER_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        COPPER_TAB = event.registerCreativeModeTab(new ResourceLocation(thecopperage.MOD_ID, "copper_tab"),
        builder -> builder.icon(() -> new ItemStack(ModItems.COPPER_PICKAXE.get()))
        .title(Component.translatable("creativemodetab.copper_tab")));
    }
}
