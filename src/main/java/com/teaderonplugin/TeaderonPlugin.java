package com.teaderonplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeaderonPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().clearRecipes();
        Bukkit.getPluginManager().registerEvents(new fallDamage(), this);
        Bukkit.getPluginManager().registerEvents(new AirLevel(), this);
        Bukkit.getPluginManager().registerEvents(new FoodLevel(), this);
        getServer().getPluginManager().registerEvents(this, this);
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
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"\\u0422\\u0415\\u0410\\u0414\\u0415\\u0420\\u041e\\u041d\",\"color\":\"dark_red\"}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"⬇ССЫЛКИ⬇\",\"color\":\"white\"}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"DISCORD\",\"color\":\"blue\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://discord.gg/e7hFthYUjd\"}}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p [\"\",{\"text\":\"TIK\",\"color\":\"black\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.tiktok.com/@teaderon.minecraft\"}},{\"text\":\"TOK\",\"color\":\"red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.tiktok.com/@teaderon.minecraft\"}}]");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"YOUTUBE\",\"color\":\"dark_red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.youtube.com/channel/UC2ZgZVuvdZO-uJ85EmDRc_w\"}}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"⬆ССЫЛКИ⬆\",\"color\":\"white\"}");

    }
}
