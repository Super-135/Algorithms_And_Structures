package Lesson4;

public class MyLinkedQueue<T> {
        private MyLinkedList<T> queue = new MyLinkedList<>();

    public void insert(T item){
        queue.insertFirst(item);
    }

    public T remove(T item){
        return queue.deleteLast();
    }

    public T peek(){
        return queue.getLast();
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

}
