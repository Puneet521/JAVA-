package BASICS;// To calculate Fibonacci Series up to n numbers


import java.util.Scanner;

public class FIBONACCI_SERIES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 =0;
        int num2 =1;
        int num3;
        System.out.print("ENTER THE TERM UPTO WHICH YOU WANT THE FABONACCI SERIES: ");
        int range = input.nextInt();
        for (int i=0; i<range; i++){
            num3=num1+num2;
            System.out.println(num1);
            num1=num2;
            num2=num3;
        }
    }
}
