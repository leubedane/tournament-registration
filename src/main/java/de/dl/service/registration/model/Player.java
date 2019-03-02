package de.dl.service.registration.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
public class Player {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final Club club;
    private final int ttr;

}
