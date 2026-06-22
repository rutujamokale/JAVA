package com.transflower.services;

public class SMSService implements NotificationService {

  
    public void send(String message) {
        System.out.println("SMS: "+ message);
    } 
}