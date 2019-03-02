package de.dl.service.registration.api;

import de.dl.service.registration.dbaccess.entity.Typeperplayer;
import de.dl.service.registration.dbaccess.repository.TypeperplayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/participant")
public class ParticipantsController {

    @Autowired
    private TypeperplayerRepository typeperplayerRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Typeperplayer> getAllParticipants() {
        return typeperplayerRepository.findAll();
    }
}
