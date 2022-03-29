package acidfreedom.acidfreedom.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EMFCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length < 1) {
            return false;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if(target != null) {
            target.sendMessage(ChatColor.RED + "ENGLISH MOTHERFUCKER, Do you speak it!?");
            Bukkit.broadcastMessage(String.format("%s%s is sick of %s not speaking English!" , ChatColor.RED, sender.getName(), target.getName()));
            target.setHealth(0);
            target.getWorld().strikeLightningEffect(target.getLocation());
        } else {
            sender.sendMessage(ChatColor.RED + "Player not found.");
        }
        return true;
    }
}
