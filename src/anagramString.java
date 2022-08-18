import java.util.Arrays;


// Using inbuilt methods
class IsAnagramString{
	
	boolean isStringsAnagram(String str1, String str2) {
		char s1[] = str1.toCharArray();
		char s2[] = str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(s1.length != s2.length) {
			return false;
		}
		
		for(int i =0 ; i<s1.length; i++) {
			if(s1[i] != s2[i]) return false;
		}
		
		return true;
	}
	
}

// Using Non-inbuild methods
class IsAnagramString2{
	
	boolean isStringsAnagram(String str1, String str2) {
		char s1[] = str1.toLowerCase().toCharArray();
		char s2[] = str2.toLowerCase().toCharArray();
		int[] count = new int[256];

		
		if(s1.length != s2.length) return false;
		

		
		
		for(int i = 0; i<s1.length; i++ ) {
			count[s1[i]]++;
			count[s2[i]]--;
		}
		
		 for(int i = 0; i < 256; i++) {
			 if (count[i] != 0) {
				 System.out.println(count[i]);
				 return false;
			}
		 }
				
		 return true;
}

}


public class anagramString {

	public static void main(String[] args) {
		String s1 = "Bilal";
		String s2 = "lalba";
		
		IsAnagramString2 anagramSt = new IsAnagramString2();
		boolean anagram = anagramSt.isStringsAnagram(s1, s2);
		if(anagram) {
			System.out.println("The given strings are anagram...");	
		}
		else {
			System.out.println("The given strings are not anagram...");
		}

		

	}

}
