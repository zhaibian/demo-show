package cylu.demo.junit4.testcase;

import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestClassSuite extends TestSuite {
	
	public static Test suite() { 
        TestSuite suite = new TestSuite("TestSuite Test"); 
        suite.addTestSuite(TestClassOne.class); 
        suite.addTestSuite(TestClassTwo.class); 
        return suite; 
    } 
	public static Test suite2() { 
        TestSuite suite = new TestSuite("TestSuite Test2"); 
        suite.addTestSuite(TestClassOne.class); 
        suite.addTestSuite(TestClassTwo.class); 
        return suite; 
    }
	
	public static void main(String[] args) {
		Test suit = suite();
		TestRunner.run(suit);
		
		TestRunner.run(suite2());
		new RepeatedTest(suite2(),20);
	}
}
