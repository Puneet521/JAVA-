// Write a program to print whether a number is even or odd, also take input from the user

import java.sql.SQLOutput;
import java.util.Scanner;

public class ODD_EVEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int NUMBER = input.nextInt();
        if (NUMBER%2==0){
            System.out.println("THE ENTERED NUMBER "+ NUMBER +" IS EVEN");
        }
        else{
            System.out.println("THE ENTERED NUMBER "+ NUMBER +"IS ODD");
        }
    }
}
