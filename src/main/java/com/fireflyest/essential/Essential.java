package com.fireflyest.essential;

import com.fireflyest.essential.data.Config;
import com.fireflyest.essential.util.YamlUtils;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Fireflyest
 * 2021/12/31 21:58
 */
public class Essential extends JavaPlugin {

    public static JavaPlugin getInstance() { return plugin; }

    private static JavaPlugin plugin;

    private static FileConfiguration config;

    @Override
    public void onEnable() {
        super.onEnable();
        plugin = this;

        YamlUtils.iniYamlUtils(plugin);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
