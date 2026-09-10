package com.remesthesia.template;

import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Template.init();
    }
}
