package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class NSMBW implements Listener {

    int W1 = 0; int W2 = 0; int W3 = 0; int W4 = 0; int W5 = 0; int W6 = 0; int W7 = 0; int W8 = 0; int W9 = 0; int UG = 0; int AQ = 0; int W1L = 0; int W2L = 0; int W3L = 0; int W4L = 0; int W5L = 0; int W6L = 0; int W7L = 0; int W8L = 0;

    String track0 = "track0"; String track1 = "track1"; String track2 = "track2"; String track3 = "track3"; String track4 = "track4"; String track5 = "track5"; String track6 = "track6"; String track7 = "track7"; String track8 = "track8";

    @EventHandler
    public void Worlds(PlayerMoveEvent e) {
        int[] tracks = {UG, W1, W2, W3, W4, W5, W6, W7, W8, W9, AQ, W1L, W2L, W3L, W4L, W5L, W6L, W7L, W8L,};
        //              0    1   2   3   4  5   6    7   8   9  10   11   12   13   14   15  16   17   18

        String[] music = {track0, track1, track2, track3, track4, track5, track6, track7, track8};
        //                  0        1      2        3       4       5       6      7        8

        Player p = e.getPlayer();

        if ((p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.FOREST)) ||
                (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.BIRCH_FOREST_HILLS)) ||
                (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.BIRCH_FOREST)) ||
                (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.DARK_FOREST_HILLS)) ||
                (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.PLAINS))) {

            if (W1 == 0) {
                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W1 = 1;


                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track1 master " + p.getName());
            }
        }


        if ((p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.DESERT)) ||
                    (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.DESERT)) ||
                    (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.DESERT))) {
            if (W2 == 0) {
                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W2 = 1;

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track2 master " + p.getName());
            }
        }

        if (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.SNOWY_TAIGA)) {
            if (W3 == 0) {

                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W3 = 1;

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track3 master " + p.getName());
            }
        }

        if ((p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.BEACH)) ||
                (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.SWAMP))) {
            if (W4 == 0) {

                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W4 = 1;

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track4 master " + p.getName());
            }
        }
        if (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.JUNGLE)){
            if (W5 == 0) {

                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W5 = 1;

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track5 master " + p.getName());
            }
        }
        if (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.MOUNTAINS)){
            if (W6 == 0) {

                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W6 = 1;

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track6 master " + p.getName());
            }
        }



            if (p.getLocation().getY() >= 128) {
                if (W7 == 0) {

                    for (int i = 0; i < tracks.length; i++){
                        if (tracks[i] == 1){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                        }
                    }

                    W1 = 0;
                    W2 = 0;
                    W3 = 0;
                    W4 = 0;
                    W5 = 0;
                    W6 = 0;
                    W7 = 0;
                    W8 = 0;

                    W7 = 1;

                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track7 master " + p.getName());
                }
            }
            if(p.getLocation().getY() < 128) {
                if (W7 == 1) {
                    Arrays.fill(tracks, 0);
                }

            }


        if ((p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.NETHER_WASTES)) ||
           (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.CRIMSON_FOREST)) ||
           (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.WARPED_FOREST)) ||
           (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.BASALT_DELTAS)) ||
           (p.getWorld().getBiome(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ()).equals(Biome.SOUL_SAND_VALLEY))){
            if (W8 == 0) {

                for (int i = 0; i < tracks.length; i++){
                    if (tracks[i] == 1){
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);
                    }
                }

                W1 = 0;
                W2 = 0;
                W3 = 0;
                W4 = 0;
                W5 = 0;
                W6 = 0;
                W7 = 0;
                W8 = 0;

                W8 = 1;

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.track8 master " + p.getName());
            }
        }
    }
}

