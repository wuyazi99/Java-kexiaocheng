package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		double meter = 0;
		foot = (int)(30/3.0);
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		meter = (int)((foot+inch/12)*0.3048*100);
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12.0)*0.3048*100));
		System.out.println("身高是："+meter+"米");
//		System.out.println("2+3*6"+2+3);
	}

}
