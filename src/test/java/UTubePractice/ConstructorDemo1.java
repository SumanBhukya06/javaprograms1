package UTubePractice;

public class ConstructorDemo1 {
    //Default constructor
    int x;
    int z;
    String st;
    ConstructorDemo1()
    {
        x=200;
        z=500;
        st="Good Bye...";
    }
    void show()
    {
        System.out.println(x+"  "+z+"   "+st);
    }

    //Parameterized Constructor
    ConstructorDemo1(int a,int b,String t)
    {
        x=a;
        z=b;
        st=t;
    }
    void display()
    {
        System.out.println(x+"  "+z+"   "+st);
    }
}
