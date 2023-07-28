package com.example.springbootrabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void produce() {
        for (int i=0;i<100;i++){
            String message = new Date() + "Beijing";
            System.out.println("生产者生产消息=====" + message);
            rabbitTemplate.convertAndSend("rabbitmq_queue", message);
        }
    }


}