package com.example.springbootrabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RabbitMqConfiguration {

    @Value("${sr.rabbit.queue.name}")
    private String queueName;

    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Bean
    public Queue queue(){
        return new Queue(queueName);
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(exchangeName);
    }

    public Binding binding(final Queue queue, final DirectExchange directExchange){
        return BindingBuilder.bind(queue).to(directExchange).with(routingName);
    }
}
