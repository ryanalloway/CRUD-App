package me.ryanalloway.crud.model;

public class Task {
	private String title;
	private String description;

	private boolean completed;

	public Task(String title, String description, boolean completed) {
		this.title = title;
		this.description = description;
		this.completed = completed;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
