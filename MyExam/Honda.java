package MyExam;

public class Honda {
	abstract class Bike { 
		  abstract void run();  
		}  
	 class Honda4 extends Bike{  
		void run(){
			System.out.println("running safely..");
			}  
		
		public void main(String args[]) {
			Bike obj = new Honda4(); 
			obj.run();  
		}  
		}}  