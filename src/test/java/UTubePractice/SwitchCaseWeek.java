package UTubePractice;

import java.util.Scanner;

public class SwitchCaseWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select a alaphabet(1/2/3/4):");
        int week=scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                    System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            default:
                System.out.println("Sunday");break;
        }
    }
}
