package behavioral.memento;

public class Main {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();

        textEditor.write("This");
        textEditor.write("This is");
        textEditor.write("This is memento");
        textEditor.write("This is memento pattern");

        System.out.println("=========================");

        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
    }
}
