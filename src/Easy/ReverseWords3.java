package Easy;

public class ReverseWords3 {

	public static void main(String[] args) {
		System.out.println(new ReverseWords3().reverseWords("This is Sparta!"));
	}
	
	public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        StringBuilder result = new StringBuilder(words[0]).reverse();
        int i = 1;
        
        while (i < words.length) {
        	result.append(" " + new StringBuilder(words[i]).reverse());
        	i++;
        }
        
        return result.toString();
    }
}
