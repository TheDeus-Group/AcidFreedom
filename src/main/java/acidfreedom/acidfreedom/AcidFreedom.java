package acidfreedom.acidfreedom;

import acidfreedom.acidfreedom.commands.EMFCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AcidFreedom extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginCommand("emf").setExecutor(new EMFCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
