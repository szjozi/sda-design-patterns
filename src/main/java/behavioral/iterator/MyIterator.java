package behavioral.iterator;

public interface MyIterator<E> {

    boolean hasNext();

    boolean hasPrevious();

    E next();

    E previous();

    E current();

}
