package com.example.todolist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Print items");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to add:");
                    String item = scanner.nextLine();
                    todoList.addItem(item);
                    break;
                case 2:
                    System.out.println("Enter the index of the item to remove:");
                    int index = scanner.nextInt();
                    todoList.removeItem(index);
                    break;
                case 3:
                    todoList.printItems();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }

}
