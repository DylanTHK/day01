package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args) {
        
        // getting system console
        Console cons = System.console(); // only available is java.io.Console is imported

        // Read from the console, result is assigned to variable
        String name = "";

        while (name.trim().length() == 0) {
            name = cons.readLine("What is your name? ");
        }

        switch (name.trim()) {
            case "fred":
                System.out.println("Yabadabadoo!");
                break;
            case "barney":
                System.out.println("It's time to suit up.");
                break;
            default:
                System.out.printf("Hello %s.\n\tNice to make your acquaintance.\n", name);
                break;
        }
        
    }
}
