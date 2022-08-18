import java.util.Scanner;

public class reverseSentence {

	public static String reverseStringData(String s) {
		String rev = new String();

		for(int i=s.length()-1; i>=0; i--){
			rev = rev + s.charAt(i);		
		}

		return rev;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen;
		String revSen = "";
		String[] words;
		
		System.out.println("Enter the string to make it reverse : ");
		sen = sc.nextLine();
		words = sen.split("\\s");
		

		
		for(int i = 0; i < words.length; i++) {
			revSen += reverseStringData(words[i]) + " ";	
		}
		

		System.out.println(revSen);
	}

}
