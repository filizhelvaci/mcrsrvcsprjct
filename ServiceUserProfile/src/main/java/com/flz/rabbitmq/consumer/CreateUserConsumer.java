package com.flz.rabbitmq.consumer;

import com.flz.model.UserProfile;
import com.flz.rabbitmq.model.AuthSaveModel;
import com.flz.service.ServiceUserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CreateUserConsumer {

    //private final RabbitTemplate rabbitTemplate;
    private final ServiceUserProfile serviceUserProfile;

    @RabbitListener(queues = "queue-auth")
    public void createUserFromQueue(AuthSaveModel model){

          //rabbitTemplate.isReturnListener();
         serviceUserProfile.save(UserProfile.builder()
                         .authId(model.getAuthId())
                         .username(model.getUsername())
                         .email(model.getEmail())
                         .build());


    }
}
