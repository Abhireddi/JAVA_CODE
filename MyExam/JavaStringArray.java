package MyExam;

public class JavaStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myFirstStringArray = new String[] { "String 1", "String 2", "String 3" };

		// First declare String array

		String[] mySecondStringArray = new String[3];

		mySecondStringArray[0] = "String 1";
		mySecondStringArray[1] = "String 2";
		mySecondStringArray[2] = "String 3";
		System.out.println(myFirstStringArray[1]);

		// iterate the String Array using loop

		for (int i = 0; i < mySecondStringArray.length; i++) {
			System.out.println(mySecondStringArray[i]);
		}
	}
}
