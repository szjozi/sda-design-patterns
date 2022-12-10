package behavioral.memento;

public class TextArea {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextSnapshot saveSnapshot() {
        return new TextSnapshot(text);
    }

    public void restore(TextSnapshot textSnapshot) {
        text = textSnapshot.text();
    }
}
