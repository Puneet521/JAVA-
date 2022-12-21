package BASICS;

import java.util.Scanner;

public class DIGIT_COUNT_IN_NUMBER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int number = input.nextInt();
        int digit=0;
        while(number!=0){
            number=number/10;
            digit++;
        }
        System.out.println("THE ENTERED NUMBER HAS "+digit+" DIGITS");
    }
}
