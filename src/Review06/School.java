package Review06;

public class School {

	public static void main(String[] args) {

		Student student1=new Student();
		student1.name="Cindy";
		student1.lastName="Mendoza";
		student1.address="Virginia";
		student1.studentId=101;
		student1.age=35;
		student1.grade='A';
		student1.study();
		student1.doHomework();
		String fullName=student1.getFullName();
		student1.takeSubject("Java");
	
		
		System.out.println(fullName);
		
		System.out.println("-------------------------");
		
		Student student2=new Student();
		student2.name="Darwin";
		student2.lastName="Mendoza";
		student2.address="Virginia";
		student2.studentId=102;
		student2.age=39;
		student2.grade='B';
		//accessing methods of Student class
		student2.study();
		student2.doHomework();
		student2.takeSubject("Biology");
		fullName=student2.getFullName();
		System.out.println(fullName);
		
	}

}
