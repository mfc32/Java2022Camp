package arkadassayilar;

public class ArkadasSayilar {

    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;

        int sumOfDivisiorNumber1 = 0;
        int sumOfDivisiorNumber2 = 0;

        for (int i = 1; i <= number1 / 2; i++) {
            if (number1 % i == 0) {
                sumOfDivisiorNumber1 = sumOfDivisiorNumber1 + i;
            }
        }

        for (int i = 1; i <= number2 / 2; i++) {
            if (number2 % i == 0) {
                sumOfDivisiorNumber2 = sumOfDivisiorNumber2 + i;
            }
        }
        if (sumOfDivisiorNumber1 == number2 && sumOfDivisiorNumber2 == number1) {
            System.out.println("Arkadas sayilar " + number1 + " : " + number2);
        }

    }

}
