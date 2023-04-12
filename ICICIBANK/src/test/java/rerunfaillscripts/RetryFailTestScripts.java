package rerunfaillscripts;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailTestScripts implements IRetryAnalyzer {


    private int retrycount = 0;
    private static final int maxRetryCount = 3;
    @Override
    public  boolean retry(ITestResult iTestResult) {
        if (retrycount < maxRetryCount){
            retrycount++;
            return true;
        }
        return false;
    }
}
