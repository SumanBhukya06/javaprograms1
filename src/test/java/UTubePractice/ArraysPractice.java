package UTubePractice;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        a[5]=600;
        /*for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }*/
        for (int i=0;i<a.length;i++)
        {
            System.out.println(Arrays.toString(a));

        }


    }
}
