package sumOfOddDigits;

import java.util.Scanner;
public class Sumofodds {
    static int sumOddDigits(int n){
    int number = n;
    int sum = 0;

    while (number>0){
        if((number%10)%2!=0){
            sum += number%10;
        }
        number /=10;
    }
        number = sum;
        return number;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = num.nextInt();
        System.out.println(Sumofodds.sumOddDigits(number));
    }
}
