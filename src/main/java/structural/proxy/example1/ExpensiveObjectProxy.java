package structural.proxy.example1;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private LargeImage largeFile;

    @Override
    public void display() {
        if (largeFile == null) {
            largeFile = new LargeImage("Large file");
        }
        largeFile.display();
    }
}
