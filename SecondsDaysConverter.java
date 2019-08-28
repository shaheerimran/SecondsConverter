import java.util.Scanner;

public class SecondsDaysConverter {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number of seconds: ");
		int seconds = s.nextInt();
		int days = seconds/86400;
		int hours = (seconds%86400)/3600;
		int minutes = ((seconds%86400)%3600)/60;
		int secondsR = (((seconds%86400)%3600)%60);
		
		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + secondsR);
	}
	
}
