
public class RepeatedOccuring {

	
	public static void main(String[] args) {
		String str = "Bilal Bhojani";
	
		
		// Solution 1 : O(n*2)
//		for(int i =0; i< str.length();  i++) {
//			for(int j = i + 1; j< str.length();  j++ ) {
//				if(str.charAt(i) == str.charAt(j)) {
//					System.out.println(str.charAt(j) + " ");
//					break;
//				}
//			}
//		}
		
		// Solution 2 : More optimized
		int count[] = new int[256];
	
		for(int i =0; i< str.length();  i++) {
			count[str.charAt(i)]++;
		}
		
		for(int p = 0; p < count.length;p++) {
			if(count[p] > 1) {
				int temp = p;
				char tempChar = (char) temp;
				System.out.println(tempChar);
			}
		}
	}

}
