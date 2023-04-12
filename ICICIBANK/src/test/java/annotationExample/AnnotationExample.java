package annotationExample;


import org.testng.annotations.*;

public class AnnotationExample {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @Test
    public void testcase1() {
        System.out.println("testcase1");
    }
    @Test
    public void testcase2() {
        System.out.println("testcase2");
    }
    @Test
    public void testcase3() {
        System.out.println("testcase3");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

}
