package com.mouse.jms.demo;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Mahone Wu on 2016/8/17.
 */
public class TestJms {
    public static final String user = "system";
    public static final String password = "manager";
    public static final String url = "tcp://localhost:61616";
    public static final String queueName = "test_queue";
    public static final String messageBody = "Hello JMS!";
    public static final boolean transacted = false;
    public static final boolean persistent = false;

    public static void main(String[] args){
        Connection connection = null;
        Session session = null;

        try{
            // create the connection
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(user, password, url);
            connection = connectionFactory.createConnection();
            connection.start();

            // create the session
            session = connection.createSession(transacted, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue(queueName);

            // create the producer
            MessageProducer producer = session.createProducer(destination);
            if (persistent){
                producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            }else{
                producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            }

            // create text message
            Message message = session.createTextMessage(messageBody);

            // send the message
            producer.send(message);
            System.out.println("Send message: " + ((TextMessage)message).getText());

            // create the consumer
            MessageConsumer consumer = session.createConsumer(destination);
            // blocking till receive the message
            Message recvMessage = consumer.receive();
            System.out.println("Receive message: " + ((TextMessage)recvMessage).getText());

        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                // close session and connection
                if (session != null){
                    session.close();
                }
                if (connection != null){
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
