package BASICS;

import java.util.Scanner;

public class PRIME_NONPRIME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER UPTO WHICH TERM YOU WANT TO CHECK NUMBER IS PRIME OR NOT: ");
        int TERMS = input.nextInt();
        for (int i=0; i<TERMS; i++){
            int NUMBER = input.nextInt();

            int count =0;
            for(int div=2; div*div<=NUMBER; div++) {
                if (NUMBER % div == 0) {
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(NUMBER+ " IS PRIME");
            }
            else {
                System.out.println(NUMBER+ " IS NOT PRIME");
            }
        }
    }
}
