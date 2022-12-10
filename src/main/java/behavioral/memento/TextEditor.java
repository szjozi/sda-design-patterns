package behavioral.memento;


import java.util.LinkedList;

public class TextEditor {

    private final TextArea textArea;
    private final LinkedList<TextSnapshot> snapshots;

    public TextEditor() {
        this.textArea = new TextArea();
        this.snapshots = new LinkedList<>();
    }

    public void write(String text) {
        textArea.setText(text);
        TextSnapshot snapshot = textArea.saveSnapshot();
        snapshots.push(snapshot);
        System.out.println(textArea.getText());
    }

    public void undo() {
        TextSnapshot snapshot = snapshots.poll();
        if (snapshot != null) {
            textArea.restore(snapshot);
        }
        System.out.println(textArea.getText());
    }
}
