import java.util.Scanner;


// 1. WAP to reverse a String ?

public class reverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		String revStr = "";
		System.out.println("Enter the string to make it reverse : ");
		st = sc.next();
		
		for(int i = st.length() - 1; i >=0; i--) {
			revStr +=  st.charAt(i);
		}
		
		System.out.println("Reversed string is - " + revStr);

	}

}
