package behavioral.iterator;


public class Main {

    public static void main(String[] args) {

        Payment[] payments = {
                new Payment("Water bill", 155.34),
                new Payment("Gas bill", 543.10),
                new Payment("Electricity bill", 205.32)
        };

        PaymentsList paymentList = new PaymentsList(payments);
        MyIterator<Payment> paymentIterator = paymentList.iterator();

        System.out.println("Payments List: ");

        while (paymentIterator.hasNext()) {
            System.out.println("Has next: " + paymentIterator.hasNext());
            System.out.println("Has previous: " + paymentIterator.hasPrevious());

            System.out.println(paymentIterator.current());
            paymentIterator.next();
            System.out.println("Has next: " + paymentIterator.hasNext());
            System.out.println("==============================");
        }
    }
}
