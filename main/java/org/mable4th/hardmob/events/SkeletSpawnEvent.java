package org.mable4th.hardmob.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class SkeletSpawnEvent implements Listener {

    int max1 = 100;

    @EventHandler
    public void onSkeletEvent(EntitySpawnEvent event) {

        if (event.getEntity().getType() == EntityType.SKELETON) {

            Random random = new Random();

            if (Math.abs(random.nextInt()) % max1 >= 90) {

                Skeleton skeleton = (Skeleton) event.getEntity();

                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); //Шлем
                ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE); //Нагудник
                ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS); //Поножи
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS); //Ботинки

                skeleton.getEquipment().setHelmet(helmet);
                skeleton.getEquipment().setChestplate(chestplate);
                skeleton.getEquipment().setLeggings(leggings);
                skeleton.getEquipment().setBoots(boots);
            } else if (Math.abs(random.nextInt()) % max1 >= 80) {

                Skeleton skeleton = (Skeleton) event.getEntity();

                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); //Шлем
                ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS); //Поножи
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS); //Ботинки

                skeleton.getEquipment().setHelmet(helmet);
                skeleton.getEquipment().setLeggings(leggings);
                skeleton.getEquipment().setBoots(boots);

            } else if (Math.abs(random.nextInt()) % max1 >= 20 ) {

                Skeleton skeleton = (Skeleton) event.getEntity();

                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); //Шлем
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS); //Ботинки

                skeleton.getEquipment().setHelmet(helmet);
                skeleton.getEquipment().setBoots(boots);

            }

        }

    }


}
