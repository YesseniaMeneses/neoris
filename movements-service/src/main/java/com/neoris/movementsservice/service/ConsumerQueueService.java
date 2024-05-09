package com.neoris.movementsservice.service;

import com.neoris.movementsservice.entity.Client;

/**
 * Interface for Consumer queue.
 */
public interface ConsumerQueueService {

    /**
     * Receive a message from queue.
     *
     * @param client
     */
    void receiveMessage(Client client);
}
