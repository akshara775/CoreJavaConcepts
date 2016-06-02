package org.umkc.basics;

public class Student {

	
		// TODO Auto-generated method stub
		 private String studentId;
		public String getStudentId() {
			return studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public Student(String studentId) {
			super();
			this.studentId = studentId;
		}
		String firstName;
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + "]";
		}
		String lastName;
		int age;
		float salary;
		String designation;
//		Address homeAdress;
		private int score;
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		Address homeAddress=new Address();
		
		@Override
		public boolean equals(Object s1) {
		// TODO Auto-generated method stub
		Student s=(Student)s1;
		return this.getStudentId().equals(s.studentId);
		
		}
		

	 public static void logIn(){
		 
	 }
	 

}
