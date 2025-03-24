package com.next;

import java.util.Scanner;

 public class comethod {
	 public comethod(int r) {
	double area=3.14*r*r;
	System.out.println(area);
	}
	static void ex(int s) {
		double p=2*3.14*s;
		System.out.println(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int radius=a.nextInt();
		comethod s=new comethod(radius);
		ex(radius);
		
		

	}

}
