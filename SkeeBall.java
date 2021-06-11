import java.util.Random;//imports a random package to utilize the random number generator
import java.util.Scanner;


public class SkeeBall {
	
	private static final int Max_Plays = 8;//a static variable
	private int savedhallvalues[]; //stores hall value in an array

	public void play(int playsnum) { //play method
		Random randomNumber = new Random();// create randomNumber object for percentages
		int hall;
		savedhallvalues = new int[playsnum];
		for(int i=1;i<=playsnum;i++) { //loops the amount of times the user had inputted
			
		int current = randomNumber.nextInt(20)+1; //Uses a random number generator
		//finds value for hall by using a range from 0 to 20.
		if (current<=7)
			hall = 0;
		else if(current >= 8 && current <= 11) {
			hall = 10;
		}
		else if(current >= 12 && current <= 14) {
			hall = 20;
		}
		else if(current >= 15 && current <=17) {
			hall = 40;
		}
		else if(current >= 18 && current <=19) {
			hall = 60;
		}
		else
			hall = 80;
			
		switch(hall) { //selects the hall where the ball landed creates 6 different cases
		case 0:
			System.out.println("Rolling Ball #" + i + ".Landed in 0");
			break;
		case 10:
			System.out.println("Rolling Ball #" + i + ".Landed in 10");
			break;
		case 20:
			System.out.println("Rolling Ball #" + i + ".Landed in 20");
			break;
		case 40:
			System.out.println("Rolling Ball #" + i + ".Landed in 40");
		case 60:
			System.out.println("Rolling Ball #" + i + ".Landed in 60");
			break;
		case 80:
			System.out.println("Rolling Ball #" + i + ".Landed in 80");
			break;
		}
		savedhallvalues[i-1] = hall; //records hall values 
		}
	}
	
	public void showStats() { //displays the statistics
		int totalvalue = 0;
		System.out.println("+------------+------------+");
		System.out.printf("%10s %10s \n","Play #", "Score");
		System.out.println("+------------+------------+");
		
		for(int i=0; i < savedhallvalues.length; i++) { //loops through to place the plays and scores next to each other
		System.out.printf("%8d %8d \n",(i+1),savedhallvalues[i]);
		totalvalue = totalvalue + savedhallvalues[i];
	}
		System.out.print("\nTotal: " + totalvalue);//prints total value
	}
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//takes in a object for scanner
		SkeeBall info = new SkeeBall(); //creates an object of the class
		int playsnum;//creates a variable
		
		System.out.print("How many plays: (1-8)? ");
		playsnum = sc.nextInt(); //initializes the variable using standard input
		 while(playsnum <= 1 || playsnum >= Max_Plays){ //while loop which consist of a user check to make sure there is correct input
			 System.out.print("Invalid input. Please enter a number between 1-8. ");
				playsnum = sc.nextInt();
		 }

		info.play(playsnum); //invokes play method
		info.showStats();	//invokes showStats method

		
		sc.close();//closes scanner
			
	}
	
}
