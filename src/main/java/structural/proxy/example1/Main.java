package structural.proxy.example1;

public class Main {

    public static void main(String[] args) {

        ExpensiveObjectProxy proxy = new ExpensiveObjectProxy();

        proxy.display();
        proxy.display();
        proxy.display();
    }
}
