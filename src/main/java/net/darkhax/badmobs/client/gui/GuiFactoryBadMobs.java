package net.darkhax.badmobs.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class GuiFactoryBadMobs implements IModGuiFactory {
    
    public void initialize (Minecraft minecraftInstance) {
    
    }
    
    public Class<? extends GuiScreen> mainConfigGuiClass () {
    
        return GuiConfigBadMobs.class;
    }
    
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories () {
    
        return null;
    }
    
    public RuntimeOptionGuiHandler getHandlerFor (RuntimeOptionCategoryElement element) {
    
        return null;
    }
}