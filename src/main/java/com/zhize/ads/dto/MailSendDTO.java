package com.zhize.ads.dto;


public class MailSendDTO {
    String userCustomer;
    String teleUser;
    String whatsAppUser;
    String content;

    public MailSendDTO() {
    }

    public MailSendDTO(String userCustomer, String teleUser, String whatsAppUser, String content) {
        this.userCustomer = userCustomer;
        this.teleUser = teleUser;
        this.whatsAppUser = whatsAppUser;
        this.content = content;
    }

    public String getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(String userCustomer) {
        this.userCustomer = userCustomer;
    }

    public String getTeleUser() {
        return teleUser;
    }

    public void setTeleUser(String teleUser) {
        this.teleUser = teleUser;
    }

    public String getWhatsAppUser() {
        return whatsAppUser;
    }

    public void setWhatsAppUser(String whatsAppUser) {
        this.whatsAppUser = whatsAppUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MainSendDTO{" +
                "userCustomer='" + userCustomer + '\'' +
                ", teleUser='" + teleUser + '\'' +
                ", whatsAppUser='" + whatsAppUser + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
