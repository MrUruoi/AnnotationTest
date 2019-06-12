package test1;

public class TestClass {
	
	@TestAnnotation(value = "-")
	public void method1() {
		System.out.println("method1");
	}
	
	@TestAnnotation("*")
	public void method2() {
		System.out.println("method2");
	}
	
	@TestAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("method3");
	}
	
	public void method4() {
		System.out.println("method4");
	}
	
}
