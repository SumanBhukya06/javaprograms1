package UTubePractice;

public class HosMain {
    public static void main(String[] args) {
        //Approach 3 constructor
        HospitalAssign hos= new HospitalAssign(111,"Druva",50000,"Dentist");
        hos.show();
        //Approach 2 using method()
        HospitalAssign hos1=new HospitalAssign(113,"Prava",50000,"Ortho");
        hos1.show();
        //Approach 1 using reference variable
       /* HospitalAssign hos1= new HospitalAssign();
        hos1.did=111;
        hos1.d_name="prava";
        hos1.d_sal=50000;
        hos1.specilization="Cardiologist";
        hos1.show();*/






    }
}
