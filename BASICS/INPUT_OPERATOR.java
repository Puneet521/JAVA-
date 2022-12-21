// Take in two numbers and an operator (+, -, *, /) and calculate the value. (use if conditions)

import java.util.Scanner;

public class INPUT_OPERATOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER: ");
        float num1 =input.nextFloat();
        System.out.print("ENTER THE SECOND NUMBER: ");
        float num2 =input.nextFloat();
        System.out.print("ENTER ONE OF THE FOLLOWING OPERATORS +,-,*,/,% :");
        char operator = input.next().charAt(0);
        float result=0;
        if (operator =='+'){
            result=num1+num2;
        }
        else if (operator=='-') {
            result=num1-num2;
        }
        else if (operator=='*') {
            result=num1*num2;
        }
        else if (operator=='/') {
            result=num1/num2;
        }
        else if (operator=='%') {
            result=num1%num2;
        }
        else {
            System.out.println("PLEASE ENTER THE OPERATOR AGAIN MIGHT YOU HAVE HAVE ENTERED INCORRECT VALUE");
        }
        System.out.println("THE RESULT OF THE DESIRED OPERATION IS: "+ result );

    }
}
