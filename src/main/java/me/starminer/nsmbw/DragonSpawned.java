package me.starminer.nsmbw;
import org.bukkit.entity.*;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DragonSpawned implements Listener {
    @EventHandler
    public static void onDragonSpawn(EntitySpawnEvent e) {
        EntityType enderDragon = e.getEntityType();

        if(EntityType.ENDER_DRAGON == enderDragon) {
            NSMBWII.dragonIsDead = false;
        }

    }
}

// Player entity = e.getEntity().getKiller();