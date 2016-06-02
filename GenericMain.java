package org.umkc.basics;

import java.awt.Paint;

public class GenericMain {
	
	public static void main(String[] args) {
	
		GenericExample ge=new GenericExample();
		ge.setObject(1);
		
		GenericExample ge1=new GenericExample();
		ge1.setObject("hello");
		
		GenericExample ge2= new GenericExample();
		ge2.setObject(true);
		
		ge1.getObject();
		System.out.println(ge1);
		
		int i=(int) ge.getObject();
		System.out.println(ge);
		
		
		System.out.println("--------------");
		
		
		BoxGeneric<String> bg=new BoxGeneric<>();
		bg.setGeneric("hello");
		
		BoxGeneric<Integer> bgi=new BoxGeneric<>();
		bgi.setGeneric(2);
		
//		String s=bg.getGeneric();
//		int x=bgi.getGeneric();
//		
//		bg.getGeneric();
//		bgi.getGeneric();
		 
		System.out.println(bg.getGeneric());
		System.out.println(bgi.getGeneric());
		
		
		System.out.println("----------");
		
		pair<Integer, String>is=new pair<>();
		is.setKey(1);
		is.setValue("hello");
		System.out.println(is.getKey()+" "+is.getValue());
		
		pair<String, String>ss=new pair<>();
		ss.setKey("A");
		ss.setValue("akshara");
		System.out.println(ss.getKey()+" "+ss.getValue());
		
		
		
		
		
	}

}
