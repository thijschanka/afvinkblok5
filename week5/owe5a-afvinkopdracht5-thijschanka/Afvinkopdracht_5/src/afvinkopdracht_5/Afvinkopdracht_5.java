/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvinkopdracht_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 *
 * @author martijn
 */
public class Afvinkopdracht_5 extends JFrame implements ActionListener {

	static JTextField one = new JTextField(10);
	static JButton two = new JButton("translate 1 -> 3");
	static JTextField tree = new JTextField(10);
	static JButton flour = new JButton("translate één 3 -> 1");

	public static void main(String[] args) {
		Afvinkopdracht_5 frame = new Afvinkopdracht_5();
		frame.setTitle("afvinkopdracht5");
		frame.setSize(170, 150);
		frame.createGUI();
		frame.setVisible(true);
	}

	private void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container window = getContentPane(); 
		one.setMaximumSize(new Dimension(300,25)); 
		two.setMaximumSize(new Dimension(150,25));
		flour.setMaximumSize(new Dimension(150,25));
		tree.setMaximumSize(new Dimension(300,25));
		window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));
		window.add(one);
		window.add(two);
		window.add(flour);
		window.add(tree);
		one.setText("1Lettercode");
		two.addActionListener(this);
		flour.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String Lorax;
		String three;
		if (event.getSource() == two) {
			Lorax = one.getText().toUpperCase();
			three = "";
			for (char a : Lorax.toCharArray()) {
				try {
					String aa = String.valueOf(a);
					three += Translator.one2three(aa)+"-";
				} catch (NotAnAA e) {
					JOptionPane.showMessageDialog(null, "HUEHUEHUEHUEHUEHUE", "YOU IGNORANT BASTARD", 1);
					int t = 1;
					while(t < 70) {
						JOptionPane.showMessageDialog(null, "aye mate das geen aminozuur", "fagget"+t, 0);
						JOptionPane.showMessageDialog(null, "Sorry for this", "From your canadian friend", 1);
						t++;
					}
				}
			}
			three = three.substring(0, three.length()-1);
			tree.setText(three);
		}else {
			Lorax = "";
			three = tree.getText();
			try {
				Lorax += Translator.three2one(three);
			} catch (NotAnAA e) {
				JOptionPane.showMessageDialog(null, "HUEHUEHUEHUEHUEHUE", "YOU IGNORANT BASTARD", 1);
				int t = 1;
				while(t < 70) {
					JOptionPane.showMessageDialog(null, "aye mate das geen en of niet één aminozuur", "fagget"+t, 0);
					JOptionPane.showMessageDialog(null, "Sorry for this", "From your canadian friend", 1);
					t++;
				}
			}
			one.setText(Lorax);
		}
		

	}

}
