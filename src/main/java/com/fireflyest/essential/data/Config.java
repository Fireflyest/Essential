package com.fireflyest.essential.data;

import com.fireflyest.essential.util.StringUtils;
import org.bukkit.configuration.file.FileConfiguration;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Fireflyest
 * 2022/1/3 12:11
 */

public class Config {
    
    public static boolean DEBUG;
    public static boolean SQL;
    public static String URL;
    public static String USER;
    public static String PASSWORD;

    public static String MAIN_WORLD;

    private Config(){}
    
}
