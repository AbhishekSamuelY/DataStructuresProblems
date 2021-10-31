/*
 
       d8888 888888b.   888    888 8888888 .d8888b.  888    888 8888888888 888    d8P   .d8888b.        d8888 888b     d888 888     888 8888888888 888    Y88b   d88P 
      d88888 888  "88b  888    888   888  d88P  Y88b 888    888 888        888   d8P   d88P  Y88b      d88888 8888b   d8888 888     888 888        888     Y88b d88P  
     d88P888 888  .88P  888    888   888  Y88b.      888    888 888        888  d8P    Y88b.          d88P888 88888b.d88888 888     888 888        888      Y88o88P   
    d88P 888 8888888K.  8888888888   888   "Y888b.   8888888888 8888888    888d88K      "Y888b.      d88P 888 888Y88888P888 888     888 8888888    888       Y888P    
   d88P  888 888  "Y88b 888    888   888      "Y88b. 888    888 888        8888888b        "Y88b.   d88P  888 888 Y888P 888 888     888 888        888        888     
  d88P   888 888    888 888    888   888        "888 888    888 888        888  Y88b         "888  d88P   888 888  Y8P  888 888     888 888        888        888     
 d8888888888 888   d88P 888    888   888  Y88b  d88P 888    888 888        888   Y88b  Y88b  d88P d8888888888 888   "   888 Y88b. .d88P 888        888        888     
d88P     888 8888888P"  888    888 8888888 "Y8888P"  888    888 8888888888 888    Y88b  "Y8888P" d88P     888 888       888  "Y88888P"  8888888888 88888888   888     
======================================================================================================================================================================
email: abhisheksamuel.y@gmail.com
github: abhisheksamuely@github
                                                                                                                                                                                                                                                                              
*/
package com.abhisheksamuely.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DynamicArray {

	List<Integer> sequence = new ArrayList<>();
	List<List<Integer>> sequenceList = new ArrayList<>();
	int lastAnswer = 0;
	
	public DynamicArray(int N) {
		
		for(int i = 0; i < N; i++) {
			sequence = new ArrayList<>();
			sequenceList.add(sequence);
		}
	}
	
	public void queryOne(int x, int y, int N) {
		int rowIndex = (x ^ lastAnswer) % N;
		List<Integer> sequence = sequenceList.get(rowIndex);
		sequence.add(y);
	}
	
	public void queryTwo(int x, int y, int N) {
		int colIndex = 0;
		int rowIndex = (x ^ lastAnswer) % N;
		List<Integer> sequence = sequenceList.get(rowIndex);
		colIndex = y % sequence.size();
		lastAnswer = sequence.get(colIndex);
		System.out.println(lastAnswer);
	}

}

public class DynamicArrayImpl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int size = scanner.nextInt();
		DynamicArray array = new DynamicArray(N);
		for(int i = 0; i < size; i++) {
			int queryType=scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if(queryType == 1) {
				array.queryOne(x, y, N);
			} else {
				array.queryTwo(x, y, N);
			}
		}
				
		scanner.close();
	}

}
