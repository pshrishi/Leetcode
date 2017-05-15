package Easy;

public class NumberComplement {

	public static void main(String[] args) {
		System.out.println(new NumberComplement().findComplement(9));
	}

	public int findComplement(int num) {
        int i = 0;
		while (Math.pow(2, i) < num)
			i++;
		
		return (int) (Math.pow(2, i) - 1 - num);
    }
}
