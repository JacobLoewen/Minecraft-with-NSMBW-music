package me.starminer.nsmbw;

import net.minecraft.server.v1_16_R3.*;
import net.minecraft.server.v1_16_R3.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.*;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.craftbukkit.v1_16_R3.CraftChunk;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.Map;
import java.util.Objects;

public class MrPeterssBigBrain implements Listener{
    // b = Biome
    // l = Biome Player Is In
    // p = Player

    static String t = null;
    int c = 0;
    int y = 0;
    static int g = 0;
    int f = 0;
    int b = 0;
    int h = 0;
    int te = 0;

    @EventHandler
    public void onMovement(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        Biome l = p.getLocation().getBlock().getBiome();

        if (t == null) {
            t = "";
        }

        if (y == 0) {
            if (isAbove128(p)) {
                stopSound(p);
                y = 1;
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w7 master " + p.getName());
                t = "";
            }
        }
        if (c == 0) {
            if (isInCave(p)) {
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                c = 1;
                t = "";
            }
        }
        if (h == 0) {
            if (isBelow25(p)) {
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.vu master " + p.getName());
                h = 1;
                t = "";
            }
        }
        /*
        if (te == 0){
            BukkitTask RunnableTask = new BukkitRunnable(){

                @Override
                public void run() {
                    if(isInTemple(p)){
                        stopSound(p);
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.mg master " + p.getName());
                        te = 1;
                        t = "";
                    }
                }
            }.runTaskTimer((Plugin) this, 20L, 20L);
        }
        /*
         */

        /*
        if(f == 0){
            if(isInFortress){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ft master " + p.getName());
                t = "";
                f = 1;
            }
        }
        if(b == 0){
            if(isInBastion){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ca master " + p.getName());
                t = "";
                b = 1;
            }
        }

        if(!isInBastion) {
            if (!isInFortress) {
                if (!isInTemple) {
        */
        if (g != 1) {
            if (!isBelow25(p)) {
                if (!isAbove128(p)) {
                    if (!isInCave(p)) {
                        if ((!t.equals("sw")) && ((l == Biome.OCEAN) || (l == Biome.DEEP_OCEAN) || (l == Biome.WARM_OCEAN) || (l == Biome.LUKEWARM_OCEAN) ||
                                (l == Biome.COLD_OCEAN) || (l == Biome.DEEP_WARM_OCEAN) || (l == Biome.DEEP_LUKEWARM_OCEAN) || (l == Biome.DEEP_COLD_OCEAN) ||
                                (l == Biome.DEEP_FROZEN_OCEAN))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.sw master " + p.getName());
                            t = "sw";
                        } else if ((!t.equals("fo")) && ((l == Biome.TAIGA) || (l == Biome.TAIGA_HILLS) || (l == Biome.DARK_FOREST) || (l == Biome.GIANT_TREE_TAIGA) ||
                                (l == Biome.GIANT_TREE_TAIGA_HILLS) || (l == Biome.TAIGA_MOUNTAINS) || (l == Biome.DARK_FOREST_HILLS) || (l == Biome.GIANT_SPRUCE_TAIGA) ||
                                (l == Biome.GIANT_SPRUCE_TAIGA_HILLS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.fo master " + p.getName());
                            t = "fo";
                        } else if ((!t.equals("ov")) && ((l == Biome.FOREST) || (l == Biome.WOODED_HILLS) || (l == Biome.BIRCH_FOREST) || (l == Biome.BIRCH_FOREST_HILLS) ||
                                (l == Biome.FLOWER_FOREST) || (l == Biome.TALL_BIRCH_FOREST) || (l == Biome.TALL_BIRCH_HILLS) || (l == Biome.SHATTERED_SAVANNA) ||
                                (l == Biome.SHATTERED_SAVANNA_PLATEAU))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ov master " + p.getName());
                            t = "ov";
                        } else if ((!t.equals("w1")) && ((l == Biome.PLAINS) || (l == Biome.SAVANNA) || (l == Biome.SAVANNA_PLATEAU) || (l == Biome.SUNFLOWER_PLAINS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w1 master " + p.getName());
                            t = "w1";
                        } else if ((!t.equals("w2")) && ((l == Biome.DESERT) || (l == Biome.DESERT_HILLS) || (l == Biome.DESERT_LAKES))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w2 master " + p.getName());
                            t = "w2";
                        } else if ((!t.equals("w3")) && ((l == Biome.SNOWY_TUNDRA) || (l == Biome.SNOWY_MOUNTAINS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w3 master " + p.getName());
                            t = "w3";
                        } else if ((!t.equals("w4")) && ((l == Biome.SWAMP) || (l == Biome.SWAMP_HILLS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w4 master " + p.getName());
                            t = "w4";
                        } else if ((!t.equals("w5")) && ((l == Biome.JUNGLE) || (l == Biome.JUNGLE_HILLS) || (l == Biome.JUNGLE_EDGE) || (l == Biome.MODIFIED_JUNGLE) ||
                                (l == Biome.MODIFIED_JUNGLE_EDGE) || (l == Biome.BAMBOO_JUNGLE) || (l == Biome.BAMBOO_JUNGLE_HILLS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w5 master " + p.getName());
                            t = "w5";
                        } else if ((!t.equals("w6")) && ((l == Biome.MOUNTAINS) || (l == Biome.MOUNTAIN_EDGE) || (l == Biome.WOODED_MOUNTAINS) ||
                                (l == Biome.GRAVELLY_MOUNTAINS) || (l == Biome.MODIFIED_GRAVELLY_MOUNTAINS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w6 master " + p.getName());
                            t = "w6";
                        } else if ((!t.equals("w8")) && ((l == Biome.NETHER_WASTES) || (l == Biome.CRIMSON_FOREST) || (l == Biome.WARPED_FOREST))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w8 master " + p.getName());
                            t = "w8";
                        } else if ((!t.equals("w9")) && ((l == Biome.SMALL_END_ISLANDS) || (l == Biome.END_MIDLANDS) || (l == Biome.END_HIGHLANDS) ||
                                (l == Biome.END_BARRENS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w9 master " + p.getName());
                            t = "w9";
                        } else if ((!t.equals("sn")) && ((l == Biome.SNOWY_TAIGA) || (l == Biome.SNOWY_TAIGA_HILLS) || (l == Biome.SNOWY_TAIGA_MOUNTAINS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.sn master " + p.getName());
                            t = "sn";
                        } else if ((!t.equals("de")) && ((l == Biome.BADLANDS) || (l == Biome.WOODED_BADLANDS_PLATEAU) || (l == Biome.BADLANDS_PLATEAU) ||
                                (l == Biome.ERODED_BADLANDS) || (l == Biome.MODIFIED_WOODED_BADLANDS_PLATEAU) || (l == Biome.MODIFIED_BADLANDS_PLATEAU))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.de master " + p.getName());
                            t = "de";
                        } else if ((!t.equals("be")) && ((l == Biome.BEACH) || (l == Biome.STONE_SHORE) || (l == Biome.SNOWY_BEACH))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.be master " + p.getName());
                            t = "be";
                        } else if ((!t.equals("v")) && ((l == Biome.SOUL_SAND_VALLEY) || (l == Biome.BASALT_DELTAS))) {
                            stopSound(p);
                            setTo0(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.v master " + p.getName());
                            t = "v";
                        }
                    }
                }
            }
        }


    }

    public static void stopSound(Player p) {
        String up1 = "1up";
        String as = "as";
        String bce = "bce";
        String be = "be";
        String ca = "ca";
        String caa = "caa";
        String de = "de";
        String fbc = "fbc";
        String fo = "fo";
        String ft = "ft";
        String gh = "gh";
        String go = "go";
        String mg = "mg";
        String miss = "miss";
        String ov = "ov";
        String ppc = "ppc";
        String rfb = "rfb";
        String sn = "sn";
        String sw = "sw";
        String ug = "ug";
        String v = "v";
        String vu = "vu";
        String w1 = "w1";
        String w2 = "w2";
        String w3 = "w3";
        String w4 = "w4";
        String w5 = "w5";
        String w6 = "w6";
        String w7 = "w7";
        String w8 = "w8";
        String w9 = "w9";

        String[] music = {up1, as, bce, be, ca, caa, de, fbc, fo, ft, gh, go, mg, miss, ov, ppc, rfb, sn, sw, ug, v, vu, w1, w2, w3, w4, w5, w6, w7, w8, w9};

        for (int i = 0; i < music.length - 1; i++) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + music[i]);

        }
    }

    public boolean isInCave(Player p) {
        // This method checks if player is in cave
        for (int y = (int) p.getLocation().getY(); y < 128; y++) {
            Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) y, p.getLocation().getZ());

            if (location.getBlock().getType() == Material.STONE) {
                return true;
            } else if (location.getBlock().getType() == Material.DIRT) {
                return true;
            } else if (location.getBlock().getType() == Material.COARSE_DIRT) {
                return true;
            } else if (location.getBlock().getType() == Material.GRANITE) {
                return true;
            } else if (location.getBlock().getType() == Material.DIORITE) {
                return true;
            } else if (location.getBlock().getType() == Material.ANDESITE) {
                return true;
            } else if (location.getBlock().getType() == Material.COAL_ORE) {
                return true;
            } else if (location.getBlock().getType() == Material.IRON_ORE) {
                return true;
            } else if (location.getBlock().getType() == Material.GOLD_ORE) {
                return true;
            } else if (location.getBlock().getType() == Material.DIAMOND_ORE) {
                return true;
            } else if (location.getBlock().getType() == Material.EMERALD_ORE) {
                return true;
            } else if (location.getBlock().getType() == Material.REDSTONE_ORE) {
                return true;
            } else if (location.getBlock().getType() == Material.LAPIS_ORE) {
                return true;
            }
        }
        return false;
    }

    public boolean isAbove128(Player p) {
        //This method checks if player is above Y = 128!
        if (p.getLocation().getY() >= 128) {
            return true;
        }
        return false;
    }

    public boolean isBelow25(Player p) {
        //This method checks if player is below Y = 25 in the nether!
        if (p.getWorld().getEnvironment() == World.Environment.NETHER) {
            if (p.getLocation().getY() <= 25) {
                return true;
            }
        }

        return false;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        double h = Objects.requireNonNull(e.getEntity().getPlayer()).getHealth();

        Player p = e.getEntity().getPlayer();

        stopSound(p);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.miss master " + p.getName());
        t = "";
    }

    public void setTo0(Player p) {
        c = 0;
        y = 0;
        g = 0;
        f = 0;
        b = 0;
        h = 0;
        te = 0;
    }


    public static boolean isInTemple(Player p) {
        System.out.println("Scanning Working");

        Location loc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.DESERT_PYRAMID, 100, false);
        Biome l = p.getLocation().getBlock().getBiome();

        // when no structure is in their world which is a desert pyramid


        if (l == Biome.DESERT || l == Biome.DESERT_LAKES || l == Biome.DESERT_HILLS) {
            for (int x = (int) p.getLocation().getX() - 10; x < p.getLocation().getX() + 10; x++) {
                for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                    for (int z = (int) p.getLocation().getZ() - 10; z < p.getLocation().getZ() + 10; z++) {
                        Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                        if ((location.getBlock().getType() == Material.CHISELED_SANDSTONE) && (g == 0)) {
                            stopSound(p);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.mg master " + p.getName());
                            t = "";
                            g = 1;
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}



