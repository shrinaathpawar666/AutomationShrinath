package Priority;

import org.testng.annotations.Test;

public class priorityExample {

    @Test(priority = 3)
    public void testcaseE() {
        System.out.println("testcaseE");
    }
    @Test(priority = 2)
    public void testcaseD() {
        System.out.println("testcaseD");
    }
    @Test(priority = 1)
    public void testcaseC() {
        System.out.println("testcaseC");
    }
    @Test(priority = 5)
    public void testcaseB() {
        System.out.println("testcaseB");
    }
    @Test(priority = 4)
    public void testcaseA() {
        System.out.println("testcaseA");
    }

}
