package Day8;

public class StudentAssign {
    int sid;
    String sname;
    char grade;
    void show()
    {
        System.out.println(sid+"    "+sname+"   "+grade);
    }
    void setData(int id,String name,char e)
    {
        sid=id;
        sname=name;
        grade=e;
    }
    /*StudentAssign(int id,String name,char g)
    {
        sid=id;
        sname=name;
        grade=g;
    }*/
}
