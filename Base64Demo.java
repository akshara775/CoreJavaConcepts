package org.umkc.basics;

import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		String s= "hello mam how r u?";
		String encoded=Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(encoded);
		String decoded=new String(Base64.getDecoder().decode(encoded));
		System.out.println(decoded);
	}
}
