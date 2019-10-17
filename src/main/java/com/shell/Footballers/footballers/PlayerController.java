package com.shell.Footballers.footballers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    private PlayerCatalogue playerCatalogue = new PlayerCatalogue();

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public List<Player> getAllPlayers() {
        return playerCatalogue.players;
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
    public Player getPlayerByID(@PathVariable("id") int id) {
        for (Player player : playerCatalogue.players)
            if (player.getId() == id){
                return player;
            }
        throw new RuntimeException("player not found");
    }

}


