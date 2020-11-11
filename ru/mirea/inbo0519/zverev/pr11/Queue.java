package ru.mirea.inbo0519.zverev.pr11;

//invariant n > 0
//a[0], a[1], ... a[n-1] != null

public interface Queue<E> {

    void enqueue(E e);

    E element();

    E dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
