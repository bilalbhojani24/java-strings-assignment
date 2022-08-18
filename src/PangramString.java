class IsPangram{
	
	boolean isStringPangram(String str1) {
		String s1 = str1.toLowerCase();
		
		boolean isAllLetter = true;
				
		for(char ch = 'a'; ch <= 'z'; ch++) {
			if(!s1.contains(String.valueOf(ch))) {
				isAllLetter = false;
				break;
			}
		}
		
		 return isAllLetter;
}

}



public class PangramString {

	public static void main(String[] args) {
		IsPangram p = new IsPangram();
		System.out.println(p.isStringPangram("Abcdefghijklmnopqrstuvwxyz"));
	}

}
