package MainPackage;
import java.util.Scanner;
public class QBrating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int att;
		int comp;
		int yds;
		int td;
		int intr;
		System.out.println("What were the number of attempts?");
		att = input.nextInt();
		System.out.println("What were the number of completions?");
		comp = input.nextInt();
		System.out.println("What were the number of yards?");
		yds = input.nextInt();
		System.out.println("What was the number of TDs?");
		td = input.nextInt();
		System.out.println("What was the number of intercepetions?");
		intr = input.nextInt();
		double a = ((comp/att)-.3)*5;
		double b = ((yds/att)-3)*.25;
		double c = (td/att)*20;
		double d = 2.375-((intr/att)*25); 
		double QBR = ((a+b+c+d)/6)*100;
		System.out.println("The player's Quarterback rating is " + QBR);
	}

}
