package PracticePrograms;

public class Leapyear {
    public static void main(String[] args) {
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not");
        }

    }
}