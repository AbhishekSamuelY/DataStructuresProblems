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
package com.abhisheksamuely.dsa.arrays.hakerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 2DArray {

	public static void main(String[] args) {

		List<List<Integer>> arr = new ArrayList<>();
		arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
		arr.add(Arrays.asList(0, 1, 0, 0, 0, 0));
		arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
		arr.add(Arrays.asList(0, 0, 2, 4, 4, 0));
		arr.add(Arrays.asList(0, 0, 0, 2, 0, 0));
		arr.add(Arrays.asList(0, 0, 1, 2, 4, 0));
		int n = 6;
		
		List<Integer> sumArray = new ArrayList<>();
		int[][] array = new int[n][n];
		int i = 0;
		
		for(List<Integer> _arr : arr) {
			for(int j = 0; j < n; j++) {
				array[i][j] = _arr.get(j);
			}
			i++;
		}
		
		for(int k = 0; k < n; k++) {
			for(int j = 0; j < n; j++) {
				System.out.print(array[k][j]+"\t");
			}
			System.out.println("");
		}
		
		for(int k = 0; k < n; k++) {
			for(int j = 0; j < n; j++) {
				if(k+2 < n && j + 2 < n) {
					int sum = 0;
					sum += array[k][j] + array[k][j+1] + array[k][j+2];
					sum += array[k+1][j+1];
					sum += array[k+2][j] + array[k+2][j+1] + array[k+2][j+2];
					sumArray.add(sum);
				}
			}
		}
		
		Collections.sort(sumArray);
		
		System.out.println(sumArray.get(sumArray.size()-1));
	}

}
