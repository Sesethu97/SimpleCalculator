package simple.calculator.code;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        double num1, num2;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter operator (+, -, *, /)");
        operator = input.next().charAt(0);

        System.out.println("Enter two numbers separately: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

      
        input.close();

        switch (operator){
            case '+':
                System.out.println(String.format("%.02f + %.02f = %.02f", num1, num2, (num1+num2)));
                break;
            case '-':
                System.out.println(String.format("%.02f - %.02f = %.02f", num1, num2, (num1-num2)));
                break;
            case '*':
                System.out.println(String.format("%.02f * %.02f = %.02f", num1, num2, (num1*num2)));
                break;
            case '/':
                if(num2!=0) {
                    System.out.println(String.format("%.02f / %.02f = %.02f", num1, num2, (num1 / num2)));
                }else{
                    System.out.println("Divided by zero situation");
                }
                break;
            default:
                System.out.println(String.format("%c invalid operator chosen", operator));
        }
    }
}
