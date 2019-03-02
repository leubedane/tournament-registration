package de.dl.service.registration.dbaccess.repository;

import de.dl.service.registration.dbaccess.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
