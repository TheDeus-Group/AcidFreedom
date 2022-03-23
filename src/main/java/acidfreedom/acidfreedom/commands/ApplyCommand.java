package acidfreedom.acidfreedom.commands;

import acidfreedom.acidfreedom.AcidFreedom;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ApplyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', String.join("\n", JavaPlugin.getPlugin(AcidFreedom.class).getConfig().getStringList("admininfo"))));
        return true;
    }
}
