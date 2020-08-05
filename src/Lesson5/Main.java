package Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
        List<Goods> goods = new ArrayList<>();
        goods.add(new Goods("Нож", 3, 600));
        goods.add(new Goods("Спички", 2, 5000));
        goods.add(new Goods("Хлеб", 4, 1500));
        goods.add(new Goods("Тушенка", 6, 40000));
        goods.add(new Goods("Компас", 1, 500));
        goods.add(new Goods("Гиря", 6, 1));

        Backpack backpack = new Backpack(15);
        backpack.makeAllSets(goods);
        System.out.println(goods);
        System.out.println("-------------------------------------");
        System.out.println(backpack.getBackpack());

        System.out.println("-------------------------------------");
        System.out.println("возведение в степень");

        System.out.println(Exponentiation(2,5));

    }

    public static int Exponentiation(int a, int n){
        if (n == 1){
            return a;
        } else {
            return a*(Exponentiation(a,n-1));
        }
    }
}
