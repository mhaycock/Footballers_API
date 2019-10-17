package com.shell.Footballers.footballers;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

@Service

public class PlayerCatalogue {

    List<Player> players;

    public PlayerCatalogue() {
        players = new ArrayList<>();

        try {
            File file = ResourceUtils.getFile("classpath:playerDatabase.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] onePlayer = data.split(",");
                Player player = new Player(Integer.parseInt(onePlayer[1]), (onePlayer[2]),
                        Integer.parseInt(onePlayer[3]), onePlayer[5],
                        Integer.parseInt(onePlayer[7]), onePlayer[4]);
                players.add(player);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
