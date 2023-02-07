package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {
    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent e) {
        Player p = e.getEntity().getPlayer();
        if(Main.running == 1) {
            NSMBWII.stopSound(p);
            assert p != null;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.miss master " + p.getName());
            NSMBWII.tTo0();
            NSMBWII.clToNull();
        }
    }
}
