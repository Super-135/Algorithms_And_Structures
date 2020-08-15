package Lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyDeQueue<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    //0 1 2 3 4
    //4     8 6
    //      b
    //  e


    public MyDeQueue(int maxSize) {
        list = (T[]) new Object[maxSize];
        begin = 0;
        end = -1;
    }

    public boolean insertLeft(T value) {
        if (isFull()) {
            return false;
        }
        if (begin - 1 < 0) {
            begin = list.length;
        }

        list[--begin] = value;
        size++;
        return true;
    }

    public boolean insertRight(T value) {
        if (isFull()) {
            return false;
        }
        if (end == list.length - 1) {
            end = -1;
            return false;
        }

        list[++end] = value;
        size++;
        return true;
    }

    public T removeLeft() {
        if (isEmpty()) {
            return null;
        }
        if (begin == list.length) {
            begin = 0;
        }

        T remValue = list[begin++];
        size--;
        return remValue;
    }


    public T removeRight() {
        if (isEmpty()) {
            return null;
        }
        if (end < 0) {
            end = list.length - 1;
        }
        size--;
        T remValue = list[end--];

        return remValue;
    }


    public T peekFront() {
        return list[begin];
    }


    public int size() {
        return size;
    }


    public boolean isFull() {
        return list.length == size;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
}
