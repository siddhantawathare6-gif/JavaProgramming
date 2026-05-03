package org.sid.scenario;

public interface EmailNotification {

    default void send() {
        System.out.println("Email sent");
    }
}
