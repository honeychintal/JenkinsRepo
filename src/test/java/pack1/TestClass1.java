package pack1;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test(groups = "A")
	   public void methodNumber1() 
	   {
	      System.out.println("Inside methodNumber1()");
	   }
	   
	   
	@Test(dependsOnMethods = {"methodNumber1"}, groups = "A")
	   public void methodNumber2() 
	   {
	      System.out.println("Inside methodNumber2()");
	   }
	   
	@Test(dependsOnMethods = {"methodNumber2"},groups = "A")
		public void methodNumber3() 
		{
	      System.out.println("This is methodNumber3()");
		}
	   
	@Test(dependsOnGroups = {"A.*"})
	   	public void methodFinal() 
		{
	      System.out.println("Inside Final method, depends on group= A");
		}
}
