/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yanaara;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 *
 * @author student
 */

public class YANAARA extends JFrame implements ActionListener{

	JTextArea text;
	JButton knop;
	JPanel is_dit_een_panel_vraagteken;
    
    public static void main(String[] args) {
        YANAARA frame = new YANAARA();
        frame.setSize(700, 300);
        frame.setTitle("YANAARA");
        frame.createGUI();
        frame.show();
    }
    
    public void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        JLabel labeltje = new JLabel("sequentie:");
        text = new JTextArea(5,30);
        knop = new JButton("ayyyyy analyseer die code");
        is_dit_een_panel_vraagteken = new JPanel();
        is_dit_een_panel_vraagteken.setPreferredSize(new Dimension(675, 170));
        window.add(labeltje);
        window.add(text);
        window.add(knop);
        window.add(is_dit_een_panel_vraagteken);
        knop.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event) {
    	String sequentie = text.getText().toUpperCase();
    	int sumfoob;
    	int sumfiel;
    	int totaal = sequentie.length();
    	for (char a : sequentie.toCharArray()) {
    		try {
				String aa = String.valueOf(a);
				validatie.ayyyy(aa);
			} catch (NotAnAA e) {
				JOptionPane.showMessageDialog(null, "HUEHUEHUEHUEHUEHUE", "YOU IGNORANT BASTARD", 1);
				int t = 1;
				while(t < 2) {
					JOptionPane.showMessageDialog(null, "aye mate das geen aminozuur", "fagget"+t, 0);
					JOptionPane.showMessageDialog(null, "Sorry for this", "From your canadian friend", 1);
					t++;
				}
			}
    	}
    	sumfoob = validatie.count(sequentie);
    	sumfiel = totaal - sumfoob;
    	int perfoob = 100/totaal*sumfoob;
    	int perfiel = 100/totaal*sumfiel;
    	teken(perfoob, perfiel, totaal);
    }
    
    public void teken(int perfoob, int perfiel, int totaal) {
    	Graphics paper = is_dit_een_panel_vraagteken.getGraphics();
    	paper.setColor(new Color(255,255,255));
		paper.fillRect(100, 0, 500, 100);
		paper.setColor(Color.red);
		paper.fillRect(100, 0, perfoob/2*10, 50);
		paper.drawString("Polair", 25, 75);
		paper.setColor(Color.PINK);
		paper.drawString("Apolair", 25, 25);
		paper.fillRect(100, 50, perfiel/2*10, 50);
		paper.setColor(Color.GREEN);
		paper.drawString("totaal = "+totaal, 25, 150);
		paper.setColor(new Color(150,150,255));
		for(int i = 0; i <500; i += 50) {
			paper.drawLine(i+100, 0, i+100, 100);
			paper.drawString(""+i*2/10, i+95, 120);
		}
		int i = 500;
		paper.drawLine(i+100, 0, i+100, 100);
		paper.drawString(""+i*2/10, i+90, 120);
    }
}
