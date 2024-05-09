package com.neoris.clientservice.service;

import com.neoris.clientservice.domain.AsyncClient;

/**
 * Interface for queue methods.
 */
public interface ProducerQueueService {

    /**
     * Send a message to queue.
     *
     * @param client
     */
    void sendMessage(AsyncClient client);
}
