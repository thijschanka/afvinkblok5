package yanaara;

public class validatie extends YANAARA{
	static final String[] ONE   = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K", "M", "F", "P", "S", "T", "W", "Y", "V"};
	static final String[] foob = {"A", "F", "L", "M", "P", "W"};
	
	public static void ayyyy(String symbol) throws NotAnAA {
		Boolean b = false;
		for(int i = 0; i < 20; i++) {
			if (ONE[i].equals(symbol)){
				b = true;
			}
		}
		if (b == false)throw new NotAnAA("Dit is een niet bestaand aminozuur: "+symbol);
	}
	
	public static int count(String symbol) {
		int sumfoob = 0;
		for (char a : symbol.toCharArray()) {
			String aa = String.valueOf(a);
			for (int i = 0; i < 6; i++) {
				if (foob[i].equals(aa))sumfoob++;
			}
		}
		return sumfoob;
	}
}
