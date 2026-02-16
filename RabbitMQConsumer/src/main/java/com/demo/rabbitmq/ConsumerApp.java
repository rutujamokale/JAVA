package com.demo.rabbitmq;

import java.nio.charset.StandardCharsets;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class ConsumerApp {

    private static final String QUEUE_NAME = "student_queue";

    public static void main(String[] args) {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("192.168.1.35");
            factory.setUsername("appuser");
            factory.setPassword("123456");

            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            channel.basicQos(1); // important

            System.out.println("Waiting for messages...");

            DeliverCallback deliverCallback = (tag, delivery) -> {
                String message = new String(
                        delivery.getBody(),
                        StandardCharsets.UTF_8
                );

                System.out.println("Received: " + message);

                // acknowledge after processing
                channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
            };

            channel.basicConsume(QUEUE_NAME, false, deliverCallback, tag -> {});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
