package com.neoris.movementsservice.repository;

import com.neoris.movementsservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Client entity.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByClientId(Long clientId);
}
