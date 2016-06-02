package org.umkc.basics;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Student s1=new Student(null);

		s1.firstName="akshara";
		s1.lastName="perasani";
		s1.designation="projectManager";
		s1.homeAddress.city="kansas";
		s1.setScore(100);
		System.out.println(s1.firstName+" "+s1.lastName+"\n"+s1.homeAddress.city);
		System.out.println("s1.designation");
		System.out.println(s1.getScore());
		int a=11;
		int b=11;
		a++;
		System.out.println(a+"\n"+b);
		
	}

}
