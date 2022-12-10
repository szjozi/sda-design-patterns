package behavioral.iterator;

public class PaymentsIterator implements MyIterator<Payment> {

    private int index;
    private final Payment [] payments;

    public PaymentsIterator(Payment[] payments) {
        this.payments = payments;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < payments.length;
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Payment next() {
        return payments[index++];
    }

    @Override
    public Payment current() {
        return payments[index];
    }

    @Override
    public Payment previous() {
        return payments[index - 1];
    }
}
