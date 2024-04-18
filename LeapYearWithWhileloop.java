package PracticePrograms.Day5;

public class LeapYearWithWhileloop {
    public static void main(String[] args) {
        int i=1960;
        while(i<=2024)
        {
            if((i%4==0&&i%100!=0)||(i%400==0))
            {
                System.out.println("Leap Year is:"+i);
            }
            i=i+4;
        }
    }
}
