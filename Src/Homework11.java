import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {

        Random random = new Random();
        int rndNum = random.nextInt((99991) + 11);

        System.out.println("Random number is " + rndNum);

        int sumOfDig = 0;
        int number = rndNum;

        while (number > 0) {
            int dig = number % 10;
            sumOfDig += dig;
            number /= 10;
        }
        System.out.println("Сума розрядів цього числа дорівнює: " + sumOfDig);
    }
}
