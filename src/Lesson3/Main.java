package Lesson3;

public class Main {
    public static void main(String[] args) {

        //flipLine();
//        testqueue();
        testDeque();
    }

    private static void flipLine() {

        System.out.println("Переворачиваем строку");

        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop());
        }
    }


    private static void testqueue() {

        System.out.println("queuq");

        MyQueue<Integer> que = new MyQueue<>(10);
        que.insert(0);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);

    }


    private static void testDeque() {

        MyDeQueue<Integer> deque = new MyDeQueue<>(10);
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(0);
        deque.insertRight(5);

        System.out.println("Текущий элемент "+ deque.peekFront());

        while (!deque.isEmpty()){
            System.out.print(deque.removeRight()+" ");
        }
    }
}
