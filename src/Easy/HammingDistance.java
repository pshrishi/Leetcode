package Easy;

public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(new HammingDistance().hammingDistance(1,4));
	}
	
	public int hammingDistance(int x, int y) {
		String xBin = convertToBinary(x);
		String yBin = convertToBinary(y);
		
		if (xBin.length() > yBin.length()) {
			int difference = xBin.length() - yBin.length();
			
			for(int i=0; i<difference; i++) {
				yBin = "0" + yBin;
			}
		}
		else if (yBin.length() > xBin.length()) {
			int difference = yBin.length() - xBin.length();
			
			for(int i=0; i<difference; i++) {
				xBin = "0" + xBin;
			}
		}
		
		int count = 0;
		for (int i=0; i<xBin.length(); i++) {
			if (xBin.charAt(i) != yBin.charAt(i))
				count++;
		}
		
		return count;
	}
	
	public String convertToBinary(int x) {
		String s = "";
		
		while (x > 0) {
			s = ((x % 2) == 0 ? "0" : "1") + s;
			x = x/2;
		}
		
		return s;
	}
	
	public String convertToBinaryInternal(int x) {
		return Integer.toBinaryString(x);
	}
}
