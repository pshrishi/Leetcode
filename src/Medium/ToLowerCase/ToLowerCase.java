package ToLowerCase;

public class ToLowerCase {

	public static void main(String[] args) {
		System.out.println(toLowerCase("Hello"));
	}
	
	public static String toLowerCase(String str) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			
			s.append(Character.toLowerCase(ch));
		}
		
		return s.toString();
	}
}
