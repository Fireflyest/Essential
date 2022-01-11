package com.fireflyest.essential.util;

import com.fireflyest.essential.bean.Point;
import org.bukkit.Bukkit;
import org.bukkit.Location;

/**
 * @author Fireflyest
 * 2022/1/8 15:13
 */

public class ConvertUtils {

    private ConvertUtils(){}

    public static Location pointToLocation(Point p){
        return new Location(Bukkit.getWorld(p.getWorld()), p.getX(), p.getY(), p.getZ(), p.getYaw(), p.getPitch());
    }

    public static Point locationToPoint(Location loc){
        Point p = new Point();
        p.setX(loc.getX());
        p.setY(loc.getY());
        p.setZ(loc.getZ());
        p.setYaw(loc.getYaw());
        p.setPitch(loc.getPitch());
        if(loc.getWorld() != null){
            p.setWorld(loc.getWorld().getName());
        }
        return p;
    }

    public static <T extends Point> void locationToPoint(Location loc, T t){
        t.setX(loc.getX());
        t.setY(loc.getY());
        t.setZ(loc.getZ());
        t.setYaw(loc.getYaw());
        t.setPitch(loc.getPitch());
        if(loc.getWorld() != null){
            t.setWorld(loc.getWorld().getName());
        }
    }

}
