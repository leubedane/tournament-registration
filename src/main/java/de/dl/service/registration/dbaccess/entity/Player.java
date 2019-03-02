package de.dl.service.registration.dbaccess.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class Player {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long playId;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(unique = true, name = "play_club_id")
  private Club club;

  private String playFirstname;
  private String playLastname;
  private Long playTypeId;
  private java.sql.Timestamp playBirthdate;
  private Long playPaid;
  private Long playSeed;
  private String playFirstnameshort;
  private Long playExternalid;
  private Long playForeigner;
  private String playNationality;
  private Double playTtr;


}
