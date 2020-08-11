package Lesson5;

public class Goods {

    private String nameGoods;
    private double weigth;
    private double price;

    public Goods(String nameGoods, double weigth, double price) {
        this.nameGoods = nameGoods;
        this.weigth = weigth;
        this.price = price;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + nameGoods + '\'' +
                ", weigth=" + weigth +
                ", price=" + price +
                "}\n";
    }
}


