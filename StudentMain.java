package Day8;

public class StudentMain {
    public static void main(String[] args) {
        StudentAssign stu=new StudentAssign();
      //Approach 1 using refrence variable stu is the ref variable
        /*stu.sid=111;
        stu.sname="Kim";
        stu.grade='A';
        */
        //Approach 2 using method
        stu.setData(111,"John",'B');
        stu.show();
        //Approach 3 using constructor
   // StudentAssign stu=new StudentAssign(111,"Mich",'C');
    //stu.show();




    }
}
