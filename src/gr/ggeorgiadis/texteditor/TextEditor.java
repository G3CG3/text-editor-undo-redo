package gr.ggeorgiadis.texteditor;

import java.util.ArrayDeque;

public class TextEditor {
    private StringBuilder text;
    private ArrayDeque<String> undoStack;
    private ArrayDeque<String> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new ArrayDeque<>();
        redoStack = new ArrayDeque<>();
    }

    public void type(String newText) {
        undoStack.push(text.toString());
        text.append(newText);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text.toString());
            text = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text.toString());
            text = new StringBuilder(redoStack.pop());
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public String getText() {
        return text.toString();
    }
}
