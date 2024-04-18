package UTubePractice;

import java.util.Scanner;

public class VoteUserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age:");
        int sc=scanner.nextInt();
        if (sc>=18)
        {
            System.out.println("Eligible To Vote!!");
        }
        else
        {
            System.out.println("Not Eligible to vote!!!");
        }

    }
}
