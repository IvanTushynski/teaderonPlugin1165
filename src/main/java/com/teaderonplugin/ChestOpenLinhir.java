package com.teaderonplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChestOpenLinhir implements CommandExecutor {

    private void executeCommand4(Player p, boolean console, String cmd) {
        CommandSender sender = p;
        if (console) {
            sender = Bukkit.getServer().getConsoleSender();
        }

        Bukkit.getServer().dispatchCommand((CommandSender)sender, ChatColor.translateAlternateColorCodes('&', cmd.replaceAll("%player%", p.getName())));
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

            Player player = (Player)sender;
            int[] exp = new int[240];
            int check = (int)Math.floor(Math.random() * (double)exp.length);
            if (check >= 0 && check <= 20){
                this.executeCommand4(player, true, "mi give MISCELLANEOUS SILVER_COIN %player% 1");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "Серебрянная Монета!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 21 && check <= 40) {
                this.executeCommand4(player, true, "mi give MISCELLANEOUS BRONZE_COIN %player% 30");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "30 Бронзовых Монет!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 41 && check <= 60) {
                this.executeCommand4(player, true, "mi give CONSUMABLE FISH1 %player% 10");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "10 Окуней!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 61 && check <= 80) {
                this.executeCommand4(player, true, "mi give CONSUMABLE MEET3 %player% 16");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "16 Кусков сырого мяса!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 81 && check <= 100) {
                this.executeCommand4(player, true, "mi give CONSUMABLE MEET3 %player% 24");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "24 Кусков сырого мяса!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 101 && check <= 120) {
                this.executeCommand4(player, true, "mi give CONSUMABLE FISH1 %player% 20");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "20 Окуней!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 121 && check <= 140) {
                this.executeCommand4(player, true, "mi give CONSUMABLE PUMPKIN_SLICE1 %player% 10");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "10 Кусков Тыквы!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 141 && check <= 160) {
                this.executeCommand4(player, true, "mi give CONSUMABLE PUMPKIN_SLICE1 %player% 20");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "20 Кусков Тыквы!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 161 && check <= 180) {
                this.executeCommand4(player, true, "mi give MATERIAL ORE4 %player% 20");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "20 Кусков Кровавой Руды!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 181 && check <= 200) {
                this.executeCommand4(player, true, "mi give MATERIAL ORE4 %player% 30");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "30 Кусков Кровавой Руды!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 201 && check <= 220) {
                this.executeCommand4(player, true, "mi give MATERIAL LOG2 %player% 20");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "20 Еловых Брёвен!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            } else if (check >= 221 && check <= 240) {
                this.executeCommand4(player, true, "mi give MATERIAL LOG2 %player% 30");
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
                player.sendTitle(ChatColor.GOLD + "30 Еловых Брёвен!", ChatColor.RED + "Поздравляем", 2, 30, 2);
            }
        }
        return false;
    }


}
