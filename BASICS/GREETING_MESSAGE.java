// Take name as input and print a greeting message for that particular name.

import java.util.Locale;
import java.util.Scanner;

public class GREETING_MESSAGE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NAME: ");
        String name = input.next().toUpperCase();
        System.out.println("WELCOME "+name+", HAVE A NICE DAY");
    }
}
