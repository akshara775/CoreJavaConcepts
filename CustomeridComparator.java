package org.umkc.basics;

import java.util.Comparator;

public class CustomeridComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getCustomerId().compareTo(o2.getCustomerId());
	}

}
