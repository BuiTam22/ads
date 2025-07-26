package com.zhize.ads.rest;

import com.zhize.ads.dto.MailSendDTO;
import com.zhize.ads.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class MailSendController {

    @Autowired
    private MailSenderService mailSenderService;

    @PostMapping
    public String handleContactForm(@RequestBody MailSendDTO mailSendDTO) {
        mailSenderService.sendContactEmail(mailSendDTO.getUserCustomer(), mailSendDTO.getTeleUser(), mailSendDTO.getWhatsAppUser(), mailSendDTO.getContent());
        return "Gửi thành công!";
    }
}
