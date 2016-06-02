package org.umkc.basics;

public class EnumExample {
	public Days days;
	public Cards cards;
	
	private EnumExample(Days days, Cards cards)
	{
		this.days=days;
		this.cards=cards;
		
	}
	public static void main(String[] args) {
		for(Cards cards : Cards.values())
		System.out.println(cards);
		
	}
}


