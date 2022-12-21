// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LARGEST_NUMBER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER: ");
        int num1 = input.nextInt();
        System.out.print("ENTER THE SECOND NUMBER: ");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("THE ENTER VALUE "+num1+" is greater than "+ num2);
        }
        else if (num1==num2){
            System.out.println("BOTH ENTERED VALUES ARE EQUALS");
        }
        else {
            System.out.println("THE ENTER VALUE "+num2+" is greater than "+ num1);
        }
    }
}
