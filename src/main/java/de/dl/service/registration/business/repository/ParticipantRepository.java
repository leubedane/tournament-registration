package de.dl.service.registration.business.repository;

import de.dl.service.registration.business.model.Participant;
import de.dl.service.registration.dbaccess.repository.TypeperplayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ParticipantRepository {

    @Autowired
    private TypeperplayerRepository typeperplayerRepository;

    public Participant saveOrUpdateParticipant(Participant participant){
        return participant;
    }
}
