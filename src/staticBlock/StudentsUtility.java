package staticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsUtility {

	// create a private static field called studentList as ArrayList of String
	private static ArrayList<String> studentList;

	// create a static block to print out welcome to StudentsUtility
	static {
		System.out.println("Welcome to  StudentsUtility");
	}

	// create another static block
	// initialize your arrayList object
	
	static {

		loadAllMyData();
		System.out.println("All students have been loaded");
	}

	
	
	
	
	
	
	public static void main(String[] args) {

		System.out.println(studentList);
		displayAllStudent();
		
		System.out.println("----------------");
		
		addOneStudent("Mama");
		displayAllStudent();
		
		System.out.println("----------------");
		
		updateStudent(10, "Mamyte");
		displayAllStudent();
		
		System.out.println("----------------");
		
		studentList.remove(10);
		displayAllStudent();
		
		System.out.println("----------------");
		
		studentList.clear();
		
		
		
		
		
	}

	// create a static method called displayAllStudent , accept no param return
	// nothing
	
	public static void displayAllStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("No : " + (i + 1) + "--> " + studentList.get(i));
		}
	}
	// create a static method called addStudent , accept one parameter as String
	// name
	// and add that name to the list , return no value
	
public static void addOneStudent(String name) {
	studentList.add(name);
}
	// create a static method called updateStudent
	// accept 2 params index as int , newName as String
	// and it will update the name of student at that location

public static void updateStudent(int index, String newName) {
	if(index >= studentList.size()) {
		System.out.println("Out of range");
		return;
	}
	studentList.set(index,  newName);
}
	// create a static method called removeStudent
	// accept 1 param index as int
	// and it will remove the name of student at that location

public static void removeStudent(int index) {
	studentList.remove(index);
}
	// create a static method called resetTheList
	// accept no param and delete everything in the list

public static void resetTheList() {
	studentList.clear();
}

	// create a method to load all 10 sudents into the list

	private static void loadAllMyData() {

		studentList = new ArrayList<String>();
		studentList.add("Asta");
		studentList.add("Mario");
		studentList.add("Jake");
		studentList.add("James");
		studentList.add("Emily");
		studentList.add("Tomas");
		studentList.add("Irena");
		studentList.add("Souad");
		studentList.add("George");
		studentList.add("Andy");

	}

}
