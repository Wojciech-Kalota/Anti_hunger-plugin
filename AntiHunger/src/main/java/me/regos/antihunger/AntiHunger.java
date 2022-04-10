package me.regos.antihunger;

import me.regos.antihunger.commands.HungerToggle;
import me.regos.antihunger.listeners.HungerChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiHunger extends JavaPlugin {

    private static boolean on;

    @Override
    public void onEnable() {
        // Plugin startup logic
        on = false;
        getServer().getPluginManager().registerEvents(new HungerChangeEvent(), this);
        getCommand("hungertoggle").setExecutor(new HungerToggle());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static boolean getOn(){
        return on;
    }

    public static void setOn(boolean on) {
        AntiHunger.on = on;
    }
}
