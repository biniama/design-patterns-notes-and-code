package com.biniam.designpatterns.memento;

/**
 * Memento Pattern according to Mosh
 * https://www.youtube.com/watch?v=NU_1StN5Tkk&t=2452s
 */
public class Main {

    public static void main(String[] args) {
		var editor = new EditorOriginator();
		var history = new HistoryCareTaker();

	    editor.setContent("a");
	    history.push(editor.createState());

	    editor.setContent("b");
	    history.push(editor.createState());

	    editor.setContent("c");
	    editor.restore(history.pop());

	    System.out.println(editor.getContent());
    }
}
