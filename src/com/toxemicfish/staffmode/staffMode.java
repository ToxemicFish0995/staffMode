package com.toxemicfish.staffmode;

import org.bukkit.plugin.java.JavaPlugin;

public class staffMode extends JavaPlugin{

    private static staffMode instance;

    @Override
    public void onEnable() {

        instance = this;

        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    private void registerCommands() {
    }

    private void registerEvents() {
    }

    public static staffMode getInstance() {
        return instance;
    }

}
