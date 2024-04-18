package PracticePrograms.Day5;

public class CountDigits {
    public static void main(String[] args) {
        int count=0;
        int number=101;
        while(number>0)
        {
            number=number/10;
            count++;
        }
        System.out.println(count);
    }
}
