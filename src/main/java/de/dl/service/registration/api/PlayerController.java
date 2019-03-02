package de.dl.service.registration.api;

import de.dl.service.registration.dbaccess.entity.Player;
import de.dl.service.registration.dbaccess.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/player")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
