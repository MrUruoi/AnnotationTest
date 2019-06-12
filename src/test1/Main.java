package test1;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		Method[] declaredMethods = TestClass.class.getDeclaredMethods();
		
		for(Method m:declaredMethods) {
			if(m.isAnnotationPresent(TestAnnotation.class)) {
				System.out.println(m.getName()+ " present");
			}else {
				System.out.println(m.getName()+ " not present");
			}
		}
		
		System.out.println("==============================");
		
		for(Method m:declaredMethods) {
			if(m.isAnnotationPresent(TestAnnotation.class)) {
				System.out.println(m.getName());
				TestAnnotation testAnnotation = m.getAnnotation(TestAnnotation.class);
				System.out.println(testAnnotation.value());
				System.out.println(testAnnotation.number());
				System.out.println();
			}
		}
		
		System.out.println("==============================");
		
		for(Method m:declaredMethods) {
			if(m.isAnnotationPresent(TestAnnotation.class)) {
				TestAnnotation testAnnotation = m.getAnnotation(TestAnnotation.class);
				for(int i =0; i<testAnnotation.number();i++) {
					System.out.print(testAnnotation.value());
				}
				System.out.println();
			}
		}
		
		System.out.println("==============================");
		
		for(Method m:declaredMethods) {
			if(m.isAnnotationPresent(TestAnnotation.class)) {
				try{
					m.invoke(new TestClass());
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}//main

}
