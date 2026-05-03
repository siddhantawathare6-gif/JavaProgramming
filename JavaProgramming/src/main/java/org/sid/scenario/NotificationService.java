package org.sid.scenario;

public class NotificationService implements EmailNotification,SmsNotification{
    @Override
    public void send() {
        System.out.println("NotificationService");
        EmailNotification.super.send();

    }

    public static void main(String[] args) {
        NotificationService notificationService=new NotificationService();
        notificationService.send();
    }
}
