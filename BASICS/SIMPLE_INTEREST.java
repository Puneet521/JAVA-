// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SIMPLE_INTEREST {
    public static void main(String[] args) {
        System.out.println("ENTER THE VALUE FOR WHICH YOU WANT TO CALCULATE THE SIMPLE INTEREST: ");
        Scanner input = new Scanner(System.in);
        System.out.print("PRINCIPAL:");
        float principal = input.nextFloat();
        System.out.print("TIME:");
        float time = input.nextFloat();
        System.out.print("RATE:");
        float rate = input.nextFloat();
        System.out.print("SIMPLE INTEREST:");
        float interest = (principal*rate*time)/100;
        System.out.println(interest);

    }
}
