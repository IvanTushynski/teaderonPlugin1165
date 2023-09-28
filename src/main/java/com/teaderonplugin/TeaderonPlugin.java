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
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p [\"\",{\"text\":\"\\u041c\\u041c\\u041e\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" R\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"OLE\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" P\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"LAY\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" G\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"AME\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" \\u0421\\u0415\\u0420\\u0412\\u0415\\u0420\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" \\u0422\\u0415\\u0410\\u0414\\u0415\\u0420\\u041e\\u041d\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"\\n\\u043f\\u043e\\u043f\\u044b\\u0442\\u043a\\u0430 \\u0432\\u043e\\u043f\\u043b\\u043e\\u0442\\u0438\\u0442\\u044c \\u043c\\u0435\\u0447\\u0442\\u0443 \\u0432 \\u0440\\u0435\\u0430\\u043b\\u044c\\u043d\\u043e\\u0441\\u0442\\u044c...\"}]");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"⬇ССЫЛКИ⬇\",\"color\":\"white\"}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p [\"\",{\"text\":\"DISCORD\",\"color\":\"blue\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://discord.gg/e7hFthYUjd\"}},{\"text\":\" -- \"},{\"text\":\"YOUTUBE\",\"color\":\"dark_red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.youtube.com/channel/UC2ZgZVuvdZO-uJ85EmDRc_w\"}},{\"text\":\" -- \"},{\"text\":\"TIK\",\"color\":\"black\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.tiktok.com/@teaderon.minecraft\"}},{\"text\":\"TOK\",\"color\":\"red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.tiktok.com/@teaderon.minecraft\"}},{\"text\":\" -- \"},{\"text\":\"VK\",\"color\":\"blue\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://vk.com/teaderon\"}}]");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p {\"text\":\"⬇ТЕКСТУРПАКИ⬇\",\"color\":\"white\"}");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @p [\"\",{\"text\":\"\\u0420\\u0415\\u0421\\u0423\\u0420\\u0421\\u041f\\u0410\\u041a\",\"color\":\"gold\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.dropbox.com/scl/fi/ewr42u01vtdavroestwhl/TEADERON.zip?rlkey=at7946w1dun712qke0zqhuael&dl=0\"}},{\"text\":\" HD\",\"color\":\"dark_red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.dropbox.com/scl/fi/ewr42u01vtdavroestwhl/TEADERON.zip?rlkey=at7946w1dun712qke0zqhuael&dl=0\"}},{\"text\":\" --\"},{\"text\":\" \",\"color\":\"gold\"},{\"text\":\"\\u0420\\u0415\\u0421\\u0423\\u0420\\u0421\\u041f\\u0410\\u041a \",\"color\":\"gold\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.dropbox.com/scl/fi/tfqeph7ycirpyzgp4q3ik/TEADERONLOW.zip?rlkey=qaettxlkbubdom2kdt1vt2gst&dl=0\"}},{\"text\":\"SD\",\"color\":\"dark_green\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.dropbox.com/scl/fi/tfqeph7ycirpyzgp4q3ik/TEADERONLOW.zip?rlkey=qaettxlkbubdom2kdt1vt2gst&dl=0\"}}]");

    }
    /*@EventHandler
    public void onCraft(CraftItemEvent craft){
        Player player = Bukkit.getPlayer(craft.getWhoClicked().getName());
        player.sendMessage(Color.RED + "Невозможно Создать!`");;
        if(craft.getRecipe().getResult().getType() == Material.CRAFTING_TABLE) {
            craft.setCancelled(true);
        }
    }*/
}
