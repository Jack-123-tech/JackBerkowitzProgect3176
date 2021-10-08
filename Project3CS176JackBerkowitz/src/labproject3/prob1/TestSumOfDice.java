package labproject3.prob1;

import java.util.Arrays;

public class TestSumOfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfDice sumOfDice=new SumOfDice();
		
		sumOfDice.runSimulation();
		int[] results=sumOfDice.getSimulatedResults();
		
		
		System.out.println("Dice Sums:(100 rolls)");
		System.out.print(Arrays.toString(results) );
		System.out.println();
	
			
		
		System.out.println("Sum of Dice         Occurances");
		System.out.println("-----------        -----------");
		
		
		for(int i=2;i<=12;i++) {
			System.out.println(i+"                  "+results[i]);
		}
		
		for(int i=2;i<=12;i++) {
			
			System.out.print(i+":");
			for(int j=1;j<=results[i];j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

	

}
