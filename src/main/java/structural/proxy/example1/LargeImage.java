package structural.proxy.example1;

public class LargeImage implements ExpensiveObject {

    private final String fileName;
    private final byte[] content;

    public LargeImage(String fileName) {
        this.fileName = fileName;
        this.content = loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file: " + fileName + " content: " + new String(content));
    }

    private byte[] loadFromDisk(String fileName) {
        System.out.println("Loading file: " + fileName + "from disk.");
        return "VERY LARGE FILE".getBytes();
    }
}
