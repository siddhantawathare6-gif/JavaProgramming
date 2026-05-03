package org.sid.scenario;

public interface SmsNotification {

    default void send() {
        System.out.println("SMS sent");
    }
}
