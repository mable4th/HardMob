package org.mable4th.hardmob.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PiglinBrute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class BrutePiglinSpawnEvent implements Listener {

    int max1 = 100;

    @EventHandler
    public void onBrutePiglinEvent(EntitySpawnEvent event) {

        if (event.getEntity().getType() == EntityType.PIGLIN_BRUTE) {

            Random random = new Random();

            if (Math.abs(random.nextInt()) % max1 >= 90) {

                PiglinBrute piglinBrute = (PiglinBrute) event.getEntity();
                ItemStack itemStack = new ItemStack(Material.NETHERITE_AXE);


                piglinBrute.getEquipment().setItemInMainHand(itemStack);

            }

        }

    }

}
