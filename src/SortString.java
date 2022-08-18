

public class SortString {

	public static void main(String[] args) {
		String str ="Bilal Bhojani";
		char charArr[] = str.toLowerCase().toCharArray(); 
		
		char temp;
		
		for(int i =0 ; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				if(charArr[j] < charArr[i]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i<charArr.length; i++) {
			System.out.print(charArr[i]);
		}
		
	}

}
