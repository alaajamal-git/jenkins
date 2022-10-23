package com.kyma.example.service;

import com.kyma.example.model.EmailDetails;
 
// Interface
public interface EmailService {
 
    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);
 
}