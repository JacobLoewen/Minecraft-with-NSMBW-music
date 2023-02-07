package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Timer;
import java.util.TimerTask;

public class Iteration implements CommandExecutor {
    static int secondsPassed = -1;

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            for(Player p : Bukkit.getOnlinePlayers()) {
                secondsPassed++;
                System.out.println("Seconds passed: " + secondsPassed * 5 + 5);
                NSMBWII.stopSound(p);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"execute at @a run playsound minecraft:world." + NSMBWII.music[secondsPassed] + " master " + p.getName());
            }
        }
    };


    public void start() {
        timer.scheduleAtFixedRate(task, 100, 100);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)) {
            return true;
        }
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("pregame")) {

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
            start();
        }
        return true;
    }
}