
public class SpecialCharacter {

	public static void main(String[] args) {
		String str = "#GeeKs01fOr@gEEks07";
        int special = 0;
        int others = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
            	others++;
            else
                special++;
        }
 
        System.out.println("Other letters : " + others);
        System.out.println("Special characters : " + special);

	}

}
