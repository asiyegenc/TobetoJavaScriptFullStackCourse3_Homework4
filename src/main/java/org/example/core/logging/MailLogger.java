package org.example.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("The mail sended to database : " + data);
    }
}
