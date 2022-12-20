package com.example.journal.mail;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    private MailServiceClass ms;

    @PostMapping("/envoyerMail")
    public String envoyerMail(@RequestBody HttpServletRequest request){
        String statut=ms.envoyerMail(request);
        return statut;
    }
}
