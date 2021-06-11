/*import java.util.Scanner;

public class TestSkeeBall {

	//private static final int Max_Plays = 8;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		SkeeBall info = new SkeeBall();
		System.out.printf("How many plays: (1-8)");
		
		
		int Max_Plays = input.nextInt();
		
		while(Max_Plays <= 1 || Max_Plays >= 8) { //A while loops to re-enter incorrect values for Max Plays
			System.out.println("Invalid input. Please enter a number between 1-8.");
		}
		
		info.setTotalPlays(Max_Plays);
		
			
			input.close();
			
	}
	}
*/