package dev.skamdem.basicApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by kamdem
 */
public class Main {
    public static void main(String[] args) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
        final LocalDateTime now = LocalDateTime.now();

        System.out.println("Most basic maven app! The current time is "  + dtf.format(now));
    }
}
