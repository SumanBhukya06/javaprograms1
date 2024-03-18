package UTubePractice;

import java.util.Scanner;

public class GretestOfThreeNumbersUsingUserIP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=scanner.nextInt();
        System.out.println("Enter the second number:");
        int b=scanner.nextInt();
        System.out.println("Enter the third number:");
        int c=scanner.nextInt();
        if (a>b && a>c)
        {
            System.out.println("The gretest number is a"+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("The grestest number is b:"+b);

        }
        else {
            System.out.println("The gretest number is c:"+c);
        }

    }



}
