package org.mable4th.hardmob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.mable4th.hardmob.events.ZoomieSpawnEvent;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new ZoomieSpawnEvent(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[HardMob] " + ChatColor.GREEN + "Plugin is Enabled!");
    }

    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[HardMob] " + ChatColor.GREEN + "Plugin is Disable!");
    }

}
