package Lesson4;

import Lesson3.MyQueue;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<String> mll = new MyLinkedList<>();
//        mll.insertFirst("Katia");
//        mll.insertFirst("Petia");
//        mll.insertFirst("Maria");
//
//        System.out.println(mll);
//
//        mll.insertLast("Bob");
//        System.out.println(mll);
//
//

//        System.out.println(mll.deleteFirst());
//        System.out.println(mll);
//
//        System.out.println(mll.getFirst());

//        mll.insert(1, "Sasha");
//        System.out.println(mll);
//
//        System.out.println(mll.delete("Bob"));
//        System.out.println(mll);
//
//
//        for (String s : mll) {
//            System.out.println(s);
//        }


            System.out.println("queuq");

            MyLinkedQueue<Integer> que = new MyLinkedQueue<>();

            que.insert(5);
            que.insert(3);
            que.insert(1);
            que.insert(0);
            que.insert(2);
            que.insert(4);

        System.out.println(que.peek());
        for (int i = 5; i > 0; i--) {
            que.remove(i);
            System.out.println(que.peek());
        }


    }
}
