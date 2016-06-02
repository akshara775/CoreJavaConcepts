package org.umkc.basics;

public class Customer  implements Comparable<Customer>{
	private String customerId;
	private String name;
	private String city;
	public Customer(String customerId, String name, String city) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", city=" + city + "]";
	}

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Customer c= (Customer)obj;
		return this.getCustomerId().equals(c.customerId);
	}

	@Override
	public int compareTo(Customer o) {
		return this.getCity().compareTo(o.getCity());
	}
	
	
	

}
