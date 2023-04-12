package dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnExample {

    @Test(groups = "smoke")
    public void LoginPage() {
        System.out.println("this is a login page");

    }
   /* @Test(dependsOnMethods = "verify username", alwaysRun = true)
    public void verifyUsername() {
        System.out.println("verify username");
    }*/
    @Test(dependsOnGroups = "smoke")
    public void verifyPassword() {
        System.out.println("verify password");
    }
    @Test(enabled = true)
    public void verifyCourses() {
        System.out.println("verify courses");
    }
}
