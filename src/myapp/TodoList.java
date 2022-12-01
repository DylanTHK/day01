package myapp;

import java.io.Console;
import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        
        Console cons = System.console();

        String item;

        List<Integer> listOfInt = new LinkedList<>();

        while (true) {
            String newInteger = cons.readLine("Please enter number: ");

            if(newInteger.equals("stop")) {
                break;
            }
            listOfInt.add(Integer.parseInt(newInteger));
        }


        for (int i = 0; i < listOfInt.size(); i++) {
            System.out.println(listOfInt.get(i));
        }

    }
}