package Day14_TestNG;

import org.testng.annotations.Test;

public class Example3 {
     @Test(enabled=false)
      public void TestCase1() {
	  System.out.println("i am Testcase 1");
	  }
	  @Test(enabled=true,priority=1,invocationCount=3)
	  public void TestCase4() {
		  System.out.println("i am TestCase4");
	  }
	  @Test(priority=0)
	  public void TestCase2() {
		  System.out.println("i am TestCase2");
	  }
	  @Test(priority=3,dependsOnMethods="TestCase2()",description="Here we are testing dependsOnMethod attributes")
	  public void TestCase3() {
		  System.out.println("i am TestCase3");
	  
  }
}
