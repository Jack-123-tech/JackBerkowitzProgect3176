package labproject3.prob1;
import java.util.Random;
public class SumOfDice {

	Random ran= new Random();
	
	int []occurrances=new int[13];
	
	public int[]getSimulatedResults(){
		return occurrances;
	}
		
	public void runSimulation(){
		for(int i=0;i<100;i++) {
			int roll1=rollDice();
			int roll2=rollDice();
			int sum= roll1+roll2;
			occurrances[sum]++;
		}
	}
	
	
	
	
	private int rollDice() {
		
		int max=6;
		int min=1;
		 int range= max-min+1;
		 int result=(int)(Math.random()*range+min);
		
		 return result;	
	}
		//return number;
	
	
	
	

}
