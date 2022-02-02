package org.mable4th.hardmob.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class PiglinsSpawnEvent implements Listener {

    int max1 = 100;

    @EventHandler
    public void onPiglinsEvent(EntitySpawnEvent event) {
        if (event.getEntity().getType() == EntityType.PIGLIN) {
            Random random = new Random();

            if (Math.abs(random.nextInt()) % max1 >= 95) {

                Piglin piglin = (Piglin) event.getEntity();


                ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET); //Шлем
                ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE); //Нагудник
                ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS); //Поножи
                ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS); //Ботинки

                piglin.getEquipment().setHelmet(helmet);
                piglin.getEquipment().setChestplate(chestplate);
                piglin.getEquipment().setLeggings(leggings);
                piglin.getEquipment().setBoots(boots);

            } else if (Math.abs(random.nextInt()) % max1 >= 80) {

                Piglin piglin = (Piglin) event.getEntity();


                ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE); //Нагудник

                piglin.getEquipment().setChestplate(chestplate);

            } else if (Math.abs(random.nextInt()) % max1 >= 20) {

                Piglin piglin = (Piglin) event.getEntity();

                ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET); //Шлем
                ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS); //Ботинки

                piglin.getEquipment().setHelmet(helmet);
                piglin.getEquipment().setBoots(boots);

            }

        }

    }

    @EventHandler
    public void onPiglinsEventSword(EntitySpawnEvent event) {

        Random random = new Random();

        if (event.getEntity().getType() == EntityType.PIGLIN) {


            if (Math.abs(random.nextInt()) % max1 >= 90) {

                Piglin piglin = (Piglin) event.getEntity();
                ItemStack itemStack = new ItemStack(Material.NETHERITE_SWORD); //Меч


                piglin.getEquipment().setItemInMainHand(itemStack);

            } else if (Math.abs(random.nextInt()) % max1 >= 60) {

                Piglin piglin = (Piglin) event.getEntity();
                ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD); //Меч


                piglin.getEquipment().setItemInMainHand(itemStack);

            }

        }

    }

}
