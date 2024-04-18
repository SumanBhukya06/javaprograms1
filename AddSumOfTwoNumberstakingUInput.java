package UTubePractice;

import java.util.Scanner;

public class AddSumOfTwoNumberstakingUInput {
    public static void main(String[] args) {
      /*  Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=scanner.nextInt();
        System.out.println("Enter the second number:");
        int b=scanner.nextInt();
        System.out.println("the sum"+a+"and"+b+"is:"+(a+b));*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the maximum number:");
        int a= sc.nextInt();
        for (int i=1;i<a;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }


    }

}
