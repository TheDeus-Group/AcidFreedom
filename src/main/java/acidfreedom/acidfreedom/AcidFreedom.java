package acidfreedom.acidfreedom;

import acidfreedom.acidfreedom.commands.ApplyCommand;
import acidfreedom.acidfreedom.commands.EMFCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AcidFreedom extends JavaPlugin {

    @Override
    public void onEnable() {
        // Save defaults
        getConfig().options().copyDefaults(true);

        // Plugin startup logic
        Bukkit.getPluginCommand("emf").setExecutor(new EMFCommand());
        Bukkit.getPluginCommand("admininfo").setExecutor(new ApplyCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
