package UTubePractice;

public class Printleap {

    public static void main(String[] args) {
            int year = 2024;
            for(int i=1940;i<year;i++) {
                if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0)) {
                    System.out.println("leap year"+ i);
                }
            }
        }
    }

