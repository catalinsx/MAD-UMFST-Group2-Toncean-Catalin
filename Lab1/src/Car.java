public class Car {
    private int speed;
    private double regularPrice;
    private String color;
    int salePrice;

    Car(int speed, double regularPrice, String color, int salePrice){
        this.speed  = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.salePrice = salePrice;
    }
    public double getSalePrice(){
        return salePrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }
}
