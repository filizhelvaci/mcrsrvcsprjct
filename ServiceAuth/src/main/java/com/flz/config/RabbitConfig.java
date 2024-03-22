package com.flz.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    String directExchangeAuth="direct-exchange-auth";
    String bindingKeyAuthSave="binding-key-auth-save";
    String queueAuth="queue-auth";

    @Bean
    public DirectExchange directExchangeAuth(){
        return new DirectExchange(directExchangeAuth);
    }

    @Bean
    public Queue queueAuth(){
        return new Queue(queueAuth);
    }

    @Bean
    public Binding bindingDirectExchangeQueueAuth(final Queue queueAuth,
                                                  final DirectExchange directExchangeAuth){
        return BindingBuilder.bind(queueAuth()).to(directExchangeAuth()).with(bindingKeyAuthSave);
    }
}
