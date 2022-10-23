package com.kyma.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kyma.example.model.EmailDetails;
import com.kyma.example.service.EmailService;
 
// Annotation
@RestController
// Class
public class EmailController {
 
    @Autowired private EmailService emailService;
 
    
    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
    	System.out.println("done");
        String status
            = emailService.sendSimpleMail(details);
 
        return status;
    }
 
}