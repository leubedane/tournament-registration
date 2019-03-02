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
public class Player {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long playId;

  private String playFirstname;
  private String playLastname;
  private Long playTypeId;
  private java.sql.Timestamp playBirthdate;
  private Long playClubId;
  private Long playPaid;
  private Long playSeed;
  private String playFirstnameshort;
  private Long playExternalid;
  private Long playForeigner;
  private String playNationality;
  private Double playTtr;

}
