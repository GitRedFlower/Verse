package net.redflower.verse.screen;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.screen.custom.AltarMenu;

public class VerseMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(Registries.MENU, VERSE.MODID);

    public static final DeferredHolder<MenuType<?>, MenuType<AltarMenu>> ALTAR_MENU = registerMenuType("altar_menu", AltarMenu::new);

    private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name, IContainerFactory<T> containerFactory) {
        return MENU_TYPES.register(name, () -> IMenuTypeExtension.create(containerFactory));
    }


    public static void register(IEventBus bus) {
        MENU_TYPES.register(bus);
    }
}
