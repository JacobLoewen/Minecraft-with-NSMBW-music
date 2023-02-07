package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnTotem implements Listener {
    @EventHandler
    public static void onTotemUsage(EntityResurrectEvent e) {
        for(Player p : Bukkit.getOnlinePlayers()) {
            EntityType entity = e.getEntityType();
            if(Main.running == 1) {
                if (entity == EntityType.PLAYER) {
                    assert p != null;
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.1up master " + p.getName());
                }
            }
        }

    }
}