package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "dummy I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("MOdified for Webhook Test!!");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
