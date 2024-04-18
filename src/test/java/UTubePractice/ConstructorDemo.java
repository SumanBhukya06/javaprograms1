package UTubePractice;

public class ConstructorDemo {
    int x,y;
    String s;
   /* ConstructorDemo() //Default Constructor
    {
        x=100;
        y=200;
        s="welcome";
    }
    void display()
    {
        System.out.println(x+"  "+y+"   "+s);
    }*/

    // Parameterized Constructor
    ConstructorDemo(int a,int b, String str)
    {
        x=a;
        y=b;
        s=str;

    }
    void  display()
    {
        System.out.println(x+"  "+y+" "+s);
    }

}






