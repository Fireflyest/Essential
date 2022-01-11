package com.fireflyest.essential.util;

import java.util.HashSet;
import java.util.Set;

import com.fireflyest.essential.Essential;
import com.fireflyest.essential.data.Language;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class TeleportUtils {

	private static final Set<String> waiting = new HashSet<>();
	
	private TeleportUtils() { }

	public static void teleportTo(Player player, Location loc, boolean vip) {
		if(waiting.contains(player.getName())) {
			player.sendMessage(Language.TITLE+"waiting...");
			return;
		}
		if(loc == null){
			player.sendMessage(Language.TITLE+"location error!");
			return;
		}
		if(!loc.getChunk().isLoaded()) loc.getChunk().load();
		long t = vip ? 1 : 3;
		player.playSound(player.getLocation(), Sound.BLOCK_PORTAL_AMBIENT, 1, 1);

		new BukkitRunnable(){
			@Override
			public void run() {
				player.teleport(loc);
			}
		}.runTaskLater(Essential.getInstance(), t*20);

		new BukkitRunnable() {
			final BossBar coolbar = Bukkit.getServer().createBossBar("", BarColor.WHITE, BarStyle.SOLID, BarFlag.PLAY_BOSS_MUSIC);
			double time = t;
			boolean apply = false;
			@Override
			public void run() {
				if(!apply){
					coolbar.addPlayer(player);
					if(!coolbar.isVisible()) coolbar.setVisible(true);
					apply = true;
				}

				// 判断是否移动了（世界不同或者移动了）
//				if(now.getWorld() == null || !now.getWorld().equals(player.getLocation().getWorld()) || player.getLocation().distance(now) > 1.5){
//					player.sendMessage(Language.CANCEL_WAITING);
//					waiting.remove(player.getName());
//					coolbar.setVisible(false);
//					coolbar.removeAll();
//					cancel();
//					return;
//				}

				// 判断时间是否到了
				if(time <= 0) {
					waiting.remove(player.getName());
		    		coolbar.setVisible(false);
		    		coolbar.removeAll();
					cancel();
					return;
				}else {
			    	coolbar.setProgress(time/ (double) t);
				}
				time-=0.05;
			}
		}.runTaskTimerAsynchronously(Essential.getInstance(), 0L, 1L);
	}
	
}
