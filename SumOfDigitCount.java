package PracticePrograms.Day5;

public class SumOfDigitCount {
    public static void main(String[] args) {
        int digit,sum=0;
        int number=12;
        while(number>0)
        {
            digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println(sum);

    }
}
