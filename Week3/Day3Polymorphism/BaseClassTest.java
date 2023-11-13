package Week3.Day3Polymorphism;

public class BaseClassTest {

	public void FindElementMethod() {
		System.out.println("This is FindElementMethod");
	}
	
	public void ClickElementMethod() {
		System.out.println("This is ClickElementMethod");	
	}
	
	public void EnterTextMethod() {
		System.out.println("This is EnterTextMethod");
	}
	
	public void PerformCommonTasksMethod() {
		System.out.println("This is PerformCommonTasksMethod");
	}
	
	
	public static void main(String[] args) {
		
		BaseClassTest obj = new BaseClassTest();
		
		obj.ClickElementMethod();
		obj.ClickElementMethod();
		obj.EnterTextMethod();
		obj.PerformCommonTasksMethod();		
		
	}
}
