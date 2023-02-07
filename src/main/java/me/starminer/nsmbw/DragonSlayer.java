package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;

public class DragonSlayer implements Listener {
    @EventHandler
    public static void onDragonKill(EntityDeathEvent e) {
        EntityType enderDragon = e.getEntityType();
        if(Main.running == 1) {
            if (EntityType.ENDER_DRAGON == enderDragon) {
                Player p = e.getEntity().getKiller();
                NSMBWII.stopSound(p);
            }
        }
    }
}
