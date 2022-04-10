package me.regos.antihunger.listeners;

import me.regos.antihunger.AntiHunger;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class HungerChangeEvent implements Listener {

    @EventHandler
    public void onFoodLevelChange (FoodLevelChangeEvent e){
        if(AntiHunger.getOn() == true) {
            e.setCancelled(true);
        }
    }
}
