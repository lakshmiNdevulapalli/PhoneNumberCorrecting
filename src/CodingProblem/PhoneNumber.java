package CodingProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Lakshmi N. Devulapalli Venkata
 * @description  Write a function that accepts a user input phone number string type and 
 * returns a normalized United States phone number string type in E.164 format. 
 * Return null (or an equivalent value) if the user input phone number is invalid.
 */
public class PhoneNumber {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Initializing variables  */
		String phoneNumber;
		String formattedNumber;
		
		/* Scan input from user */
		Scanner sc = new Scanner(System.in); // Scanner inline command to accept user input
		System.out.println("Enter Phone number: ");
		phoneNumber = sc.next();
		
		formattedNumber = correctNumber(phoneNumber); //calls correctNumber method
		System.out.println("US number format: "+formattedNumber);
	}

	/**
	 * method for formatting the number in E.164 format
	 * @param phoneNumber
	 * @return correctedNumber if valid 
	 * else
	 * @return null
	 */
	private static String correctNumber(String phoneNumber) {
		String regex = "(\\d{3})(\\d{3})(\\d{4})"; //regular expression for E.164 number format.
		String correctedNumber = null;
		Pattern p = Pattern.compile(regex);       //Method for matching text with regular expression.
		Matcher m = p.matcher(phoneNumber);      //Method to check if regular expression matches.
		
		/* Condition to check if the value matches, if it's invalid returns null*/
		if(m.matches()){
			correctedNumber = String.valueOf(phoneNumber).replaceFirst(regex, "($1) $2-$3");
		}else{
			return null;
		}
		return correctedNumber;
	}
}
