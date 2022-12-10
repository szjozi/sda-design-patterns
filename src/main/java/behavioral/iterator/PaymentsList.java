package behavioral.iterator;

public record PaymentsList(Payment[] payments) implements MyList<Payment> {

    @Override
    public MyIterator<Payment> iterator() {
        return new PaymentsIterator(payments);
    }
}
