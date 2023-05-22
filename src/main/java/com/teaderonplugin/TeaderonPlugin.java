package com.teaderonplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeaderonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().clearRecipes();
        Bukkit.getPluginManager().registerEvents(new fallDamage(), this);
        Bukkit.getPluginManager().registerEvents(new AirLevel(), this);
        Bukkit.getPluginManager().registerEvents(new FoodLevel(), this);
        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
        this.getCommand("teaderonlottery").setExecutor(new Lottery());
        this.getCommand("chestopenfreavell").setExecutor(new ChestOpenFreavell());
        this.getCommand("chestopenromenna").setExecutor(new ChestOpenRomenna());
        this.getCommand("chestopenlinhir").setExecutor(new ChestOpenLinhir());
        this.getCommand("chestopentrakling").setExecutor(new ChestOpenTrakling());
        this.getCommand("chestopendolamrot").setExecutor(new ChestOpenDolamrot());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
