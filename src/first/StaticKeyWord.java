package first;

class Student{
	int id;
	String name;
	static String university = "MLA";  // in this one just we can use one time in separate id or static block. 
	
	static void change() {     // if we want to change the university name we use this and we should call again
		university = "FAC";
	}
	Student(int id, String name){
		this.id = id;
		this.name= name;
	}
	void display() {
		System.out.println("id number is: "+id+ ",name is; " + name+ ", university is: "+ university);
	}
	
}

public class StaticKeyWord {

	public static void main(String[] args) {
		
		// if we use static keyword we can just use one copy of variable.
		
		Student student1 =new Student(111,"Alix"); 
		Student student2 =new Student(1343,"Ima"); 
		Student student3 =new Student(1343,"Ima");
		
		// if we want change university name we use the below code		
		//Student.university ="kjl";
		Student.change();
		student1.display();
		student2.display();
		student3.display();
		
	}

}
