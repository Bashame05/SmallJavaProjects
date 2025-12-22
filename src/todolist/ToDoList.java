package todolist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoList {
    static boolean isRunning=true;
    static ArrayList<Task> tasks = new ArrayList<>();
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
            System.out.println("3:MARK AS DONE");
            System.out.println("4:EXIT");
            int choice;
            try {
                System.out.print("Enter your choice(1-3):");
                choice = bleh.nextInt();
                bleh.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid choice ");
                bleh.nextLine();
                continue;
            }

            switch(choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    markTask();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("ENTER A VALID CHOICE!!!");
                    break;
            }
        }
    }

    private static void markTask() {
        System.out.print("Enter which number of task to mark: ");
        int id  = bleh.nextInt()-1;
        bleh.nextLine();
        Task task = tasks.get(id);
        if(task.getStatus()!= STATUS.COMPLETED) {
            task.markCompleted();
            System.out.println("***************");
            System.out.println("TASK COMPLETED");
        }else{
            System.out.println("Task is already completed");
        }
    }

    private static void viewTask() {
        int idx=1;
        System.out.println("***************");
        for (Task task : tasks) {
            System.out.println(idx + ": [" + task.getStatus() + "]" + task.getTask());
            idx++;
        }
    }

    private static void addTask() {
        System.out.println("***************");
        System.out.print("Enter your task:");
        String task = bleh.nextLine();
        tasks.add(new Task(task));
        System.out.println("TASK ADDED");
    }
}
