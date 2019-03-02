package de.dl.service.registration.dbaccess.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Typeperplayer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long typlId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true, name = "typl_play_id")
    private Player player;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true, name = "typl_type_id")
    private Type type;

    private int typlPaid;
    private Timestamp typlTimestamp;

}
