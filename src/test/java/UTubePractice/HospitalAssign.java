package UTubePractice;

public class HospitalAssign {
    int did;
    String d_name;
    int d_sal;
    String specilization;

    void show() {

        System.out.println(did + "   " + d_name + "   " + d_sal + "  " + specilization);
    }

    HospitalAssign(int id, String name, int sal, String s) {
        did = id;
        d_name = name;
        d_sal = sal;
        specilization = s;
    }

    void setData(int id, String name, int sal, String s) {
        did = id;
        d_name = name;
        d_sal = sal;
        specilization = s;
    }
}

