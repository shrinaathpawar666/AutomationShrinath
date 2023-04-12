package rerunfaillscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFailedTestCase {
    @Test(retryAnalyzer = RetryFailTestScripts.class)

    public void testCase1(){
        System.out.println("test case A");

    }
    @Test(retryAnalyzer = RetryFailTestScripts.class)
    public void testCase2(){
        System.out.println("test case B");
        Assert.assertTrue(false);

    }
    @Test(retryAnalyzer = RetryFailTestScripts.class)
    public void testCase3(){
        System.out.println("test case C");

    }
    @Test(retryAnalyzer = RetryFailTestScripts.class)
    public void testCase4(){
        System.out.println("test case D");
        Assert.assertTrue(false);

    }
        }
