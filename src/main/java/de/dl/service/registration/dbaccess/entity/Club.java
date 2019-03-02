package de.dl.service.registration.dbaccess.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Club {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long clubId;

    private String clubName;
    private String clubVerband;

}
