package com.zhize.ads.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendContactEmail(String nameCustomer, String teleUser, String whatsAppUser,  String content) {
        System.out.println("===> Gửi mail đang được thực hiện...");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("adszhenliglobal@gmail.com"); // địa chỉ nhận
        message.setSubject("Liên hệ từ khách hàng thuê dịch vụ Facebook");
        message.setText("Họ và tên: "+ nameCustomer + "\nTelegram: " + teleUser + "\nWhatsApp: " + whatsAppUser + "\nNội dung lời nhắn: " + content);

        mailSender.send(message);
        System.out.println("===> Gửi mail thành công");

    }
}
