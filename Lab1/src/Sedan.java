public class Sedan extends Car {
    private int length;

    Sedan(int speed, double regularPrice, String color, int salePrice, int length) {
        super(speed, regularPrice, color, salePrice);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(length > 20)
            return  salePrice - salePrice * 0.05;
        else
            return salePrice - salePrice * 0.1;
    }
}
