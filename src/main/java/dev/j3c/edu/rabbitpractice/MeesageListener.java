package dev.j3c.edu.rabbitpractice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MeesageListener {
      
    @RabbitListener(queues=MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println("message recieved: " + message);
    }
    
}
