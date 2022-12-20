package com.example.journal.mail;

import jakarta.servlet.http.HttpServletRequest;

public interface MailService {
    public String envoyerMail(HttpServletRequest request);
}
