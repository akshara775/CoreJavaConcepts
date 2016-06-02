package org.umkc.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {

		Customer c1 = new Customer("125", "akshara", "kansas");
		Customer c2 = new Customer("124", "raj", "CA");
		Customer c3 = new Customer("123", "shen", "TX");
		Student s1 = new Student("123");
		Student s2 = new Student("124");
		List<Customer> customers = new ArrayList<>();
		List<Student> student = new ArrayList<>();

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		student.add(s1);
		student.add(s2);
		System.out.println(c1);
		System.out.println(s1);
		if (c1.getCustomerId() == s1.getStudentId()) {
			System.out.println(c1.getCustomerId());
		}
		System.out.println((c1.equals(c2)));
		System.out.println(s1.equals(s2));

		System.out.println("-------------");

		for (Customer customer : customers) {
			System.out.println(customer);

		}
		System.out.println("-------------");

		Collections.sort(customers);
		for (Customer customer : customers) {
			System.out.println(customer);

		}
		System.out.println("-------------");
		Collections.unmodifiableList(customers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("-------------");

		Collections.sort(customers, new CustomerNameComparator());
		for (Customer customer : customers) {
			System.out.println(customer);

		}
		
		Collections.sort(customers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getCity().compareTo(o2.getCity()) + o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("-------------");

		Collections.sort(customers, new CustomeridComparator());
		{
			for (Customer customer : customers) {
				System.out.println(customer);
			}
		}
		System.out.println("-------------");

		Collections.synchronizedList(customers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
