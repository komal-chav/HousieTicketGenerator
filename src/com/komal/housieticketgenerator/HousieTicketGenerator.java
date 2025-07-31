package com.komal.housieticketgenerator;

import java.util.*;


public class HousieTicketGenerator {
	
	public static Set<Integer> getRandomThreeNumbers(int min, int max, int count) {
		Random random=new Random();
		Set<Integer> randomNumberList = new TreeSet<>();
		while(randomNumberList.size()<count)
		{
			randomNumberList.add(random.nextInt(min, max+1));
		}
		return randomNumberList;
		
	}
	
	public static void printRows(int[][] minMaxPairs, List<Integer> randomFive) {
		 
		 int columns = minMaxPairs.length;
		 String[] output = new String[columns]; // output row with blanks initially

		 // Fill array with blanks
		 Arrays.fill(output, "\t");

		 // For each number in randomFive
		 for (int num : randomFive) {
		     for (int i = 0; i < minMaxPairs.length; i++) {
		         int min = minMaxPairs[i][0];
		         int max = minMaxPairs[i][1];

		         if (num >= min && num <= max) {
		             output[i] = num + "\t";
		             break; // move to next number
		         }
		     }
		 }
		 System.out.print("|");
		 // Print the final single row
		 for (String val : output) {
		     System.out.print(val+"|");
		 }
		 System.out.println(); // new line after row

		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Starting Housie Ticket generator project");
		
		 int[][] minMaxPairs = {
		            {1, 9}, 
		            {10,19}, 
		            {20,29},
		            {30,39}, 
		            {40,49}, 
		            {50,59},
		            {60,69}, 
		            {70,79}, 
		            {80,90}
		        };
		 List<Integer> rowOne = new ArrayList<>();
		 List<Integer> rowTwo = new ArrayList<>();
		 List<Integer> rowThree = new ArrayList<>();
		
		 for (int i = 0; i < minMaxPairs.length; i++) {
	            int min = minMaxPairs[i][0];
	            int max = minMaxPairs[i][1];
	            Set<Integer> numbers = getRandomThreeNumbers(min, max, 3);

	            List<Integer> numberList = new ArrayList<>(numbers);

	            if (numberList.size() == 3) {
	                rowOne.add(numberList.get(0));
	                rowTwo.add(numberList.get(1));
	                rowThree.add(numberList.get(2));
	            } else {
	                System.out.println("Warning: Expected 3 numbers but got " + numberList.size());
	            }
	           // System.out.println("Set " + (i + 1) + " (" + min + "-" + max + "): " + numbers);
	        }
		
		// Shuffle the list to randomize order
		 Collections.shuffle(rowOne);
		 Collections.shuffle(rowTwo);
		 Collections.shuffle(rowThree);

		 // Get the first 5 elements (after shuffle)
		 printRows(minMaxPairs,rowOne.subList(0, Math.min(5, rowOne.size())));
		 printRows(minMaxPairs,rowTwo.subList(0, Math.min(5, rowOne.size())));
		 printRows(minMaxPairs,rowThree.subList(0, Math.min(5, rowOne.size())));
		 	 
	}

}
