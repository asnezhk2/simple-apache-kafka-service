package org.asnezhk.kafkaProject.kafka;

import org.asnezhk.kafkaProject.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    //do logger

    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user) {
    LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
    }
    // a method that keeps track that a JSON message has been received
}
