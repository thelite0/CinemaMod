package com.cinemamod.bukkit.event;

import com.cinemamod.bukkit.theater.Theater;
import org.bukkit.entity.Player;

public class TheaterSetOwnerEvent extends PlayerTheaterEvent {

    public TheaterSetOwnerEvent(Player player, Theater theater) {
        super(player, theater);
    }

}
