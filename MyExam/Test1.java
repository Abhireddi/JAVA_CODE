package MyExam;

public class Test1 {
	static int a =10, b=20;
	//Declare Non-static variables 
	int c=30, d=40; 
	//Create Static a method with returning a value
	public Test1() {
		this(10);
		System.out.println("0-arg constructor");
	}
	public Test1(int z)
	{
	System.out.println(z);	
	}
	public static int add(){
	int result = a+b; 
	System.out.println(result);
	return result;
	
	}
	//Create Static a method without returning any value
	public static void multiply(){ 
	System.out.println(a*b); }
	//Create a Non static method with returning a value 
	public int add2(){ 
	int res = c + d; 
	return res; 
	} 
	//Create a Non static method without returning any value
	public void squre( int x){ 
	System.out.println(x*x);
	} 
	public int sub(int y, int z){ 
		int res = y - z; 
		System.out.println(res);
		return res; 
		
		} 
	public static void main (String [] args)
	{
		//Access Static Class Members(Using Class Name)
		
		Test1.add();
		Test1.multiply();
		
		//Access Non static class members(Using Object)
		
		Test1 obj = new Test1(); 
		int y = obj.add2(); 
		System.out.println(y);
		obj.squre(10); 
		obj.sub(20, 10);
		} 
	}


