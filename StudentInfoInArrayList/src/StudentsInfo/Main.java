package StudentsInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
		stdInput(students);
		System.out.println(students.toString());
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Search Students Information by Name : ");
		String findeName= sc.nextLine();
		boolean found = false;
		for(StudentInfo i:students) {
			if(i.getName().contains(findeName)){
				found=true;
				System.out.println(i.getName()+"s Information :"+i.toString());
				break;
			}
		}
		if(found == false) {
			System.out.println("Student Not Found");
		}
		
	}
	
//	creating a method for Student Input
	public static void stdInput(ArrayList<StudentInfo> std) {
		
		for(int i=0;i<2;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Name : ");
			String name = sc.nextLine();
			
			System.out.print("Enter Your Department : ");
			String dept = sc.nextLine();
			
			System.out.print("Enter Your ID : ");
			int id = sc.nextInt();
			
			std.add(new StudentInfo(name,dept,id));
		}
	}
}
