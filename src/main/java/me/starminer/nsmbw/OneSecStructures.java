package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class OneSecStructures extends BukkitRunnable {

    Main plugin;

    public OneSecStructures(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        System.out.println("One Sec Loop Working");
        for(Player p : Bukkit.getOnlinePlayers()) {
            System.out.println("Player Scan Works");
            NSMBWII.Structuress(p);
        }
    }

    /*@Override
    public void run() {
            Player p = null;
            for(Player pl : Bukkit.getOnlinePlayers()) {
                p = pl.getPlayer();
            }
            assert p != null;
            MrPeterssBigBrain.isInTemple(p);
        }
    }.runTaskTimer((Plugin) this, 20L, 20L);

     */

}
