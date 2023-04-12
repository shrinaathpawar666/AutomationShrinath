package ExpectedException;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class expectedException {

    @Test(expectedExceptions = {ArithmeticException.class})
    public void testcase() {
        try{
            System.out.println(35/0);
        }catch(ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("Excuse me");
    }

}
