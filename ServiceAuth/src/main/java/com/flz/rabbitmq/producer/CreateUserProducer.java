package com.flz.rabbitmq.producer;

import com.flz.rabbitmq.model.AuthSaveModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class CreateUserProducer {

    private final RabbitTemplate rabbitTemplate;

    public void convertAndSend(AuthSaveModel model){
        rabbitTemplate.convertAndSend("direct-exchange-auth",
                "binding-key-auth-save",
                model);

    }
}
