// Input currency in rupees and output in USD

import java.util.Scanner;

public class RUPEES_CONVERSION {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("ENTER THE RUPEES THAT YOU WANT TO CONVERT INTO DOLLARS: ");
        float rupees = input.nextFloat();
        float dollar = rupees/82.29f;
        System.out.println("THE "+rupees+ " RUPEES are equal to "+dollar+" USD");
    }
}
