package cylu.demo.junit4.testcase;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class TestClassOne extends TestCase {
	
	public void testOne(){
		System.out.println("test One...");
	}
}
