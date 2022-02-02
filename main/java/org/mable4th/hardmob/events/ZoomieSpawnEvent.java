/*
 * DIAMOND_SWORD - Алмазный меч
 * DIAMOND_HELMET - Алмазный шлем
 * DIAMOND_CHESTPLATE - Алмазный нагрудник
 * DIAMOND_LEGGINGS - Алмазные поножи
 * DIAMOND_BOOTS - Алмазные ботинки
 */

package org.mable4th.hardmob.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ZoomieSpawnEvent implements Listener {

    int max1 = 100;

    @EventHandler
    public void onZombieSpawn(EntitySpawnEvent event) {
    if (event.getEntity().getType() == EntityType.ZOMBIE) {
        Random random = new Random();

            if (Math.abs(random.nextInt()) % max1 >= 90) {

                Zombie zombie = (Zombie) event.getEntity();


                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); //Шлем
                ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE); //Нагудник
                ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS); //Поножи
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS); //Ботинки

                zombie.getEquipment().setHelmet(helmet);
                zombie.getEquipment().setChestplate(chestplate);
                zombie.getEquipment().setLeggings(leggings);
                zombie.getEquipment().setBoots(boots);

            } else if (Math.abs(random.nextInt()) % max1 >= 80) {

                Zombie zombie = (Zombie) event.getEntity();


                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); //Шлем
                ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS); //Поножи
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS); //Ботинки

                zombie.getEquipment().setHelmet(helmet);
                zombie.getEquipment().setLeggings(leggings);
                zombie.getEquipment().setBoots(boots);

            } else if (Math.abs(random.nextInt()) % max1 >= 20 ) {

                Zombie zombie = (Zombie) event.getEntity();


                ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); //Шлем
                ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS); //Ботинки

                zombie.getEquipment().setHelmet(helmet);
                zombie.getEquipment().setBoots(boots);

            }

        }
    }

}
