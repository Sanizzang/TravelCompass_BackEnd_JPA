package com.ssafy.travelcompass.global.util.mail;

import javax.mail.MessagingException;

public interface MailSender {
	void sendNewPassword(String email, String password) throws MessagingException;
	String sendEmailAuth(String email) throws MessagingException;
}
