package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class TestNGListener implements ITestListener; {

@Override
public void onTestStart(ITestResult result) {
	System.out.println("TestCases failed and details are "+result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("TestCases skipped and details are "+result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("TestCases started and details are"+ result .getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("TestCase Sucess Hurryy and details are "+ result.getName());
	
	
}
}