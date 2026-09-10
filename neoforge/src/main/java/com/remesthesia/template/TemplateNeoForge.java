package com.remesthesia.template;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Template.MOD_ID)
public class TemplateNeoForge {

    public TemplateNeoForge(IEventBus eventBus) {
        Template.init();
    }
}