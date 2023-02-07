package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StopIteration implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)) {
            System.out.println("STOP ITERATION");
            return true;
        }
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("offline")) {
            System.out.println("Player Running In Main: " + p.getName());
            NSMBWII.stopSound(p);
            NSMBWII.setTo0(p);
            NSMBWII.tTo0();
            NSMBWII.clToNull();
            Main.running = 0;
        }
        return true;
    }
}