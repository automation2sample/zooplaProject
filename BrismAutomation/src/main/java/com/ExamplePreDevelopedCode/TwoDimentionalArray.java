package com.ExamplePreDevelopedCode;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		
	
	 int[][] dayWiseTemperature = new int[][]
				{
				    {30, 35, 28},
				    {29, 32, 0}
				};// The row size is 7, and the column size (optional) is 3
				
				for(int i=0; i<2; i++) {
					for(int j=0; j<3; j++) {
						System.out.println(dayWiseTemperature[i][j]);
					}
				}
			 
		/*	// Another way of creating a 2-D array
			int[][] dayWiseTemperature1 = new int[3][];
			dayWiseTemperature1 [0][1] = 28;
			dayWiseTemperature1 [1][7] = 32;
		
			 
			// To set or change individual values
			dayWiseTemperature[1][2] = 28; 
			
			System.out.println(dayWiseTemperature[1][1]);
		*/	
	}
}
