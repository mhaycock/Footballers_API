package com.shell.Footballers.footballers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "localhost:5000")

@RestController
public class PlayerController {
    private PlayerCatalogue playerCatalogue = new PlayerCatalogue();

//    @RequestMapping(value = "/players/{name}", method = RequestMethod.GET)
//    public Player getPlayerByName(@PathVariable("name") String name) {
//        for (Player player : playerCatalogue.players)
//            if (player.getName().toLowerCase().contains(name.toLowerCase())){
//                return player;

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public List<Player> getPlayerByName(@RequestParam(value = "name", required = false) String name) {

        if(name != null){

        try {
            return playerCatalogue.getPlayerByName(name);

        } catch (Exception e){

            System.out.println(e);

            }

        }

        return playerCatalogue.getAllPlayers();

    }

}


