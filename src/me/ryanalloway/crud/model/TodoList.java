package me.ryanalloway.crud.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TodoList {
	public Map<String, Task> tasks;
	
	public TodoList() {
		tasks = new HashMap<String, Task>();
	}
	
	public String addTask(String title, String description) {
		String taskId = UUID.randomUUID().toString();
		tasks.put(taskId, new Task(title, description, false));
		return taskId;
	}
	
	public void removeTask(String taskId) {
		tasks.remove(taskId);
	}
	
	public void completeTask(String taskId) {
		tasks.get(taskId).setCompleted(true);
		tasks.remove(taskId);
	}
	
	public void getActiveTasks() {
		if (!(tasks.isEmpty())) {
			for(String taskId : tasks.keySet()) {
				String taskTitle = tasks.get(taskId).getTitle();
				String taskDescription = tasks.get(taskId).getDescription();
				
				boolean isTaskCompleted = tasks.get(taskId).isCompleted();
				
				if (!(isTaskCompleted)) {
					System.out.println("Task \"" + taskTitle + " - " + taskDescription + "\" (Task Id: " + taskId + ") is pending completion.");
				} else {
					System.out.println("There are no pending tasks available.");
				}
			}
		}
	}
}
