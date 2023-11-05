package org.example.core.logging;

public class DatabaseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("The file sended to database : " + data);
    }
}
