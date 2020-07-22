package Basics;
import java.util.regex.*;
public class RegExpressionDemo {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("w3schools");
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not found!");
		}

	}

}
