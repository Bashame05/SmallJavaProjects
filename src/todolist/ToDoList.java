package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    static boolean isRunning=true;
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner bleh = new Scanner(System.in);
    public static void main(String[] args) {
        while(isRunning){
            System.out.println("******************");
            System.out.println("    TO DO LIST    ");
            System.out.println("******************");
            System.out.println("******************");
            System.out.println("       MENU      ");
            System.out.println("1:ADD A TASK");
            System.out.println("2:VIEW TASK");
            System.out.println("3:EXIT");
            System.out.println("Enter your choice(1-3):");
            int choice = bleh.nextInt();
            bleh.nextLine();

            switch(choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    isRunning=false;
                    break;
                default:
                    System.out.println("ENTER A VALID CHOICE!!!");
                    break;
            }
        }
    }

    private static void viewTask() {
        int idx=1;
        for (String task : tasks) {
            System.out.println(idx + ":" + task);
            idx++;
        }
    }

    private static void addTask() {
        System.out.println("Enter your task:");
        String task = bleh.nextLine();
        tasks.add(task);
        System.out.println("TASK ADDED");
    }
}
