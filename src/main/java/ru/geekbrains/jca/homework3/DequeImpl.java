package ru.geekbrains.jca.homework3;

public class DequeImpl <E> implements Deque<E> {
    protected final E[] data;
    protected int size;

    protected int tail;
    protected int head;

    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;

    public DequeImpl(int maxSize) {
        this.data = (E[])new Object[maxSize];
        head = HEAD_DEFAULT;
        tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;
        return true;
    }



    @Override
    public boolean insertLeft(E value) {

        if (isFull()) {
            return false;
        }

        for (int i = data.length-1; i > 0; i--) {  // Сдвиг массива вправо, чтобы освободить место для вставки элемента слева. Не могу понять почемему не работает.
            data[i]= data[i-1];                    //
        }
        data[0] = null;

        if (head == data.length) {
            head = HEAD_DEFAULT;
        }

        data[head] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        E value = data[tail--];
        size--;
        return value;
    }


    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);
            if (i != tail) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }



}
