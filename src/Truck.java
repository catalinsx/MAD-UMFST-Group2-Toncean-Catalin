public class Truck extends Car{
    private int weight;

    Truck(int speed, double regularPrice, String color, int salePrice, int weight) {
        super(speed, regularPrice, color, salePrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(weight > 2000)
            return salePrice - (salePrice * 0.1);
        else
            return salePrice - (salePrice * 0.2);
    }
}
