package Day8;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.eid=102;
        emp1.ename="Suman";
        emp1.job="Engineer";
        emp1.esal=50000;
        emp1.display();

        Employee emp2=new Employee();
        emp2.eid=103;
        emp2.ename="David";
        emp2.job="Chef";
        emp2.esal=60000;
        emp2.display();

    }
}
