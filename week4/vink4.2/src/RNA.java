import javax.swing.JOptionPane;

public class RNA extends Sequentie{
	public static int counterRNA = 0;
	
	public static void main(String[] args) {
		RNA rna1 = new RNA("AUG");
		RNA rna2 = new RNA("AAT");
		RNA rna3 = new RNA("TTT");
		RNA rna4 = new RNA("GGG");
		System.out.println(getCount());
	}
	
	RNA(String ntSeq){
		setRNA(ntSeq);
	}
	
	public void setRNA(String ntSeq) {
		if (ntSeq.matches("[AGUC]+")) {
			setSequentie(ntSeq);
			counterRNA++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Geen RNA","Error", 0);
		}
	}
	
	public static int getCount() {
		return counterRNA;
	}
}