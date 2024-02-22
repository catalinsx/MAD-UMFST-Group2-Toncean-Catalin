import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* exercise 1
        System.out.println("Type in the number: ");
        int number = scanner.nextInt();
        if(number >= 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative");

         */

        /*
        exercise 2
        double sum = 0;
        double[] array = {1,2,3,4,5,6,7,8,9,10};
        for (double i : array)
            sum = sum + i;
        double average = sum / array.length;
        System.out.println(average);

         */

/* exercise 3
        for(int i = 3; i<100; i++){
            if(isPrime(i) && isPrime(i+2)) {
                int i2 = i+2;
                System.out.println("(" + i + "," + i2+ ")");
            }
        }

 */

        // ex5

        Sedan sedan = new Sedan(200, 13.300, "red", 15000, 320);
        Ford ford = new Ford(150,8778.2, "blue", 10000, 2015, 10);
        Ford ford2 = new Ford(170,18778.2, "royal blue", 23000, 2025, 10);
        Car car = new Car(100, 100000, "red", 12300);

        System.out.println(sedan.getSalePrice());
        System.out.println(ford.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car.getSalePrice());
    }
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n/2; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}