package com.ssafy.travelcompass.global.util.mail;

import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

@Component
public class MailSenderImpl implements MailSender {
	/** 메일 HOST **/
	private final String HOST = "smtp.naver.com";
	/** 메일 PORT **/
	private final String PORT = "587";
	/** 메일 ID **/
	private final String MAIL_ID = "ssafy6843@naver.com";
	/** 메일 PW **/
	private final String MAIL_PW = "qwer123!@#";
	
	@Override
	public void sendNewPassword(String email, String password) throws MessagingException {
		sendNotiMail(email, "여행 나침반에서 새로운 비밀번호를 안내드립니다.", "새로운 비밀번호는 아래와 같습니다. \n" + password);
	}

	@Override
	public String sendEmailAuth(String email) throws MessagingException {
		
		Random random = new Random();
        String randomKey = String.valueOf(random.nextInt(900000) + 100000); // 6자리 랜덤 키 생성
        
        String content =
                        "인증 번호는 " + randomKey + "입니다." + 
                        "<br>" + 
                        "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";
        
        sendNotiMail(email, "여행 나침반에서 이메일 인증코드를 안내드립니다.", content);
        
		return randomKey;
	}
	
	public void sendNotiMail(String email, String subject, String body) {
		
		try {
			System.out.println("sendNoti");
			System.out.println(email);
			System.out.println(subject);
			
			InternetAddress[] receiverList = new InternetAddress[1];
			receiverList[0] = new InternetAddress(email);
			
			// SMTP 발송 Properties 설정
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.host", HOST);
			props.put("mail.smtp.port", PORT);
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.ssl.trust", HOST);
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.ssl.protocols", "TLSv1.2");
			
			// SMTP Session 생성
			Session mailSession = Session.getInstance(props, new javax.mail.Authenticator(){
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication(MAIL_ID, MAIL_PW);
				}
			});
			
			// Mail 조립
			Message mimeMessage = new MimeMessage(mailSession);
			mimeMessage.setFrom(new InternetAddress(MAIL_ID));
			mimeMessage.setRecipients(Message.RecipientType.TO, receiverList);
            		// 메일 제목
			mimeMessage.setSubject(subject);
            		// 메일 본문 (.setText를 사용하면 단순 텍스트 전달 가능)
			mimeMessage.setContent(body, "text/html; charset=UTF-8");
			
			// Mail 발송
			Transport.send(mimeMessage);
			
		} catch(Exception e) {
			System.out.println("메일 실패");
			e.printStackTrace();
		}
		
	}
}
