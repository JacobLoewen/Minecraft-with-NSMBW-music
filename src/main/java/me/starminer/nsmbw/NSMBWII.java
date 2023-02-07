package me.starminer.nsmbw;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.*;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NSMBWII implements Listener {

    static String t = null;
    static int c = 0;
    static int y = 0;
    static int g = 0;
    static int f = 0;
    static int b = 0;
    static int h = 0;
    static int te = 0;
    static int fort = 0;
    static int bast = 0;
    static int strong = 0;
    static int out = 0;
    static int man = 0;
    static int air = 0;
    static int city = 0;
    static int dr = 0;
    static int dead = 0;
    static int pr = 0;
    static boolean dragonIsDead = true;
    static public boolean isInFortress = false;
    static public Biome cl = null;
    static public Material daBlock = Material.LIGHT_GRAY_GLAZED_TERRACOTTA;
    static public Method current = null;
    static public int[] zero = {c, y, g, f, b, h, te, fort, bast, strong, out, man, air, city, dr, pr};
    static public int timeCounter = 0;
    static String up1 = "1up";
    static String as = "as";
    static String be = "be";
    static String ca = "ca";
    static String caa = "caa";
    static String de = "de";
    static String fbc = "fbc";
    static String fo = "fo";
    static String ft = "ft";
    static String gh = "gh";
    static String go = "go";
    static String mg = "mg";
    static String miss = "miss";
    static String ov = "ov";
    static String ppc = "ppc";
    static String rfb = "rfb";
    static String sn = "sn";
    static String sw = "sw";
    static String ug = "ug";
    static String v = "v";
    static String vu = "vu";
    static String w1 = "w1";
    static String w2 = "w2";
    static String w3 = "w3";
    static String w4 = "w4";
    static String w5 = "w5";
    static String w6 = "w6";
    static String w7 = "w7";
    static String w8 = "w8";
    static String w9 = "w9";
    static String ba = "ba";
    static String cab = "cab";
    static String[] music = {up1, as, be, ca, caa, de, fbc, fo, ft, gh, go, mg, miss, ov, ppc, rfb, sn, sw, ug, v, vu, w1, w2, w3, w4, w5, w6, w7, w8, w9, ba, cab};

    public static void onMovement(Player p) {


        Biome l = p.getLocation().getBlock().getBiome();

        if (t == null) {
            t = "";
        }

        if (cl == null) {
            if (l == Biome.RIVER) {
                cl = Biome.NETHER_WASTES;
            } else {
                cl = Biome.RIVER;
            }
        }
        if (!Structuress(p) && (cl != l) && !isDed(p)) {
            if (p.getWorld().getEnvironment() == World.Environment.NORMAL && !Structuress(p)) {
                if ((!t.equals("sw")) && ((l == Biome.OCEAN) || (l == Biome.DEEP_OCEAN) || (l == Biome.WARM_OCEAN) || (l == Biome.LUKEWARM_OCEAN) ||
                        (l == Biome.COLD_OCEAN) || (l == Biome.DEEP_WARM_OCEAN) || (l == Biome.DEEP_LUKEWARM_OCEAN) || (l == Biome.DEEP_COLD_OCEAN) ||
                        (l == Biome.DEEP_FROZEN_OCEAN))) {
                    int waterBlocks = 0;
                    for (int yloc = 62; yloc > 51; yloc--) {
                        Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) yloc, p.getLocation().getZ());
                        Material locationO = location.getBlock().getType();
                        if (locationO == Material.WATER) {
                            waterBlocks++;
                        }
                    }
                    if (waterBlocks >= 10) {
                        stopSound(p);
                        setTo0(p);
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.sw master " + p.getName());
                        t = "sw";
                        cl = l;
                    }
                } else if ((!t.equals("fo")) && ((l == Biome.DARK_FOREST) || (l == Biome.GIANT_TREE_TAIGA) ||
                        (l == Biome.GIANT_TREE_TAIGA_HILLS) || (l == Biome.TAIGA_MOUNTAINS) || (l == Biome.DARK_FOREST_HILLS) || (l == Biome.GIANT_SPRUCE_TAIGA) ||
                        (l == Biome.GIANT_SPRUCE_TAIGA_HILLS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.fo master " + p.getName());
                    t = "fo";
                    cl = l;
                } else if ((!t.equals("ov")) && ((l == Biome.FOREST) || (l == Biome.WOODED_HILLS) || (l == Biome.BIRCH_FOREST) || (l == Biome.BIRCH_FOREST_HILLS) ||
                        (l == Biome.FLOWER_FOREST) || (l == Biome.TALL_BIRCH_FOREST) || (l == Biome.TALL_BIRCH_HILLS) || (l == Biome.SHATTERED_SAVANNA) ||
                        (l == Biome.SHATTERED_SAVANNA_PLATEAU) || (l == Biome.TAIGA) || (l == Biome.TAIGA_HILLS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ov master " + p.getName());
                    t = "ov";
                    cl = l;
                } else if ((!t.equals("w1")) && ((l == Biome.PLAINS) || (l == Biome.SAVANNA) || (l == Biome.SAVANNA_PLATEAU) || (l == Biome.SUNFLOWER_PLAINS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w1 master " + p.getName());
                    t = "w1";
                    cl = l;
                } else if ((!t.equals("w2")) && ((l == Biome.DESERT) || (l == Biome.DESERT_HILLS) || (l == Biome.DESERT_LAKES))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w2 master " + p.getName());
                    t = "w2";
                    cl = l;
                } else if ((!t.equals("w3")) && ((l == Biome.SNOWY_TUNDRA) || (l == Biome.SNOWY_MOUNTAINS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w3 master " + p.getName());
                    t = "w3";
                    cl = l;
                } else if ((!t.equals("w4")) && ((l == Biome.SWAMP) || (l == Biome.SWAMP_HILLS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w4 master " + p.getName());
                    t = "w4";
                    cl = l;
                } else if ((!t.equals("w5")) && ((l == Biome.JUNGLE) || (l == Biome.JUNGLE_HILLS) || (l == Biome.JUNGLE_EDGE) || (l == Biome.MODIFIED_JUNGLE) ||
                        (l == Biome.MODIFIED_JUNGLE_EDGE) || (l == Biome.BAMBOO_JUNGLE) || (l == Biome.BAMBOO_JUNGLE_HILLS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w5 master " + p.getName());
                    t = "w5";
                    cl = l;
                } else if ((!t.equals("w6")) && ((l == Biome.MOUNTAINS) || (l == Biome.MOUNTAIN_EDGE) || (l == Biome.WOODED_MOUNTAINS) ||
                        (l == Biome.GRAVELLY_MOUNTAINS) || (l == Biome.MODIFIED_GRAVELLY_MOUNTAINS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w6 master " + p.getName());
                    t = "w6";
                    cl = l;
                } else if ((!t.equals("sn")) && ((l == Biome.SNOWY_TAIGA) || (l == Biome.SNOWY_TAIGA_HILLS) || (l == Biome.SNOWY_TAIGA_MOUNTAINS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.sn master " + p.getName());
                    t = "sn";
                    cl = l;
                } else if ((!t.equals("de")) && ((l == Biome.BADLANDS) || (l == Biome.WOODED_BADLANDS_PLATEAU) || (l == Biome.BADLANDS_PLATEAU) ||
                        (l == Biome.ERODED_BADLANDS) || (l == Biome.MODIFIED_WOODED_BADLANDS_PLATEAU) || (l == Biome.MODIFIED_BADLANDS_PLATEAU))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.de master " + p.getName());
                    t = "de";
                    cl = l;
                } else if ((!t.equals("be")) && ((l == Biome.BEACH) || (l == Biome.STONE_SHORE) || (l == Biome.SNOWY_BEACH))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.be master " + p.getName());
                    t = "be";
                    cl = l;
                } else if ((!t.equals("ppc")) && ((l == Biome.MUSHROOM_FIELD_SHORE) || (l == Biome.MUSHROOM_FIELDS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ppc master " + p.getName());
                    t = "ppc";
                    cl = l;
                }
            }

            if (p.getWorld().getEnvironment() == World.Environment.NETHER) {
                if ((!t.equals("w8")) && ((l == Biome.NETHER_WASTES) || (l == Biome.CRIMSON_FOREST) || (l == Biome.WARPED_FOREST))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w8 master " + p.getName());
                    t = "w8";
                    cl = l;
                }
                else if ((!t.equals("v")) && ((l == Biome.BASALT_DELTAS))){
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.v master " + p.getName());
                    t = "v";
                    cl = l;
                }
                else if ((!t.equals("vu")) && ((l == Biome.SOUL_SAND_VALLEY))){
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.vu master " + p.getName());
                    t = "vu";
                    cl = l;
                }
            }

            if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
                /*
                int playerX1 = (int) p.getLocation().getX();
                int playerZ1 = (int) p.getLocation().getZ();
                if (400 >= playerX1 && playerX1 >= -400) {
                    if (400 >= playerZ1 && playerZ1 >= -400) {
                        System.out.println("END: DRAGON DEAD: " + p.getWorld().getEnderDragonBattle().getEnderDragon());
                        if (p.getWorld().getEnderDragonBattle().getEnderDragon() == null) {
                            stopSound(p);
                        }
                    }
                }

                 */
                if ((!t.equals("rfb")) && ((l == Biome.THE_END))) {
                    int playerX2 = (int) p.getLocation().getX();
                    int playerZ2 = (int) p.getLocation().getZ();
                    if (400 >= playerX2 && playerX2 >= -400) {
                        if (400 >= playerZ2 && playerZ2 >= -400) {
                            if(p.getWorld().getEnderDragonBattle().getEnderDragon() != null) {
                                System.out.println("END: EnderDragon Is Dead: " + dragonIsDead);
                                stopSound(p);
                                setTo0(p);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.rfb master " + p.getName());
                                t = "rfb";
                            }
                        }
                    }
                } else if ((!t.equals("w9")) && ((l == Biome.SMALL_END_ISLANDS) || (l == Biome.END_MIDLANDS) || (l == Biome.END_HIGHLANDS) ||
                        (l == Biome.END_BARRENS))) {
                    stopSound(p);
                    setTo0(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w9 master " + p.getName());
                    t = "w9";
                }
            }
        }
    }

    public static boolean isDed(Player p) {
        return p.isDead();
    }

    public static void tTo0() {
        t = "";
    }

    public static void clToNull() {
        cl = null;
    }

    public static void stopSound(Player p) {
        String up1 = "1up";
        String as = "as";
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
        String ba = "ba";
        String cab = "cab";

        String[] music = {up1, as, be, ca, caa, de, fbc, fo, ft, gh, go, mg, miss, ov, ppc, rfb, sn, sw, ug, v, vu, w1, w2, w3, w4, w5, w6, w7, w8, w9, ba, cab};

        for (String s : music) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run stopsound " + p.getName() + " master " + "minecraft:world." + s);
        }
    }

    public static boolean isInCaveOO(Player p) {
        // This method checks if player is in cave
        for (int y = (int) p.getLocation().getY() + 1; y < 200; y++) {
            Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) y, p.getLocation().getZ());

            if (location.getBlock().getType() != Material.AIR || location.getBlock().getType() != Material.CAVE_AIR || location.getBlock().getType() != Material.VOID_AIR) {
                if (location.getBlock().getType() == Material.STONE) {
                    return true;
                } else if (location.getBlock().getType() == Material.DIRT) {
                    return true;
                } else if (location.getBlock().getType() == Material.COBBLESTONE) {
                    return true;
                } else if (location.getBlock().getType() == Material.COARSE_DIRT) {
                    return true;
                } else if (location.getBlock().getType() == Material.GRASS_BLOCK) {
                    return true;
                } else if (location.getBlock().getType() == Material.MYCELIUM) {
                    return true;
                } else if (location.getBlock().getType() == Material.COARSE_DIRT) {
                    return true;
                } else if (location.getBlock().getType() == Material.PODZOL) {
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
        }
        return false;
    }

    public static boolean isAbove128O(Player p) {
        //This method checks if player is above Y = 128!
        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
            return p.getLocation().getY() >= 128;
        }
        return false;
    }

    public static boolean isBelow25O(Player p) {
        //This method checks if player is below Y = 25 in the nether!
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();



        if (p.getWorld().getEnvironment() == World.Environment.NETHER && !t.equals("vu")) {
            return p.getLocation().getY() <= 25;
        }

        return false;
    }

    //DONE
    public static boolean isInTempleO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();
        int templeCounter = 0;
        for (int x = (int) p.getLocation().getX() - 10; x < p.getLocation().getX() + 10; x++) {
            for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                for (int z = (int) p.getLocation().getZ() - 10; z < p.getLocation().getZ() + 10; z++) {
                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                    if (location.getBlock().getType() == Material.CHISELED_SANDSTONE) {
                        if (biome == Biome.DESERT || biome == Biome.DESERT_HILLS || biome == Biome.DESERT_LAKES) {
                            templeCounter++;
                        }
                    }
                }
            }
        }
        if (templeCounter >= 1) {
            Location temple = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.DESERT_PYRAMID, 100, false);
            assert temple != null;
            int templeX = temple.getChunk().getX();
            int templeZ = temple.getChunk().getZ();
            if (templeX + 2 >= pChunkX && pChunkX >= templeX - 2) {
                return templeZ + 2 >= pChunkZ && pChunkZ >= templeZ - 2;
            }
        }
        return false;
    }

    public static boolean isInMansionO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();
        int mansionCounter = 0;
        if (environment == World.Environment.NORMAL) {
            for (int yloc = (int) p.getLocation().getY() + 1; yloc > p.getLocation().getY() - 20; yloc--) {
                System.out.println("1");
                System.out.println("STR: BEGIN ITERATION");
                Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) yloc, p.getLocation().getZ());
                Material locationO1 = location.getBlock().getType();
                System.out.println("2");
                if (locationO1 == Material.BIRCH_PLANKS || locationO1 == Material.SPRUCE_PLANKS || locationO1 == Material.COBBLESTONE) {
                    System.out.println("STR: Mansion Counter++");
                    mansionCounter++;

                }
            }
        }
        if (mansionCounter >= 1) {
            System.out.println("3");
            for (int ylocM = (int) p.getLocation().getY(); ylocM < p.getLocation().getY() + 25; ylocM++) {
                Location locationM = new Location(p.getWorld(), p.getLocation().getX(), (double) ylocM, p.getLocation().getZ());
                Material locationO = locationM.getBlock().getType();
                if (locationO != Material.AIR && locationO != Material.CAVE_AIR && locationO != Material.VOID_AIR) {
                    if (locationO == Material.BIRCH_PLANKS || locationO == Material.DARK_OAK_PLANKS || locationO == Material.COBBLESTONE) {
                        System.out.println("4");
                        int mCounter = 0;
                        for (int x = (int) p.getLocation().getX() - 20; x < p.getLocation().getX() + 20; x++) {
                            for (int y = (int) p.getLocation().getY() - 20; y < p.getLocation().getY() + 20; y++) {
                                for (int z = (int) p.getLocation().getZ() - 20; z < p.getLocation().getZ() + 20; z++) {
                                    Location locationMa = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                    if (locationMa.getBlock().getType() == Material.DARK_OAK_PLANKS || locationMa.getBlock().getType() == Material.RED_CARPET || locationMa.getBlock().getType() == Material.BIRCH_PLANKS || locationMa.getBlock().getType() == Material.WHITE_CARPET) {
                                        mCounter++;
                                    }
                                }
                            }
                        }
                        System.out.println(mCounter);
                        if (mCounter >= 1000) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    //DONE
    public static boolean isInStrongholdO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();

        if (environment == World.Environment.NORMAL) {

            int strongholdCounter = 0;
            int strongholdCounter2 = 0;
            for (int sx = (int) p.getLocation().getX() - 5; sx < p.getLocation().getX() + 5; sx++) {
                for (int sy = (int) p.getLocation().getY() - 10; sy < p.getLocation().getY() + 10; sy++) {
                    for (int sz = (int) p.getLocation().getZ() - 5; sz < p.getLocation().getZ() + 5; sz++) {
                        Location strLocation = new Location(p.getWorld(), (double) sx, (double) sy, (double) sz);
                        if (strLocation.getBlock().getType() == Material.INFESTED_STONE_BRICKS || strLocation.getBlock().getType() == Material.STONE_BRICKS || strLocation.getBlock().getType() == Material.INFESTED_CRACKED_STONE_BRICKS ||
                                strLocation.getBlock().getType() == Material.INFESTED_MOSSY_STONE_BRICKS || strLocation.getBlock().getType() == Material.MOSSY_STONE_BRICKS ||
                                strLocation.getBlock().getType() == Material.CRACKED_STONE_BRICKS || strLocation.getBlock().getType() == Material.BOOKSHELF) {
                            strongholdCounter++;
                        }
                    }
                }
            }
            for (int sx = (int) p.getLocation().getX() - 2; sx < p.getLocation().getX() + 2; sx++) {
                for (int sy = (int) p.getLocation().getY() - 5; sy < p.getLocation().getY() + 5; sy++) {
                    for (int sz = (int) p.getLocation().getZ() - 2; sz < p.getLocation().getZ() + 2; sz++) {
                        Location strLocation = new Location(p.getWorld(), (double) sx, (double) sy, (double) sz);
                        if (strLocation.getBlock().getType() == Material.INFESTED_STONE_BRICKS || strLocation.getBlock().getType() == Material.STONE_BRICKS || strLocation.getBlock().getType() == Material.INFESTED_CRACKED_STONE_BRICKS ||
                                strLocation.getBlock().getType() == Material.INFESTED_MOSSY_STONE_BRICKS || strLocation.getBlock().getType() == Material.MOSSY_STONE_BRICKS ||
                                strLocation.getBlock().getType() == Material.CRACKED_STONE_BRICKS || strLocation.getBlock().getType() == Material.BOOKSHELF) {
                            strongholdCounter2++;
                        }
                    }
                }
            }

            if (strongholdCounter >= 5 && strongholdCounter2 >= 1) {
                Location stronghold = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.STRONGHOLD, 100, false);
                assert stronghold != null;
                int strongholdX = stronghold.getChunk().getX();
                int strongholdZ = stronghold.getChunk().getZ();
                if (strongholdX + 8 >= pChunkX && pChunkX >= strongholdX - 8) {
                    return strongholdZ + 8 >= pChunkZ && pChunkZ >= strongholdZ - 8;
                }
            }
        }


        return false;
    }

    //DONE
    public static boolean isInOutpostO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();

        if (environment == World.Environment.NORMAL) {
            Location outpost = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.PILLAGER_OUTPOST, 100, false);
            assert outpost != null;
            int outpostX = outpost.getChunk().getX();
            int outpostZ = outpost.getChunk().getZ();
            int outpostCounter = 0;
            if (outpostX + 1 >= pChunkX && pChunkX >= outpostX - 1) {
                if (outpostZ + 1 >= pChunkZ && pChunkZ >= outpostZ - 1) {
                    for (int x = (int) p.getLocation().getX() - 1; x < p.getLocation().getX() + 1; x++) {
                        for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                            for (int z = (int) p.getLocation().getZ() - 1; z < p.getLocation().getZ() + 1; z++) {
                                Material materialScan = p.getWorld().getBlockAt((int) x, (int) y, (int) z).getType();
                                if (materialScan == Material.BIRCH_PLANKS) {
                                    outpostCounter++;
                                }
                            }
                        }
                    }
                    return outpostCounter >= 1;
                }
            }
        }
        return false;
    }

    //DONE
    public static boolean isInFortressO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();

        int fortressCounter = 0;
        int bastionCounter = 0;
        for (int nx = (int) p.getLocation().getX() - 1; nx < p.getLocation().getX() + 1; nx++) {
            for (int ny = (int) p.getLocation().getY() - 10; ny < p.getLocation().getY() + 10; ny++) {
                for (int nz = (int) p.getLocation().getZ() - 1; nz < p.getLocation().getZ() + 1; nz++) {
                    Material nmaterialScan = p.getWorld().getBlockAt((int) nx, (int) ny, (int) nz).getType();
                    if (nmaterialScan == Material.NETHER_BRICKS) {
                        fortressCounter++;
                    }
                }
            }
        }

        if (fortressCounter >= 1) {
            Location fortress = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.NETHER_FORTRESS, 100, false);
            assert fortress != null;
            int fortressX = fortress.getChunk().getX();
            int fortressZ = fortress.getChunk().getZ();

            System.out.println();

            if (fortressX + 8 >= pChunkX && pChunkX >= fortressX - 8) {
                return fortressZ + 8 >= pChunkZ && pChunkZ >= fortressZ - 8;
            }
        }
        return false;
    }

    //DONE
    public static boolean isInBastionO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        int bastionCounter = 0;

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();

        for (int bx = (int) p.getLocation().getX() - 15; bx < p.getLocation().getX() + 15; bx++) {
            for (int by = (int) p.getLocation().getY() - 15; by < p.getLocation().getY() + 15; by++) {
                for (int bz = (int) p.getLocation().getZ() - 15; bz < p.getLocation().getZ() + 15; bz++) {
                    Material nmaterialScan = p.getWorld().getBlockAt((int) bx, (int) by, (int) bz).getType();
                    if ((nmaterialScan == Material.BLACKSTONE_SLAB || nmaterialScan == Material.BLACKSTONE_WALL || nmaterialScan == Material.BLACKSTONE_STAIRS ||
                            nmaterialScan == Material.POLISHED_BLACKSTONE_BRICKS || nmaterialScan == Material.POLISHED_BLACKSTONE_BRICK_STAIRS ||
                            nmaterialScan == Material.CRACKED_POLISHED_BLACKSTONE_BRICKS || nmaterialScan == Material.CHISELED_POLISHED_BLACKSTONE)) {
                        bastionCounter++;
                    }
                }
            }
        }

        if (bastionCounter >= 1) {
            System.out.println("STR: BASTION COUNTER IS HIGHER THAN 1");
            Location bastion = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.BASTION_REMNANT, 100, false);
            assert bastion != null;
            int bastionX = bastion.getChunk().getX();
            System.out.println(bastionX);
            int bastionZ = bastion.getChunk().getZ();
            System.out.println(bastionZ);

            if (bastionX + 8 >= pChunkX && pChunkX >= bastionX - 8) {
                return bastionZ + 8 >= pChunkZ && pChunkZ >= bastionZ - 8;
            }
        }
        return false;
    }

    //DONE
    public static boolean isInAirshipO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();

        int airshipCounter = 0;
        int obsidianCounter = 0;
        for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
            for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                    if (location.getBlock().getType() == Material.PURPUR_BLOCK || location.getBlock().getType() == Material.PURPUR_PILLAR) {
                        airshipCounter++;
                    }
                }
            }
        }
        for (int x2 = (int) p.getLocation().getX() - 12; x2 < p.getLocation().getX() + 12; x2++) {
            for (int y2 = (int) p.getLocation().getY() - 25; y2 < p.getLocation().getY() + 12; y2++) {
                for (int z2 = (int) p.getLocation().getZ() - 12; z2 < p.getLocation().getZ() + 12; z2++) {
                    Location location2 = new Location(p.getWorld(), (double) x2, (double) y2, (double) z2);
                    if (location2.getBlock().getType() == Material.OBSIDIAN) {
                        obsidianCounter++;
                    }
                }
            }
        }

        if (airshipCounter >= 1 && obsidianCounter >= 1) {
            Location city = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);
            assert city != null;
            int cityX = city.getChunk().getX();
            int cityZ = city.getChunk().getZ();
            if (cityX + 8 >= pChunkX && pChunkX >= cityX - 8) {
                return cityZ + 8 >= pChunkZ && pChunkZ >= cityZ - 8;
            }
        }
        return false;
    }

    //DONE
    public static boolean isInCityO(Player p) {
        Chunk chunkScanner = p.getLocation().getChunk();

        int cityCounter = 0;

        Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
        int pChunkX = pChunk.getX();
        int pChunkZ = pChunk.getZ();
        World.Environment environment = p.getWorld().getEnvironment();
        Biome biome = p.getLocation().getBlock().getBiome();

        for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
            for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                    if (location.getBlock().getType() == Material.PURPUR_BLOCK) {
                        cityCounter++;
                    }
                }
            }
        }

        if (cityCounter >= 1) {
            Location endCity = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);
            assert endCity != null;
            int cityX = endCity.getChunk().getX();
            int cityZ = endCity.getChunk().getZ();
            if (cityX + 4 >= pChunkX && pChunkX >= cityX - 4) {
                if (cityZ + 4 >= pChunkZ && pChunkZ >= cityZ - 4) {
                    System.out.println("STR: ENDCITY FOUND!");
                    if (city == 0) {
                        stopSound(p);
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.cab master " + p.getName());
                        t = "";
                        setTo0(p);
                        city = 1;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean intChecker(Player p) {
        //int[] zero = {c, y, g, f, b, h, te, fort, bast, strong, out, man, air, city, dr, pr};

        for (int z : zero) {
            if (z != 0) {
                return false;
            }
        }
        return true;
    }

    public static void setTo0(Player p) {
        c = 0;
        y = 0;
        g = 0;
        f = 0;
        b = 0;
        h = 0;
        te = 0;
        fort = 0;
        bast = 0;
        strong = 0;
        out = 0;
        man = 0;
        air = 0;
        city = 0;
        cl = Biome.RIVER;
        dr = 0;
        pr = 0;
    }

    public static boolean structureCheck(Player p) {
        if (g == 1) {
            if (!isInTempleO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (strong == 1) {
            if (!isInStrongholdO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (out == 1) {
            if (!isInOutpostO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (fort == 1) {
            if (!isInFortressO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (bast == 1) {
            if (!isInBastionO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (man == 1) {
            if (!isInMansionO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (air == 1) {
            if (!isInAirshipO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (city == 1) {
            if (!isInCityO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (y == 1) {
            if ((!isAbove128O(p))) {
                setTo0(p);
                return false;
            }
        }
        if (c == 1) {
            if (!isInCaveOO(p)) {
                setTo0(p);
                return false;
            }
        }
        if (h == 1) {
            if (!isBelow25O(p)) {
                setTo0(p);
                return false;
            }
        }
        return true;
    }

    public static boolean Structuress(Player p) {
        /*
        for (int yloc = (int) p.getLocation().getY() + 1; yloc > 1; yloc--) {
            System.out.println("STR: BEGIN ITERATION");
            Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) yloc, p.getLocation().getZ());
            Material locationO = location.getBlock().getType();
            if (locationO != Material.AIR && locationO != Material.CAVE_AIR && locationO != Material.VOID_AIR) {
                System.out.println("STR: BROKEN");
                System.out.println("STR daBlock: " + locationO);
            }
        }
        */

        if (structureCheck(p)) {

            if (isAbove128O(p)) {
                if(y == 0) {
                    stopSound(p);
                    setTo0(p);
                    y = 1;
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w7 master " + p.getName());
                    t = "";
                }
                return true;
            }

            else if (isBelow25O(p)) {
                if(h == 0) {
                    stopSound(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.vu master " + p.getName());
                    setTo0(p);
                    h = 1;
                    t = "";
                }
                return true;
            }

            if (!isAbove128O(p)) {
                if (!isBelow25O(p)) {

                    System.out.println("STR: Operating...");
                    Chunk chunkScanner = p.getLocation().getChunk();

                    Chunk pChunk = p.getWorld().getChunkAt(chunkScanner.getX(), chunkScanner.getZ());
                    int pChunkX = pChunk.getX();
                    int pChunkZ = pChunk.getZ();
                    //pChunk gets you the numbers of the player's chunk
                    System.out.println("STR: Achieved Player Chunk");
                    int mansionCounter = 0;
                    int testCounter = 0;
                    int templeCounter = 0;

                    World.Environment environment = p.getWorld().getEnvironment();
                    Biome biome = p.getLocation().getBlock().getBiome();

                    for (int yloc = (int) p.getLocation().getY() + 1; yloc > 1; yloc--) {
                        Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) yloc, p.getLocation().getZ());
                        Material locationO = location.getBlock().getType();
                        if (locationO != Material.AIR && locationO != Material.CAVE_AIR && locationO != Material.VOID_AIR) {
                            daBlock = locationO;
                            System.out.println("STR: BROKEN");
                            System.out.println("STR daBlock: " + daBlock);
                            break;
                        }
                    }

                    for (int x = (int) p.getLocation().getX() - 20; x < p.getLocation().getX() + 20; x++) {
                        for (int y = (int) p.getLocation().getY() - 20; y < p.getLocation().getY() + 20; y++) {
                            for (int z = (int) p.getLocation().getZ() - 20; z < p.getLocation().getZ() + 20; z++) {
                                Location locationMa = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                if (locationMa.getBlock().getType() == Material.SPRUCE_PLANKS || locationMa.getBlock().getType() == Material.RED_CARPET || locationMa.getBlock().getType() == Material.BIRCH_PLANKS || locationMa.getBlock().getType() == Material.WHITE_CARPET) {
                                    testCounter++;
                                }
                            }
                        }
                    }
                    System.out.println(testCounter);

                    //Extra Outpost Code

                    System.out.println("STR: Being Scanning Overworld");
                    if (environment == World.Environment.NORMAL) {
                        Location outpost = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.PILLAGER_OUTPOST, 100, false);
                        assert outpost != null;
                        int outpostX = outpost.getChunk().getX();
                        int outpostZ = outpost.getChunk().getZ();
                        //Extra Stronghold Code
                        int strongholdCounter = 0;
                        int strongholdCounter2 = 0;
                        for (int sx = (int) p.getLocation().getX() - 5; sx < p.getLocation().getX() + 5; sx++) {
                            for (int sy = (int) p.getLocation().getY() - 10; sy < p.getLocation().getY() + 10; sy++) {
                                for (int sz = (int) p.getLocation().getZ() - 5; sz < p.getLocation().getZ() + 5; sz++) {
                                    Location strLocation = new Location(p.getWorld(), (double) sx, (double) sy, (double) sz);
                                    if (strLocation.getBlock().getType() == Material.INFESTED_STONE_BRICKS || strLocation.getBlock().getType() == Material.STONE_BRICKS || strLocation.getBlock().getType() == Material.INFESTED_CRACKED_STONE_BRICKS ||
                                            strLocation.getBlock().getType() == Material.INFESTED_MOSSY_STONE_BRICKS || strLocation.getBlock().getType() == Material.MOSSY_STONE_BRICKS ||
                                            strLocation.getBlock().getType() == Material.CRACKED_STONE_BRICKS || strLocation.getBlock().getType() == Material.BOOKSHELF) {
                                        strongholdCounter++;
                                    }
                                }
                            }
                        }
                        for (int sx = (int) p.getLocation().getX() - 2; sx < p.getLocation().getX() + 2; sx++) {
                            for (int sy = (int) p.getLocation().getY() - 5; sy < p.getLocation().getY() + 5; sy++) {
                                for (int sz = (int) p.getLocation().getZ() - 2; sz < p.getLocation().getZ() + 2; sz++) {
                                    Location strLocation = new Location(p.getWorld(), (double) sx, (double) sy, (double) sz);
                                    if (strLocation.getBlock().getType() == Material.INFESTED_STONE_BRICKS || strLocation.getBlock().getType() == Material.STONE_BRICKS || strLocation.getBlock().getType() == Material.INFESTED_CRACKED_STONE_BRICKS ||
                                            strLocation.getBlock().getType() == Material.INFESTED_MOSSY_STONE_BRICKS || strLocation.getBlock().getType() == Material.MOSSY_STONE_BRICKS ||
                                            strLocation.getBlock().getType() == Material.CRACKED_STONE_BRICKS || strLocation.getBlock().getType() == Material.BOOKSHELF) {
                                        strongholdCounter2++;
                                    }
                                }
                            }
                        }

                        //Temple
                        for (int x = (int) p.getLocation().getX() - 10; x < p.getLocation().getX() + 10; x++) {
                            for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                                for (int z = (int) p.getLocation().getZ() - 10; z < p.getLocation().getZ() + 10; z++) {
                                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                    if (location.getBlock().getType() == Material.CHISELED_SANDSTONE) {
                                        if (biome == Biome.DESERT || biome == Biome.DESERT_HILLS || biome == Biome.DESERT_LAKES) {
                                            templeCounter++;
                                        }
                                    }
                                }
                            }
                        }

                        for (int yloc = (int) p.getLocation().getY() + 1; yloc > p.getLocation().getY() - 20; yloc--) {
                            Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) yloc, p.getLocation().getZ());
                            Material locationO12 = location.getBlock().getType();
                            if (locationO12 == Material.BIRCH_PLANKS || locationO12 == Material.COBBLESTONE) {
                                System.out.println("STR: Mansion Counter++");
                                mansionCounter++;
                            }
                        }

                        if (templeCounter >= 1) {
                            Location temple = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.DESERT_PYRAMID, 100, false);
                            assert temple != null;
                            int templeX = temple.getChunk().getX();
                            int templeZ = temple.getChunk().getZ();
                            if (templeX + 2 >= pChunkX && pChunkX >= templeX - 2) {
                                if (templeZ + 2 >= pChunkZ && pChunkZ >= templeZ - 2) {
                                    if (g == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.mg master " + p.getName());
                                        t = "";
                                        setTo0(p);
                                        g = 1;
                                    }
                                    System.out.println("STR: TEMPLE FOUND!");
                                    return true;
                                }
                            }
                        }
                        //Mansion


                        else if (mansionCounter >= 1) {
                            for (int ylocM = (int) p.getLocation().getY(); ylocM < p.getLocation().getY() + 25; ylocM++) {
                                Location locationM = new Location(p.getWorld(), p.getLocation().getX(), (double) ylocM, p.getLocation().getZ());
                                Material locationO = locationM.getBlock().getType();
                                if (locationO != Material.AIR && locationO != Material.CAVE_AIR && locationO != Material.VOID_AIR) {
                                    if (locationO == Material.BIRCH_PLANKS || locationO == Material.DARK_OAK_PLANKS || locationO == Material.COBBLESTONE) {
                                        int mCounter = 0;
                                        for (int x = (int) p.getLocation().getX() - 20; x < p.getLocation().getX() + 20; x++) {
                                            for (int y = (int) p.getLocation().getY() - 20; y < p.getLocation().getY() + 20; y++) {
                                                for (int z = (int) p.getLocation().getZ() - 20; z < p.getLocation().getZ() + 20; z++) {
                                                    Location locationMa = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                                    if (locationMa.getBlock().getType() == Material.DARK_OAK_PLANKS || locationMa.getBlock().getType() == Material.RED_CARPET || locationMa.getBlock().getType() == Material.BIRCH_PLANKS || locationMa.getBlock().getType() == Material.WHITE_CARPET) {
                                                        mCounter++;
                                                    }
                                                }
                                            }
                                        }
                                        System.out.println(mCounter);
                                        if (mCounter >= 1000) {

                                            if (man == 0) {
                                                stopSound(p);
                                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.gh master " + p.getName());
                                                t = "";
                                                setTo0(p);
                                                man = 1;
                                            }
                                            System.out.println("STR: MANSION FOUND!");
                                            return true;
                                        }
                                        else if (outpostX + 1 >= pChunkX && pChunkX >= outpostX - 1) {
                                            Material materialChecker = Material.DRAGON_BREATH;
                                            if (outpostZ + 1 >= pChunkZ && pChunkZ >= outpostZ - 1) {
                                                int outpostCounterO = 0;
                                                for (int x = (int) p.getLocation().getX() - 1; x < p.getLocation().getX() + 1; x++) {
                                                    for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                                                        for (int z = (int) p.getLocation().getZ() - 1; z < p.getLocation().getZ() + 1; z++) {
                                                            Material materialScan = p.getWorld().getBlockAt((int) x, (int) y, (int) z).getType();

                                                            if (materialScan == Material.BIRCH_PLANKS) {
                                                                outpostCounterO++;
                                                                materialChecker = materialScan;
                                                                System.out.println(outpostCounterO);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (outpostCounterO >= 1) {
                                                    System.out.println(outpostCounterO);
                                                    System.out.println(materialChecker);
                                                    if (out == 0) {
                                                        stopSound(p);
                                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ba master " + p.getName());
                                                        t = "";
                                                        setTo0(p);
                                                        out = 1;
                                                    }
                                                    System.out.println("STR: OUTPOST FOUND");
                                                    return true;
                                                }
                                            }
                                        }
                                        else if (isInCaveOO(p)){
                                            if(c == 0) {
                                                stopSound(p);
                                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                                                setTo0(p);
                                                c = 1;
                                                t = "";
                                            }
                                            return true;
                                        }
                                    }
                                    else if (isInCaveOO(p)){
                                        if(c == 0) {
                                            stopSound(p);
                                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                                            setTo0(p);
                                            c = 1;
                                            t = "";
                                        }
                                        return true;
                                    }
                                }
                                else if (isInCaveOO(p)){
                                    if(c == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                                        setTo0(p);
                                        c = 1;
                                        t = "";
                                    }
                                    return true;
                                }
                            }
                        }
                        //OutPost
                        else if (outpostX + 1 >= pChunkX && pChunkX >= outpostX - 1) {
                            Material materialChecker = Material.DRAGON_BREATH;
                            if (outpostZ + 1 >= pChunkZ && pChunkZ >= outpostZ - 1) {
                                int outpostCounterO = 0;
                                for (int x = (int) p.getLocation().getX() - 1; x < p.getLocation().getX() + 1; x++) {
                                    for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                                        for (int z = (int) p.getLocation().getZ() - 1; z < p.getLocation().getZ() + 1; z++) {
                                            Material materialScan = p.getWorld().getBlockAt((int) x, (int) y, (int) z).getType();

                                            if (materialScan == Material.BIRCH_PLANKS) {
                                                outpostCounterO++;
                                                materialChecker = materialScan;
                                                System.out.println(outpostCounterO);
                                            }
                                        }
                                    }
                                }
                                if (outpostCounterO >= 1) {
                                    System.out.println(outpostCounterO);
                                    System.out.println(materialChecker);
                                    if (out == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ba master " + p.getName());
                                        t = "";
                                        setTo0(p);
                                        out = 1;
                                    }
                                    System.out.println("STR: OUTPOST FOUND");
                                    return true;
                                }
                            }
                        } else if (strongholdCounter >= 5 && strongholdCounter2 >= 1) {
                            Location stronghold = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.STRONGHOLD, 100, false);
                            assert stronghold != null;
                            int strongholdX = stronghold.getChunk().getX();
                            int strongholdZ = stronghold.getChunk().getZ();
                            if (strongholdX + 8 >= pChunkX && pChunkX >= strongholdX - 8) {
                                if (strongholdZ + 8 >= pChunkZ && pChunkZ >= strongholdZ - 8) {

                                    int counterP = -1;

                                    int[] fX = new int[12];
                                    int[] fZ = new int[12];

                                    int xl = -100000;
                                    int xs = 100000;
                                    int zl = -100000;
                                    int zs = 100000;
                                    int cx;
                                    int cz;
                                    int fY = 0;

                                    for (int x = (int) p.getLocation().getX() - 10; x < p.getLocation().getX() + 10; x++) {
                                        for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                                            for (int z = (int) p.getLocation().getZ() - 10; z < p.getLocation().getZ() + 10; z++) {
                                                Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                                if (location.getBlock().getType() == Material.END_PORTAL_FRAME) {
                                                    fY = location.getBlockY();
                                                    counterP++;
                                                    System.out.println("EPF: Counter++");
                                                    fX[counterP] = location.getBlockX();
                                                    fZ[counterP] = location.getBlockZ();
                                                }
                                            }
                                        }
                                    }
                                    if (counterP == 11) {
                                        for (int j : fX) {
                                            if (j < xs) {
                                                xs = j;
                                                System.out.println("EPF: xs Value = " + xs);
                                            }
                                            if (j > xl) {
                                                xl = j;
                                                System.out.println("EPF: xl Value = " + xl);
                                            }
                                        }
                                        for (int i : fZ) {
                                            if (i < zs) {
                                                zs = i;
                                                System.out.println("EPF: zs Value = " + zs);
                                            }
                                            if (i > zl) {
                                                zl = i;
                                                System.out.println("EPF: zl Value = " + zl);
                                            }
                                        }
                                        cx = (xl + xs) / 2;
                                        cz = (zl + zs) / 2;

                                        System.out.println("EPF: Mid Block = " + p.getWorld().getBlockAt(cx, fY, cz).getType());

                                        if (p.getWorld().getBlockAt(cx, fY, cz).getType() != Material.AIR && p.getWorld().getBlockAt(cx, fY, cz).getType() != Material.CAVE_AIR) {
                                            stopSound(p);
                                        }
                                    }
                                }

                                if (strong == 0) {
                                    stopSound(p);
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.caa master " + p.getName());
                                    t = "";
                                    setTo0(p);
                                    strong = 1;
                                }
                                System.out.println("STR: STRONGHOLD FOUND");
                                return true;

                            }
                        }
                        else if (isInCaveOO(p)){
                            if(c == 0) {
                                stopSound(p);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                                setTo0(p);
                                c = 1;
                                t = "";
                            }
                            return true;
                        }
                        //Location stronghold = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.STRONGHOLD, 100, false);
                    } else if (environment == World.Environment.NETHER) {
                        int fortressCounter = 0;
                        int bastionCounter = 0;
                        for (int nx = (int) p.getLocation().getX() - 10; nx < p.getLocation().getX() + 10; nx++) {
                            for (int ny = (int) p.getLocation().getY() - 10; ny < p.getLocation().getY() + 10; ny++) {
                                for (int nz = (int) p.getLocation().getZ() - 10; nz < p.getLocation().getZ() + 10; nz++) {
                                    Material nmaterialScan = p.getWorld().getBlockAt((int) nx, (int) ny, (int) nz).getType();
                                    if (nmaterialScan == Material.NETHER_BRICKS) {
                                        fortressCounter++;
                                    }
                                }
                            }
                        }
                        for (int bx = (int) p.getLocation().getX() - 15; bx < p.getLocation().getX() + 15; bx++) {
                            for (int by = (int) p.getLocation().getY() - 15; by < p.getLocation().getY() + 15; by++) {
                                for (int bz = (int) p.getLocation().getZ() - 15; bz < p.getLocation().getZ() + 15; bz++) {
                                    Material nmaterialScan = p.getWorld().getBlockAt((int) bx, (int) by, (int) bz).getType();
                                    if ((nmaterialScan == Material.BLACKSTONE_SLAB || nmaterialScan == Material.BLACKSTONE_WALL || nmaterialScan == Material.BLACKSTONE_STAIRS ||
                                            nmaterialScan == Material.POLISHED_BLACKSTONE_BRICKS || nmaterialScan == Material.POLISHED_BLACKSTONE_BRICK_STAIRS ||
                                            nmaterialScan == Material.CRACKED_POLISHED_BLACKSTONE_BRICKS || nmaterialScan == Material.CHISELED_POLISHED_BLACKSTONE)) {
                                        bastionCounter++;
                                    }
                                }
                            }
                        }
                        if (fortressCounter >= 1) {
                            Location fortress = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.NETHER_FORTRESS, 100, false);
                            assert fortress != null;
                            int fortressX = fortress.getChunk().getX();
                            int fortressZ = fortress.getChunk().getZ();

                            System.out.println();

                            if (true) {
                                if (fortressCounter >= 25) {
                                    if (fort == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ft master " + p.getName());
                                        t = "";
                                        setTo0(p);
                                        fort = 1;
                                    }
                                    System.out.println("STR: FORTRESS FOUND");
                                    return true;
                                }
                            } else if (bastionCounter >= 1) {
                                System.out.println("STR: BASTION COUNTER IS HIGHER THAN 1");
                                Location bastion = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.BASTION_REMNANT, 100, false);
                                assert bastion != null;
                                int bastionX = bastion.getChunk().getX();
                                int bastionZ = bastion.getChunk().getZ();

                                if (bastionX + 8 >= pChunkX && pChunkX >= bastionX - 8) {
                                    if (bastionZ + 8 >= pChunkZ && pChunkZ >= bastionZ - 8) {
                                        if (bast == 0) {
                                            stopSound(p);
                                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ca master " + p.getName());
                                            t = "";
                                            setTo0(p);
                                            bast = 1;
                                            System.out.println("STR: BASTION FOUND");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if (bastionCounter >= 1) {
                            System.out.println("STR: BASTION COUNTER IS HIGHER THAN 1");
                            Location bastion = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.BASTION_REMNANT, 100, false);
                            System.out.println("1");
                            assert bastion != null;
                            int bastionX = bastion.getChunk().getX();
                            System.out.println(bastionX);
                            int bastionZ = bastion.getChunk().getZ();
                            System.out.println(bastionZ);
                            System.out.println("2");

                            if (bastionX + 8 >= pChunkX && pChunkX >= bastionX - 8) {
                                System.out.println("3");
                                if (bastionZ + 8 >= pChunkZ && pChunkZ >= bastionZ - 8) {
                                    System.out.println("4");
                                    System.out.println("STR: BASTION FOUND");
                                    if (bast == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ca master " + p.getName());
                                        t = "";
                                        setTo0(p);
                                        bast = 1;
                                    }
                                    return true;
                                }
                            }
                        }
                        System.out.println("Str: Finished Scanning Nether");

                    } else if (environment == World.Environment.THE_END) {
        /*
        boolean checkX = 400 >= (int) p.getLocation().getX() && (int) p.getLocation().getX() >= -400;
        boolean checkZ = 400 >= (int) p.getLocation().getZ() && (int) p.getLocation().getZ() >= -400;
        if(!checkX)

         */
        /*Location city = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);
        assert city != null;*/
                        int cityCounter = 0;
                        for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                            for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                                for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                    if (location.getBlock().getType() == Material.PURPUR_BLOCK) {
                                        cityCounter++;
                                    }
                                }
                            }
                        }
                        int airshipCounter = 0;
                        int obsidianCounter = 0;
                        for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                            for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                                for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                    if (location.getBlock().getType() == Material.PURPUR_BLOCK || location.getBlock().getType() == Material.PURPUR_PILLAR) {
                                        airshipCounter++;
                                    }
                                }
                            }
                        }
                        for (int x2 = (int) p.getLocation().getX() - 12; x2 < p.getLocation().getX() + 12; x2++) {
                            for (int y2 = (int) p.getLocation().getY() - 25; y2 < p.getLocation().getY() + 12; y2++) {
                                for (int z2 = (int) p.getLocation().getZ() - 12; z2 < p.getLocation().getZ() + 12; z2++) {
                                    Location location2 = new Location(p.getWorld(), (double) x2, (double) y2, (double) z2);
                                    if (location2.getBlock().getType() == Material.OBSIDIAN) {
                                        obsidianCounter++;
                                    }
                                }
                            }
                        }

                        if (airshipCounter >= 1 && obsidianCounter >= 1) {
                            Location city = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);
                            assert city != null;
                            int cityX = city.getChunk().getX();
                            int cityZ = city.getChunk().getZ();
                            if (cityX + 8 >= pChunkX && pChunkX >= cityX - 8) {
                                if (cityZ + 8 >= pChunkZ && pChunkZ >= cityZ - 8) {
                                    System.out.println("STR: AIRSHIP FOUND!");
                                    if (air == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.as master " + p.getName());
                                        t = "";
                                        setTo0(p);
                                        air = 1;
                                    }
                                    return true;
                                }
                            }
                        } else if (cityCounter >= 1) {
                            Location endCity = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);
                            assert endCity != null;
                            int cityX = endCity.getChunk().getX();
                            int cityZ = endCity.getChunk().getZ();
                            if (cityX + 4 >= pChunkX && pChunkX >= cityX - 4) {
                                if (cityZ + 4 >= pChunkZ && pChunkZ >= cityZ - 4) {
                                    System.out.println("STR: ENDCITY FOUND!");
                                    if (city == 0) {
                                        stopSound(p);
                                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.cab master " + p.getName());
                                        t = "";
                                        setTo0(p);
                                        city = 1;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}



/*    public static boolean isInAirship(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        int counter3 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if(!isInDragonEnd(p)) {

                Location ploc = p.getLocation();

                // Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.NETHER_FORTRESS, 100, false);

                //Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

                Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

                for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                    for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                        for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                            Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                            if (location.getBlock().getType() == Material.PURPUR_BLOCK) {
                                counter2++;
                                for (int x2 = (int) p.getLocation().getX() - 12; x2 < p.getLocation().getX() + 12; x2++) {
                                    for (int y2 = (int) p.getLocation().getY() - 12; y2 < p.getLocation().getY() + 12; y2++) {
                                        for (int z2 = (int) p.getLocation().getZ() - 12; z2 < p.getLocation().getZ() + 12; z2++) {
                                            Location location2 = new Location(p.getWorld(), (double) x2, (double) y2, (double) z2);
                                            if (location2.getBlock().getType() == Material.OBSIDIAN) {
                                                counter3++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter2 >= 1 && counter3 >= 4;
    }
    public static boolean isInDragonEnd(Player p){
        double getX = p.getLocation().getX();

        double getZ = p.getLocation().getZ();

        if(p.getWorld().getEnvironment() == World.Environment.THE_END){
            if(getX >= -250 && getX <= 250){
                return getZ <= 250 && getZ >= -250;
            }
        }
        return false;
    }

    public static boolean createEndPortal(PortalCreateEvent e, Player p){
        if (e.getWorld().getEnvironment() == World.Environment.NORMAL){
            for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                    for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                        Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                        if(location.getBlock().getType() == Material.END_PORTAL_FRAME){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isInCity(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        int counter3 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if (!isInAirship(p)) {
                if (!isInDragonEnd(p)) {

                    Location ploc = p.getLocation();

                    Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);

                    if (sloc == null) {
                        return false;
                    }

                    Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

                    Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

                    Biome l = p.getLocation().getBlock().getBiome();

                    System.out.println(csloc);
                    System.out.println(cploc);

                    for (int sx = (csloc.getX() - 4); sx <= (csloc.getX() + 4); sx++) {
                        for (int sz = (csloc.getZ() - 4); sz <= (csloc.getZ() + 4); sz++) {
                            Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                            if ((scsloc) == cploc) {
                                counter1++;
                                for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                                    for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                                        for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                                            Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                            if (location.getBlock().getType() == Material.PURPUR_BLOCK) {
                                                counter2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter1 >= 1 && counter2 >= 1;
    }

     */



    /*int mansionCounter = 0;

        for (int x = (int) p.getLocation().getX() - 20; x < p.getLocation().getX() + 20; x++) {
            for (int y = (int) p.getLocation().getY() - 20; y < p.getLocation().getY() + 20; y++) {
                for (int z = (int) p.getLocation().getZ() - 20; z < p.getLocation().getZ() + 20; z++) {
                    Location locationM = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                    if (locationM.getBlock().getType() == Material.SPRUCE_PLANKS || locationM.getBlock().getType() == Material.RED_CARPET || locationM.getBlock().getType() == Material.BIRCH_PLANKS || locationM.getBlock().getType() == Material.WHITE_CARPET) {
                        mansionCounter++;
                    }
                }
            }
        }
        System.out.println(mansionCounter);
        //if(mansionCounter >= 800){
        //}






























    public static boolean isInTemple(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {

            Location ploc = p.getLocation();

            Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.DESERT_PYRAMID, 100, false);

            if (sloc == null) {
                return false;
            }

            Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

            Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

            // when no structure is in their world which is a desert pyramid
            for (int sx = (csloc.getX() - 1); sx <= (csloc.getX() + 1); sx++) {
                for (int sz = (csloc.getZ() - 1); sz <= (csloc.getZ() + 1); sz++) {
                    Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                    if ((scsloc) == cploc) {
                        counter1++;
                        for (int x = (int) p.getLocation().getX() - 10; x < p.getLocation().getX() + 10; x++) {
                            for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                                for (int z = (int) p.getLocation().getZ() - 10; z < p.getLocation().getZ() + 10; z++) {
                                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                    if (location.getBlock().getType() == Material.CHISELED_SANDSTONE) {
                                        counter2++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter1 >= 1 && counter2 >= 1;
    }

    public static boolean dragonIsAlive(Player p){
        if (p.getWorld().getEnvironment() == World.Environment.THE_END){
            System.out.println("END: In The End!");
            if (isInDragonEnd(p) && EntityType.ENDER_DRAGON.isAlive()) {
                System.out.println("END: Dragon is Alive!!!");
                return true;
            }
        }
        return false;
    }

    public static boolean isInFortress(Player p) {
        Biome l = p.getLocation().getBlock().getBiome();

        int counter1 = 0;

        int counter2 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.NETHER) {

            Location ploc = p.getLocation();

            Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.NETHER_FORTRESS, 100, false);

            if (sloc == null) {
                return false;
            }

            Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

            Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

            for (int sx = (csloc.getX() - 6); sx <= (csloc.getX() + 6); sx++) {
                for (int sz = (csloc.getZ() - 6); sz <= (csloc.getZ() + 6); sz++) {
                    Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                    if ((scsloc) == cploc) {
                        counter1++;
                    }
                }
            }

            for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) y, p.getLocation().getZ());
                if (location.getBlock().getType() == Material.NETHER_BRICKS) {
                    counter2++;
                }
            }


        }
        return counter1 >= 1 && counter2 >= 1;
    }


    public static boolean isInOutpost(Player p){
        int counter1 = 0;
        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {

            Location ploc = p.getLocation();

            Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.PILLAGER_OUTPOST, 100, false);

            if (sloc == null) {
                return false;
            }

            Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

            Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

            Biome l = p.getLocation().getBlock().getBiome();


            if ((csloc) == cploc) {
                counter1++;
            }
        }
        return counter1 >= 1;
    }

    public static boolean isInBastion(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.NETHER) {

            Location ploc = p.getLocation();

            Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.BASTION_REMNANT, 100, false);

            if (sloc == null) {
                return false;
            }

            Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

            Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

            Biome l = p.getLocation().getBlock().getBiome();

            for (int sx = (csloc.getX() - 4); sx <= (csloc.getX() + 4); sx++) {
                for (int sz = (csloc.getZ() - 4); sz <= (csloc.getZ() + 4); sz++) {
                    Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                    if ((scsloc) == cploc) {
                        counter1++;
                    }
                }
            }
            for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                    for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                        Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                        if (location.getBlock().getType() == Material.BLACKSTONE || location.getBlock().getType() == Material.CRACKED_POLISHED_BLACKSTONE_BRICKS || location.getBlock().getType() == Material.POLISHED_BLACKSTONE_BRICKS) {
                            counter2++;
                        }
                    }
                }
            }
        }
        return counter1 >= 1 && counter2 >= 4;
    }

    public static boolean isInMansion(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {

            Location ploc = p.getLocation();

            Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.WOODLAND_MANSION, 100, false);

            if (sloc == null) {
                return false;
            }

            Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

            Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

            for (int sx = (csloc.getX() - 2); sx <= (csloc.getX() + 2); sx++) {
                for (int sz = (csloc.getZ() - 2); sz <= (csloc.getZ() + 2); sz++) {
                    Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                    if ((scsloc) == cploc) {
                        counter1++;
                        for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                            for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                                for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                    if (location.getBlock().getType() == Material.DARK_OAK_PLANKS) {
                                        counter2++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter1 >= 1 && counter2 >= 1;
    }

    public static boolean isInStronghold(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {

            Location ploc = p.getLocation();

            Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.STRONGHOLD, 100, false);

            if (sloc == null) {
                return false;
            }

            Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

            Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

            for (int sx = (csloc.getX() - 7); sx <= (csloc.getX() + 7); sx++) {
                for (int sz = (csloc.getZ() - 7); sz <= (csloc.getZ() + 7); sz++) {
                    Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                    if ((scsloc) == cploc) {
                        counter1++;
                        for (int y = (int) p.getLocation().getY(); y < p.getLocation().getY() + 10; y++) {
                            Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) y, p.getLocation().getZ());
                            if (location.getBlock().getType() == Material.INFESTED_STONE_BRICKS || location.getBlock().getType() == Material.STONE_BRICKS || location.getBlock().getType() == Material.INFESTED_CRACKED_STONE_BRICKS ||
                                    location.getBlock().getType() == Material.INFESTED_MOSSY_STONE_BRICKS || location.getBlock().getType() == Material.MOSSY_STONE_BRICKS ||
                                    location.getBlock().getType() == Material.CRACKED_STONE_BRICKS || location.getBlock().getType() == Material.BOOKSHELF) {
                                counter2++;
                            }
                        }
                    }
                }
            }
        }
        return counter1 >= 1 && counter2 >= 1;
    }

    /*public static boolean isInPortalRoom(Player p){
        int counter = -1;

        int[] fX = new int[12];
        int[] fZ = new int[12];

        int xl = -100000;
        int xs = 100000;
        int zl = -100000;
        int zs = 100000;
        int cx;
        int cz;
        int fY = 0;

        for (int x = (int) p.getLocation().getX() - 10; x < p.getLocation().getX() + 10; x++) {
            for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                for (int z = (int) p.getLocation().getZ() - 10; z < p.getLocation().getZ() + 10; z++) {
                    Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                    if(location.getBlock().getType() == Material.END_PORTAL_FRAME){
                        fY = location.getBlockY();
                        counter++;
                        System.out.println("EPF: Counter++");
                        fX[counter] = location.getBlockX();
                        fZ[counter] = location.getBlockZ();
                    }
                }
            }
        }
        if(counter == 11){
            for (int j : fX) {
                if (j < xs) {
                    xs = j;
                    System.out.println("EPF: xs Value = " + xs);
                }
                if (j > xl) {
                    xl = j;
                    System.out.println("EPF: xl Value = " + xl);
                }
            }
            for (int i : fZ) {
                if (i < zs) {
                    zs = i;
                    System.out.println("EPF: zs Value = " + zs);
                }
                if (i > zl) {
                    zl = i;
                    System.out.println("EPF: zl Value = " + zl);
                }
            }
            cx = (xl + xs) / 2;
            cz = (zl + zs) / 2;

            System.out.println("EPF: Mid Block = " + p.getWorld().getBlockAt(cx, fY, cz).getType());

            if (p.getWorld().getBlockAt(cx, fY, cz).getType() != Material.AIR && p.getWorld().getBlockAt(cx, fY, cz).getType() != Material.CAVE_AIR){
                return true;
            }
        }

        return false;
    }



    public static boolean isInAirship(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        int counter3 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if(!isInDragonEnd(p)) {

                Location ploc = p.getLocation();

                // Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.NETHER_FORTRESS, 100, false);

                //Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

                Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

                for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                    for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                        for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                            Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                            if (location.getBlock().getType() == Material.PURPUR_BLOCK) {
                                counter2++;
                                for (int x2 = (int) p.getLocation().getX() - 12; x2 < p.getLocation().getX() + 12; x2++) {
                                    for (int y2 = (int) p.getLocation().getY() - 12; y2 < p.getLocation().getY() + 12; y2++) {
                                        for (int z2 = (int) p.getLocation().getZ() - 12; z2 < p.getLocation().getZ() + 12; z2++) {
                                            Location location2 = new Location(p.getWorld(), (double) x2, (double) y2, (double) z2);
                                            if (location2.getBlock().getType() == Material.OBSIDIAN) {
                                                counter3++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter2 >= 1 && counter3 >= 4;
    }
    public static boolean isInDragonEnd(Player p){
        double getX = p.getLocation().getX();

        double getZ = p.getLocation().getZ();

        if(p.getWorld().getEnvironment() == World.Environment.THE_END){
            if(getX >= -250 && getX <= 250){
                return getZ <= 250 && getZ >= -250;
            }
        }
        return false;
    }

    public static boolean createEndPortal(PortalCreateEvent e, Player p){
        if (e.getWorld().getEnvironment() == World.Environment.NORMAL){
            for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                for (int y = (int) p.getLocation().getY() - 10; y < p.getLocation().getY() + 10; y++) {
                    for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                        Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                        if(location.getBlock().getType() == Material.END_PORTAL_FRAME){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isInCity(Player p) {
        int counter1 = 0;

        int counter2 = 0;

        int counter3 = 0;

        if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if (!isInAirship(p)) {
                if (!isInDragonEnd(p)) {

                    Location ploc = p.getLocation();

                    Location sloc = p.getWorld().locateNearestStructure(p.getLocation(), StructureType.END_CITY, 100, false);

                    if (sloc == null) {
                        return false;
                    }

                    Chunk csloc = ((CraftWorld) p.getWorld()).getChunkAt(sloc.getChunk().getX(), sloc.getChunk().getZ());

                    Chunk cploc = p.getWorld().getChunkAt(ploc.getChunk().getX(), ploc.getChunk().getZ());

                    Biome l = p.getLocation().getBlock().getBiome();

                    System.out.println(csloc);
                    System.out.println(cploc);

                    for (int sx = (csloc.getX() - 4); sx <= (csloc.getX() + 4); sx++) {
                        for (int sz = (csloc.getZ() - 4); sz <= (csloc.getZ() + 4); sz++) {
                            Chunk scsloc = ((CraftWorld) p.getWorld()).getChunkAt(sx, sz);
                            if ((scsloc) == cploc) {
                                counter1++;
                                for (int x = (int) p.getLocation().getX() - 5; x < p.getLocation().getX() + 5; x++) {
                                    for (int y = (int) p.getLocation().getY() - 5; y < p.getLocation().getY() + 5; y++) {
                                        for (int z = (int) p.getLocation().getZ() - 5; z < p.getLocation().getZ() + 5; z++) {
                                            Location location = new Location(p.getWorld(), (double) x, (double) y, (double) z);
                                            if (location.getBlock().getType() == Material.PURPUR_BLOCK) {
                                                counter2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter1 >= 1 && counter2 >= 1;
    }

    public static boolean Structuresss (Player p) {
        Biome l = p.getLocation().getBlock().getBiome();

        if (y == 0) {
            if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
                if((isAbove128(p))) {
                    stopSound(p);
                    setTo0(p);
                    y = 1;
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w7 master " + p.getName());
                    t = "";
                }
            }
        }
        if (c == 0) {
            if (isInCave(p)) {
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                setTo0(p);
                c = 1;
                t = "";
            }
        }
        if (h == 0) {
            if (isBelow25(p)) {
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.vu master " + p.getName());
                setTo0(p);
                h = 1;
                t = "";
            }
        }

        if (g == 0){
            if(isInTemple(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.mg master " + p.getName());
                t = "";
                setTo0(p);
                g = 1;
            }
        }

        if (fort == 0){
            if(isInFortress(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ft master " + p.getName());
                t = "";
                setTo0(p);
                fort = 1;
            }
        }

        if (bast == 0){
            if(isInBastion(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ca master " + p.getName());
                t = "";
                setTo0(p);
                bast = 1;
            }
        }

        if (strong == 0){
            if(isInStronghold(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.caa master " + p.getName());
                t = "";
                setTo0(p);
                strong = 1;
            }
        }

        if (out == 0){
            if(isInOutpost(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ba master " + p.getName());
                t = "";
                setTo0(p);
                out = 1;
            }
        }

        if (man == 0){
            if(isInMansion(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.gh master " + p.getName());
                t = "";
                setTo0(p);
                man = 1;
            }
        }

        if (air == 0){
            if(isInAirship(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.as master " + p.getName());
                t = "";
                setTo0(p);
                air = 1;
            }
        }

        if (city == 0){
            if(isInCity(p)){
                stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.cab master " + p.getName());
                t = "";
                setTo0(p);
                city = 1;
            }
        }

        if (!isInAirship(p)) {
            if (!isInCity(p)) {
                if (!isInMansion(p)) {
                    if (!isInOutpost(p)) {
                        if (!isInStronghold(p)) {
                            if (!isInFortress(p)) {
                                if (!isInBastion(p)) {
                                    if (!isDed(p)) {
                                        if (!isInTemple(p)) {
                                            if (!isBelow25(p)) {
                                                if (!isAbove128(p)) {
                                                    return !isInCave(p);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static boolean Miscellaneous(Player p){
        World.Environment envy = p.getWorld().getEnvironment();

        Biome l = p.getLocation().getBlock().getBiome();

        if (envy == World.Environment.NORMAL) {
            if (isAbove128(p)) {
                if (y == 0) {
                    stopSound(p);
                    setTo0(p);
                    y = 1;
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.w7 master " + p.getName());
                    t = "";
                }
                return true;
            }
            else if (isInCave(p)) {
                if (c == 0) {
                    stopSound(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ug master " + p.getName());
                    setTo0(p);
                    c = 1;
                    t = "";
                }
                return true;
            }
        }

        if (envy == World.Environment.NETHER) {
            if (isBelow25(p)) {
                if (h == 0) {
                    stopSound(p);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.vu master " + p.getName());
                    setTo0(p);
                    h = 1;
                    t = "";
                }
                return true;
            }
        }
        return false;
    }


    public static boolean Structuressss(Player p){
        World.Environment envy = p.getWorld().getEnvironment();

        Biome l = p.getLocation().getBlock().getBiome();



        //int[] chunks = new int[49];

        //Material blockBelow = p.getWorld().getBlockAt((int)p.getLocation().getX(), (int)p.getLocation().getY() - 1, (int)p.getLocation().getZ()).getType();

        System.out.println("STR: BEGIN");


        for (int y4 = (int) p.getLocation().getY() + 1; y4 > 1; y4--) {
            System.out.println("STR: BEGIN ITERATION");
            Location location = new Location(p.getWorld(), p.getLocation().getX(), (double) y4, p.getLocation().getZ());
            Material locationO = location.getBlock().getType();
            if (locationO != Material.AIR && locationO != Material.CAVE_AIR && locationO != Material.VOID_AIR && locationO != Material.GRASS && locationO != Material.TALL_GRASS && locationO != Material.SEAGRASS && locationO != Material.TALL_SEAGRASS && locationO != Material.DEAD_BUSH && locationO != Material.ROSE_BUSH
                    && locationO != Material.POPPY && locationO != Material.LILAC && locationO != Material.CORNFLOWER && locationO != Material.DANDELION && locationO != Material.SUNFLOWER && locationO != Material.OXEYE_DAISY && locationO != Material.ORANGE_TULIP && locationO != Material.PINK_TULIP && locationO != Material.WHITE_TULIP && locationO != Material.LILY_OF_THE_VALLEY && locationO != Material.LILY_PAD
                    && locationO != Material.ALLIUM && locationO != Material.BLUE_ORCHID && locationO != Material.PEONY) {
                System.out.println("STR: Block Type Found: " + locationO);
                System.out.println("STR: Set Block From: " + daBlock + " To " + locationO);
                y4 = 0;
                if(daBlock != locationO) {
                    daBlock = locationO;

                    if (envy == World.Environment.NORMAL) {
                        if (isInStronghold(p)) {
                            if (strong == 0) {
                                stopSound(p);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.caa master " + p.getName());
                                t = "";
                                setTo0(p);
                                strong = 1;
                            }
                            return true;
                        }
                        else if (isInOutpost(p)) {
                            if (out == 0) {
                                stopSound(p);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ba master " + p.getName());
                                t = "";
                                setTo0(p);
                                out = 1;
                            }
                            return true;
                        } else if (l == Biome.DESERT || l == Biome.DESERT_LAKES || l == Biome.DESERT_HILLS) {
                            if (isInTemple(p) && locationO != Material.SAND) {
                                if (g == 0) {
                                    stopSound(p);
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.mg master " + p.getName());
                                    t = "";
                                    setTo0(p);
                                    g = 1;
                                }
                                return true;
                            }
                        }

                    }
                    if (envy == World.Environment.NETHER) {
                        if (isInFortress(p)) {
                            if (fort == 0) {
                                stopSound(p);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ft master " + p.getName());
                                t = "";
                                setTo0(p);
                                fort = 1;
                            }
                            return true;
                        }
                        if (isInBastion(p)) {
                            if (bast == 0) {
                                stopSound(p);
                                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.ca master " + p.getName());
                                t = "";
                                setTo0(p);
                                bast = 1;
                            }
                            return true;
                        }
                    }
                    if (envy == World.Environment.THE_END) {
                        System.out.println("Work1");
                        if (!isInDragonEnd(p)) {
                            System.out.println("Work2");
                            if (isInAirship(p)) {
                                if (air == 0) {
                                    stopSound(p);
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.as master " + p.getName());
                                    t = "";
                                    setTo0(p);
                                    air = 1;
                                }
                                return true;
                            } else if (isInCity(p)) {
                                System.out.println("Work3");
                                if (city == 0) {
                                    stopSound(p);
                                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @a run playsound minecraft:world.cab master " + p.getName());
                                    t = "";
                                    setTo0(p);
                                    city = 1;
                                }
                                return true;
                            }
                        }
                    }


                }
            }
        }
        return false;
    }
}


for (int x2 = (int) p.getLocation().getX() - 30; x2 < p.getLocation().getX() + 30; x2++) {
                        for (int y2 = (int) p.getLocation().getY() - 30; y2 < p.getLocation().getY() + 30; y2++) {
                            for (int z2 = (int) p.getLocation().getZ() - 30; z2 < p.getLocation().getZ() + 30; z2++) {
                                Location location = new Location(p.getWorld(), (double) x2, (double) y2, (double) z2);
                                if (location.getBlock().getType() == Material.DRAGON_HEAD) {
                                    counter3++;
                                }
                            }
                        }
                    }

*/



