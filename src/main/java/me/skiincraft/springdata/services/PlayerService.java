package me.skiincraft.springdata.services;

import me.skiincraft.springdata.entity.Player;
import me.skiincraft.springdata.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void addPlayer(String username) {
        playerRepository.save(new Player().setUsername(username));
    }
}