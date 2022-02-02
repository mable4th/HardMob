package org.mable4th.hardmob.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;


public class WitherSkeletonSpawnEvent implements Listener {


    @EventHandler
    public void onWitherSkeletEvent (EntitySpawnEvent event) {

        if (event.getEntity().getType() == EntityType.WITHER_SKELETON) {

            WitherSkeleton witherSkeleton = (WitherSkeleton) event.getEntity();


            ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET); //Шлем

            witherSkeleton.getEquipment().setHelmet(helmet);

        }

    }

}
