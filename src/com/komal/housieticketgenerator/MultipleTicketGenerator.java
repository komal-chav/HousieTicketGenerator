package com.komal.housieticketgenerator;

import java.util.Scanner;

public class MultipleTicketGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HousieTicketGenerator htg=new HousieTicketGenerator();
		//Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Tickets you want to generate? ");
		//int num = scanner.nextInt();;
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			System.out.println("");
			htg.main(null);
			System.out.println("***************************************************************************************************");
		}
	}

}
