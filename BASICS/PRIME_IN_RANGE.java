package BASICS;

import java.util.Scanner;

public class PRIME_IN_RANGE{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE LOWER RANGE:");
        int lowernumber = input.nextInt();
        System.out.print("ENTER THE UPPER RANGE:");
        int uppernumber = input.nextInt();
        System.out.println("THE PRIME NUMBER IN THE ENTERED RANGE ARE: ");
        for (int i=lowernumber; i<=uppernumber; i++){
            int count=0;
            for (int div =2; div*div<=i; div++){
                if (i%div==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
        }

    }
}
