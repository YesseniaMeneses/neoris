package com.neoris.clientservice.repository;

import com.neoris.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Client entity.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByClientId(Long clientId);
}
