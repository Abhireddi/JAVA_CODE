package StudentClass;

public class Student {

	private String name;
	private int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		//this.name & this.id is instance variables 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
public void printInfo(){
System.out.println("hi "+getName()+" your Id is "+getId());
}

}


