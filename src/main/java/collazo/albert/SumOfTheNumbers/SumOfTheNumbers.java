package collazo.albert.SumOfTheNumbers;

import java.util.Scanner;

public class SumOfTheNumbers {

    int sum;

    public static void main(String[] args) {

        SumOfTheNumbers numbers = new SumOfTheNumbers();

        System.out.println("Enter a whole number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        System.out.println("Here is your number: "+ numbers.sumFunction(n));
    }

        public int sumFunction(int num){
            for (int i = 0; i <= num; i++) {
                sum += i;

            }

            return sum;
    }

}

