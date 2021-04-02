package dev.yhdiamond.wispmobsdropop;

import dev.yhdiamond.wispmobsdropop.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WispMobsDropOP extends JavaPlugin {
    public static boolean isStarted = false;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
        new Metrics(this, 10889);
        getCommand("wispmobsdropop").setExecutor(new StartCommand());
        getCommand("wispmobsdropop").setTabCompleter(new CommandComplete());
    }
}
