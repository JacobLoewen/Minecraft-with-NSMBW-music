package me.starminer.nsmbw;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SoundIteration implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)) {
            System.out.println("SOUND ITERATION");
            return true;
        }
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("lets_a_go")) {
            System.out.println("Player Running In Main: " + p.getName());
            Main.running = 1;
        }
        return true;
    }
}
