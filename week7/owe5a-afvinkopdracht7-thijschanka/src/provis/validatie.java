package provis;

public class validatie extends ProVis{
	static final String[] ONE   = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K", "M", "F", "P", "S", "T", "W", "Y", "V"};
	static final String positief = "RK";
	static final String negatief = "DEH";
	public static void main(String[] args) {
	}
	
	public static void ayyyy(String symbol) throws NotAnAA {
		Boolean b = false;
		for(int i = 0; i < 20; i++) {
			if (ONE[i].equals(symbol)){
				b = true;
			}
		}
		if (b == false)throw new NotAnAA("Dit is een niet bestaand aminozuur: "+symbol);
	}
	
	public static String[] count(String symbol) {
		String[] ayyy;
		ayyy = new String [symbol.length()];
		int counter = 0;
		
		for (char a : symbol.toCharArray()) {
			String aa = String.valueOf(a);
			if (aa.equals("R") || aa.equals("K")){
				ayyy[counter] = "+";
			} else if (aa.equals("D") || aa.equals("E") || aa.equals("H")) {
				ayyy[counter] = "-";
			} else {
				ayyy[counter] = "N";
			}
			counter++;
		}
		return ayyy;
		
	}
}
