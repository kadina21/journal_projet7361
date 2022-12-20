package com.example.journal.mail;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceClass implements MailService{
    @Autowired
    private JavaMailSender jms;
    @Value("${spring.mail.username}")
    private String envoyeur;

    @Override
    public String envoyerMail(HttpServletRequest request) {
        try {
            SimpleMailMessage smm = new SimpleMailMessage();
            System.out.println("apres smm");
            smm.setFrom(envoyeur);
            System.out.println("apres setfrom");
            String destinataire=request.getParameter("destinataire");
            smm.setTo(destinataire);
            System.out.println("apres setto");
            String message=request.getParameter("message");
            smm.setText(message);
            System.out.println("apres settext");
            String objet=request.getParameter("objet");
            smm.setSubject(objet);
            System.out.println("apres setsubject");
            jms.send(smm);
            System.out.println("apres envoi");
            return "Envoi réussi";
        } catch (Exception e) {
            return "Echec de l'envoi";
        }
    }
}
