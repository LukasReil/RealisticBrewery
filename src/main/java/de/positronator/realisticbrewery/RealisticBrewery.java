package de.positronator.realisticbrewery;

import de.positronator.realisticbrewery.modItems.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealisticBrewery implements ModInitializer {

    public static final String MOD_ID = "realisticbrewery";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
