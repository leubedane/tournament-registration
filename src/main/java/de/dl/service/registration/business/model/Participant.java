package de.dl.service.registration.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
public class Participant {
    private final ParticipantId participantId;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final int ttr;
    private final Club club;
    private final List<DisciplineId> disciplines;
    private final User user;
}
