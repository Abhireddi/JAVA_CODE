package MyExam;

public class MyParameterizedConstructor {
	public MyParameterizedConstructor(String str) {
		System.out.println("I am inside parameterized constructor.");
		System.out.println("The parameter value is: " + str);
	}

	public static void main(String a[]) {
		new MyParameterizedConstructor("Abhi reddi");
	}
}
