package com.biniam.designpattens.memento;

public class EditorStateMemento {
	// make it robust by labeling it as final
	private final String content;

	public EditorStateMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
