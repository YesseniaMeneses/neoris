package com.neoris.movementsservice.repository;

import com.neoris.movementsservice.entity.Account;
import com.neoris.movementsservice.entity.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository for Movement entity.
 */
public interface MovementRepository extends JpaRepository<Movement, Long> {

    List<Movement> findByAccount(Account account);
}
