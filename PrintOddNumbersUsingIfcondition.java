package PracticePrograms.Day5;

public class PrintOddNumbersUsingIfcondition {
    public static void main(String[] args) {
        int i=1;
        while (i<=10)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
            i=i+2;
        }
    }
}
