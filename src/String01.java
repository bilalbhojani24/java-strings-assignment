
public class String01 {

	public static void main(String[] args) {

		String s1 = "Bilal";
		String s2 = "Bilal";
//		String s3 = new String("Bilal");
//		String s1 = new String("Bilal");
//		String s2 = new String("Bhojani");
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1);
//		System.out.println(s2);
//		s1 = "Name";
//		
//		s1.concat(s3);
//		
//		String s1 = new String("Bilal");
//		String s2 = new String("Bilal");
//
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(VM.current().addressOf(s1));
//		2060468723
		System.out.println(System.identityHashCode(s1));
		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));
	}

}
