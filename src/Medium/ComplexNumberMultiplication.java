package Medium;

public class ComplexNumberMultiplication {

	public static void main(String[] args) {
		System.out.println(new ComplexNumberMultiplication().complexNumberMultiply("1+-1i", "1+-1i"));
	}

	public String complexNumberMultiply(String x, String y) {
        ComplexNumber xCom = new ComplexNumber(x);
        ComplexNumber yCom = new ComplexNumber(y);
        
        return xCom.multiply(yCom).toString();
    }
	
	class ComplexNumber {
		public int a;
		public int b;
		
		public ComplexNumber(String x) {
			String[] splits = x.split("\\+");
			
			a = Integer.parseInt(splits[0]);
			b = Integer.parseInt(splits[1].substring(0, splits[1].length() - 1));
		}
		
		public ComplexNumber(int _a, int _b) {
			a = _a;
			b = _b;
		}

		public ComplexNumber multiply(ComplexNumber other) {
			return new ComplexNumber(this.a * other.a - this.b * other.b, this.a * other.b + this.b * other.a);
		}
		
		@Override
		public String toString() {
			return a + "+" + b + "i";
		}
		
	}
}
