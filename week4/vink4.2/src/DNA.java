import javax.swing.JOptionPane;

public class DNA extends Sequentie{
	public static int counterDNA = 0;
	
	public static void main(String[] args) {
		DNA dna1 = new DNA("AUG");
		DNA dna2 = new DNA("AAA");
		DNA dna3 = new DNA("TTT");
		DNA dna4 = new DNA("GGG");
		System.out.println(getCount());
	}
	
	DNA(String ntSeq){
		setDNA(ntSeq);
	}
	
	public void setDNA(String ntSeq) {
		if (ntSeq.matches("[AGTC]+")) {
			setSequentie(ntSeq);
			counterDNA++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Geen DNA","Error", 0);
		}
	}
	
	public static int getCount() {
		return counterDNA;
	}
}