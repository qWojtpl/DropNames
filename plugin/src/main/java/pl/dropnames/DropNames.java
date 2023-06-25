package pl.dropnames;

import org.bukkit.plugin.java.JavaPlugin;
import pl.dropnames.events.Events;

public final class DropNames extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        getLogger().info("Enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled.");
    }
}
