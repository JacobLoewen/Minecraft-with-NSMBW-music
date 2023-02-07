package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class DragonResurrection implements Listener {
    @EventHandler
    public static void onDragonDeath(EntityResurrectEvent e) {
        EntityType enderDragon = e.getEntityType();

        if(EntityType.ENDER_DRAGON == enderDragon){
            NSMBWII.dragonIsDead = false;
        }
    }
}