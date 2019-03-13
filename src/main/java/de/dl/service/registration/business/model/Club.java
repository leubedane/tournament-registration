package de.dl.service.registration.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Club {
    private final ClubId clubId;
    private final String name;
}
