package com.neoris.clientservice.service.impl;

import com.neoris.clientservice.domain.AsyncClient;
import com.neoris.clientservice.service.ProducerQueueService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.neoris.clientservice.config.QueueConfig.CLIENT_KEY;

/**
 * Producer Queue methods.
 */
@Service
public class ProducerQueueServiceImpl implements ProducerQueueService {

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public ProducerQueueServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * Send message to queue.
     *
     * @param client
     */
    @Override
    public void sendMessage(AsyncClient client) {
        rabbitTemplate.convertAndSend(CLIENT_KEY, CLIENT_KEY, client);
    }
}
