package org.mable4th.hardmob.events;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockCanBuildEvent;

import java.util.Random;


public class RaidZombieBlock implements Listener {


    @EventHandler
    public void BlockBreakPlayer(BlockBreakEvent event) {


        Random random = new Random();
        Block block = event.getBlock();
        Material material = block.getType();
        Player player = event.getPlayer();


        if (material.equals(Material.GRASS_BLOCK)) {


        } else if (Math.abs(random.nextInt()) % 1000 == 631) {

            if (Math.abs(random.nextInt()) % 1000 == 327) {

                player.sendTitle(ChatColor.RED + "Орда зомби!", ChatColor.GREEN + "Попробуй не умереть!", 25, 20, 25);
                player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);

                for (int i = 0; i < 10; i++) {

                    player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
                }

            }

        }

    }

    @EventHandler
    public void BlockBuildPlayer (BlockCanBuildEvent event) {


        Random random = new Random();
        Player player = event.getPlayer();


        if (event.getMaterial().equals(Material.GRASS_BLOCK)) {


        } else if (Math.abs(random.nextInt()) % 1000 == 632) {

            if (Math.abs(random.nextInt()) % 1000 == 428) {

                player.sendTitle(ChatColor.RED + "Орда зомби!", ChatColor.GREEN + "Попробуй не умереть!", 25, 20, 25);

                for (int i = 0; i < 14; i++) {

                    player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
                }

            }

        }

    }

}
