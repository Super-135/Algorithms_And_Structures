package Lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int countT = 100000;
        int balance = 0;
        for (int i = 0; i < countT; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int x = 0;
            while (map.height() < 6){
                x = random.nextInt(2000)-1000;
                map.put(x,x);
            }
            map.delete(x);
            if (map.balance()){
                balance++;
            }
        }

        System.out.println("Балансированных деревьев " + balance + " из "+countT);
        System.out.println("Несбалансированные в процентах " + (double) (countT-balance) / countT * 100 + "%");

    }
}
