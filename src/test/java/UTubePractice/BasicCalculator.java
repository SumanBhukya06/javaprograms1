package UTubePractice;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.Math.*;
public class BasicCalculator{
    public static void main(String[] args) {
        //stores two numbers
        double num1,num2;
        //Take input from user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers:");
        //Take the inputs
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/,%):");
        char op=sc.next().charAt(0);
        double o=0;
        switch (op)
        {
            case '+':
                o=num1+num2;
                break;
            case '-':
                o=num1-num2;
                break;
            case '*':
                o=num1*num2;
            case '/':
                o=num1/num2;
            case '%':
                o=num1%num2;
            default:
                System.out.println("you entered wrong number.");
        }
        System.out.println("The final result:");
        System.out.println();
        //Final result
        System.out.println(num1+""+op+""+num2+"="+o);

    }

}
