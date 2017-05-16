package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(new FizzBuzz().fizzBuzz(20));
	}

	public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i=0; i<n; i++) {
        	String str = "";
        	Boolean flag = false;
        	
        	if ((i+1) % 3 == 0)
        	{
        		flag = true;
        		str += "Fizz";
        	}
        	
        	if ((i+1) % 5 == 0)
        	{
        		flag = true;
        		str += "Buzz";
        	}
        	
        	if(flag)
        		result.add(str);
        	else
        		result.add((i+1) + "");
        }
        
        return result;
    }
}
