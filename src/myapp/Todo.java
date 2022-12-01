package myapp;

public class Todo {
    
    public static void main(String[] args) {
        // creating an array in java
        String[] tasks = new String[3];

        tasks[0] = "apple";
        tasks[1] = "banana";
        tasks[2] = "carrot";

        int i = 0;
        while (i < tasks.length) {
            System.out.println(tasks[i]);
            i++;
        }
    }
}
