package com.yyzy.mc_test;

import com.yyzy.mc_test.registry.ModItemGroups;
import com.yyzy.mc_test.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MC_test implements ModInitializer {
    public static final String MOD_ID = "multi_tool_4in1";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello MC!");
        ModItemGroups.registerModItemGroups();
        ModItems.registerModItems();
        //TODO 暂时只能使用附魔书附魔
    }
}
