package com.jimps.weakfalling;

import org.bukkit.event.*;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listeners implements Listener {
	
	@EventHandler
	public void playerMoved(PlayerMoveEvent event) {
		double fall = event.getPlayer().getFallDistance();
		
		if(fall == 0) {
			event.getPlayer().setFallDistance(2.5f);
		}
	}
	
}
