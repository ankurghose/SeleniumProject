package com.algor;

public class Swap {

	public static void main(String[] args) {
		int a=25;
		int b=30;
		a=a+b;

		b=a-b;
		a=b-a;

		System.out.println("Ater swaping:"+"a="+a+",b="+b);
	}

}
