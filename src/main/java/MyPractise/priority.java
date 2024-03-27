package MyPractise;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=1)
	public void method1() {
		System.out.println("hello1");
		
	}
	@Test()
	public void method2() {
		System.out.println("hello2");
		
	}
	@Test(priority=2)
	public void method3() {
		System.out.println("hello3");
		
	}
	@Test(priority=3)
	public void method4() {
		System.out.println("hello");
		
	}
}
