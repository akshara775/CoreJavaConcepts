package org.umkc.basics;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Book b=new Book("java", "author");
		Book b1=new Book("c++", "akshara");
		System.out.println(b.author);
		System.out.println(b.name);
		System.out.println(b1.name);

		
	}
	

}
