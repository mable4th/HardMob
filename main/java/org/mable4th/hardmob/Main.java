package org.mable4th.hardmob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.mable4th.hardmob.events.*;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new ZoomieSpawnEvent(), this);         //  *------------*
        Bukkit.getPluginManager().registerEvents(new SkeletSpawnEvent(), this);        //   *   Классы   *
        Bukkit.getPluginManager().registerEvents(new PiglinsSpawnEvent(), this);      //    *   Ивенты   *
        Bukkit.getPluginManager().registerEvents(new BrutePiglinSpawnEvent(), this); //     *____________*
        Bukkit.getPluginManager().registerEvents(new WitherSkeletonSpawnEvent(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[HardMob] " + ChatColor.GREEN + "Plugin is Enabled!");
    }

    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[HardMob] " + ChatColor.GREEN + "Plugin is Disable!");
    }

}
