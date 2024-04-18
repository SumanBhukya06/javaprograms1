package Day8;

public class AppleTree {
    int trees;
    String type;
    char grade;
    void display()
    {
        System.out.println(trees+"  "+type+"    "+grade);
    }
    void setData(int a,String t,char g)
    {
        trees=a;
        type= t;
        grade=g;
    }
    AppleTree(int b,String tr,char r)
    {
        trees=b;
        type=tr;
        grade=r;
    }

}
