package com.biniam.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class HistoryCareTaker {

	private List<EditorStateMemento> states = new ArrayList<>();

	public void push(EditorStateMemento state) {
		states.add(state);
	}

	public EditorStateMemento pop() {
		int lastIndex = states.size() - 1;
		EditorStateMemento lastState = states.get(lastIndex);
		states.remove(lastState);
		return lastState;
	}
}
