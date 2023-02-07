package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DragonDeath implements Listener {
    @EventHandler
    public static void onDragonKill(EntityDeathEvent e) {
        EntityType enderDragon = e.getEntityType();

        Player p = e.getEntity().getKiller();

        if(EntityType.ENDER_DRAGON == enderDragon) {
            NSMBWII.dragonIsDead = true;
        }

    }
}
