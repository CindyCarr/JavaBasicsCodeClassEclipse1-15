package Review06;

public class Student {

		// define attributes/fields=variables
		String name, lastName, address;
		int studentId, age;
		char grade;
		
		//define behavior=methods
		void study() {
			System.out.println(name+" is studying");
		}
void doHomework () {
	System.out.println(name+" is doing homework");
	}
// create a method that will return full name of a student in uppercase

String getFullName() {
	return name.toUpperCase()+" "+lastName.toUpperCase();
}
	//void printInfo() {
	//System.out.println(name+" "+lastName+" is "+age+" and lives at "+address);
String rating() {
	switch(grade) {
	case 'A':
		return "great";
		
	case 'B':
		return "good";
		
	case 'C':
		return "average";
	default:
		return "bad";
	}

}
void takeSubject (String subject) {
	System.out.println(name+" studies "+subject);
}
}

