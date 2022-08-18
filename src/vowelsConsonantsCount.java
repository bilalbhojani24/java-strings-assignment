import java.util.Scanner;

public class vowelsConsonantsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vowels = 0;
		int consonants = 0;
		int spaceCount = 0;
		String vowelString = "aeiou";
		String userStr;
		
		System.out.println("Enter a string : ");
		userStr = sc.nextLine().toLowerCase().trim();

		for(int i = 0; i < userStr.length(); i++) {
			if(vowelString.contains( String.valueOf(userStr.charAt(i)) )){
				vowels++;
			}
			else if(userStr.charAt(i) == '\u0020') {
				spaceCount++;
			}
			else {
				consonants++;
			}
		}
		
		
		System.out.println("Count of vowels is : " + vowels);
		System.out.println("Count of consonants is : " + consonants);
		System.out.println("Count of spaces is : " + spaceCount);
		
		
		

	}

}
