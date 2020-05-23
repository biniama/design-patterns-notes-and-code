package com.biniam.designpatterns.memento;

public class EditorOriginator {

	private String content;

	public EditorStateMemento createState() {
		return new EditorStateMemento(content);
	}

	public void restore(EditorStateMemento state) {
		content = state.getContent();
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
