package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Goods> bestGoods = null;
    private double maxWieght;
    private double bestPrice;

    //вычисляем общий вес товаров
    private double calculateTotalWeight(List<Goods> goods) {
        double result = 0;
        for (Goods w : goods) {
            result += w.getWeigth();
        }
        return result;
    }

    // вычисляем общую стоимость товаров
    private double calculateTotalPrice(List<Goods> goods) {
        double result = 0;
        for (Goods w : goods) {
            result += w.getPrice();
        }
        return result;
    }

    //проверяем, набор на лучший
    private void checkSet(List<Goods> goods) {
        if (this.bestGoods == null) {
            if (this.calculateTotalWeight(goods) <= this.maxWieght) {
                this.bestGoods = goods;
                this.bestPrice = this.calculateTotalPrice(goods);
            }
        } else {
            if (this.calculateTotalWeight(goods) <= this.maxWieght && this.calculateTotalPrice(goods) > this.bestPrice) {
                this.bestGoods = goods;
                this.bestPrice = this.calculateTotalPrice(goods);
            }
        }
    }

    //ну а здесь собственно рекурсия
    public void makeAllSets(List<Goods> goods) {
        if (goods.size() > 0) {
            this.checkSet(goods);
        }
        for (int i = 0; i < goods.size(); i++) {
            List<Goods> newSet = new ArrayList<>(goods);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public Backpack(double maxW) {
        this.maxWieght = maxW;
    }

    public List<Goods> getBackpack() {
        return this.bestGoods;
    }

}
