package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.Objects;

public final class Main extends JavaPlugin {
    static int running = 0;

    public void onEnable() {
        running = 0;
        // Plugin startup logic
        System.out.println("AY!");
        Objects.requireNonNull(getCommand("offline")).setExecutor(new StopIteration());
        new OneSec(this).runTaskTimer(this, 20L, 20L);
        Objects.requireNonNull(getCommand("lets_a_go")).setExecutor(new SoundIteration());
        Objects.requireNonNull(getCommand("soundstop")).setExecutor(new SoundStop());
        //Objects.requireNonNull(getCommand("pregame")).setExecutor(new Iteration());
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnTotem(), this);
        getServer().getPluginManager().registerEvents(new DragonSlayer(), this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}



//getServer().getPluginManager().registerEvents(new DragonSpawned(), this);
//getServer().getPluginManager().registerEvents(new DragonDeath(), this);
//getServer().getPluginManager().registerEvents(new DragonSpawned(), this);
//BukkitTask OneSecStructures = new OneSecStructures(this).runTaskTimer(this, 10L, 10L);
//getServer().getPluginManager().registerEvents(new DragonSpawned(), this);
//getServer().getPluginManager().registerEvents(new DragonSlayer(), this);