package dev.j3c.edu.rabbitpractice;

import dev.j3c.edu.rabbitpractice.config.MQConfig;
import dev.j3c.edu.rabbitpractice.dto.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MeesageListener {
      
    @RabbitListener(queues= MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println("message recieved: " + message);
    }
    
}
