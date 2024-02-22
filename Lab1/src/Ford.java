public class Ford extends Car{
    private int year;
    private int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int salePrice, int year
    ,int manufacturerDiscount) {
        super(speed, regularPrice, color, salePrice);
        this.manufacturerDiscount = manufacturerDiscount;
        this.year = year;
    }

    @Override
    public double getSalePrice() {
        return salePrice - (double) (salePrice * manufacturerDiscount) / 100;
    }
}
