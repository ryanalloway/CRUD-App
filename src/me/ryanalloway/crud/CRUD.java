package me.ryanalloway.crud;

import java.util.Scanner;

import me.ryanalloway.crud.model.TodoList;

public class CRUD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TodoList todoList = new TodoList();

		while (true) {
			System.out.println("Enter a command (add, remove, complete, tasks, exit):");
			String command = input.nextLine();

			switch (command) {
			case "add":
				System.out.println("Please enter a task title: ");
				String title = input.nextLine();

				System.out.println("Please enter a task description: ");
				String description = input.nextLine();

				String addedTaskId = todoList.addTask(title, description);
				System.out.println("Successfully added a new task with ID: " + addedTaskId);
				break;
			case "remove":
				System.out.println("Please enter the Task Id to remove: ");
				String removeTaskId = input.nextLine();

				todoList.removeTask(removeTaskId);
				System.out.println("Successfully removed the task.");
				break;
			case "complete":
				System.out.println("Please enter the Task Id to mark complete: ");
				String completeTaskId = input.nextLine();

				todoList.completeTask(completeTaskId);
				System.out.println("Successfully marked the task as complete.");
				break;
			case "tasks":
				todoList.getActiveTasks();
				break;
			case "exit":
				System.out.println("Exiting the application.");
				input.close();
				return;
			default:
				System.out.println("Invalid command. Please try again.");
				break;
			}
		}
	}
}
