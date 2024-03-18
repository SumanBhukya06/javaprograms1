package Day34;

import org.testng.annotations.Test;

public class Testdata1 {
    @Test
    void setup(){
        System.out.println("First Step...");
    }
    @Test
    void login(){
        System.out.println("Second Step...");
    }
    @Test
    void logout(){
        System.out.println("Third Step...");
    }
}
