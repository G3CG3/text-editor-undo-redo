package gr.ggeorgiadis.texteditor;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        System.out.println(editor.getText()); // Hello

        editor.type(" World");
        System.out.println(editor.getText()); // Hello World

        editor.undo();
        System.out.println(editor.getText()); // Hello

        editor.redo();
        System.out.println(editor.getText()); // Hello World
    }
}
