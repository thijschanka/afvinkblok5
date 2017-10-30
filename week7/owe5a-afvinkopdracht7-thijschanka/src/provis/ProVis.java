/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author student
 */

public class ProVis extends JFrame implements ActionListener{

	JTextArea text;
	JTextField bestand_naam_veld;
	JButton knop;
	JPanel is_dit_een_panel_vraagteken;
    JButton kan_ik_mijn_bestand_vinden_met_deze_knop_vraagteken_knop;
    JFileChooser kiest_dit_mijn_bestand_vraagteken;
    BufferedReader inFile;
	
    public static void main(String[] args) {
        ProVis frame = new ProVis();
        frame.setSize(700, 350);
        frame.setTitle("YANAARA");
        frame.createGUI();
        frame.show();
    }
    
    public void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        JLabel labeltje = new JLabel("sequentie:");
        JLabel labeltje2 = new JLabel("Bestand:");
        
        text = new JTextArea(5,30);
        bestand_naam_veld = new JTextField(30);
        
        knop = new JButton("ayyyyy analyseer die code");
        kan_ik_mijn_bestand_vinden_met_deze_knop_vraagteken_knop = new JButton("kies dat bestandjeeee");
        
        is_dit_een_panel_vraagteken = new JPanel();
        is_dit_een_panel_vraagteken.setPreferredSize(new Dimension(675, 170));
        
        window.add(kan_ik_mijn_bestand_vinden_met_deze_knop_vraagteken_knop);
        window.add(knop);
        window.add(labeltje2);
        window.add(bestand_naam_veld);
        window.add(labeltje);
        window.add(text);
        window.add(is_dit_een_panel_vraagteken);
        knop.addActionListener(this);
        kan_ik_mijn_bestand_vinden_met_deze_knop_vraagteken_knop.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event) {
    	if (event.getSource() == knop) {
    		analyseer();
    	}else if (event.getSource() == kan_ik_mijn_bestand_vinden_met_deze_knop_vraagteken_knop) {
    		selectbestand();
    	}	
    }
    
    public void analyseer() {
    String sequentie = text.getText().toUpperCase();
    sequentie = sequentie.replace("\n", "");
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
	sequentie += "A";
	String lijst[] = validatie.count(sequentie);
	teken(lijst, totaal);    
    }
    
    public void teken(String[] lijst, int totaal) {
    	float verhouding = 500/totaal;
    	int xbegin = 0;
    	Graphics paper = is_dit_een_panel_vraagteken.getGraphics();
    	paper.clearRect(0, 0, 675, 170);
    	paper.setColor(new Color(255,255,255));
		paper.fillRect(100, 0, 500, 100);
		paper.setColor(Color.BLACK);
		paper.fillRect(100, 0, 500, 100);
		for(int i = 0; i < lijst.length; i++) {
			if (lijst[i] == "+") {
				paper.setColor(Color.red);
				xbegin = (int) (i*verhouding);
				paper.fillRect(xbegin+100, 0, (int) verhouding, 100);
			}else if (lijst[i] == "-") {
				paper.setColor(Color.PINK);
				xbegin = (int) (i*verhouding);
				paper.fillRect(xbegin+100, 0, (int) verhouding, 100);
			}
		}
		
		paper.setColor(Color.GREEN);
		paper.drawString("totaal = "+totaal, 25, 150);
		paper.setColor(new Color(150,150,255));
		for(int i = 0; i <500; i += 50) {
			paper.drawLine(i+100, 0, i+100, 100);
			String formattedString = String.format("%.02f", (i/verhouding));
			paper.drawString(""+(formattedString), i+95, 120);
		}
    }
    
    public void selectbestand() {
    File selectedFile;
    int reply;
    kiest_dit_mijn_bestand_vraagteken = new JFileChooser();
    reply = kiest_dit_mijn_bestand_vraagteken.showOpenDialog(this);
    if (reply == JFileChooser.APPROVE_OPTION) {
    	selectedFile = kiest_dit_mijn_bestand_vraagteken.getSelectedFile();
    	bestand_naam_veld.setText(selectedFile.getAbsolutePath());
        readFile();
        }
    }
    
    public void readFile() {
    try {
        inFile = new BufferedReader(new FileReader(bestand_naam_veld.getText()));
        text.setText("");
        String line;
        while ((line = inFile.readLine()) != null) {
            text.append(line + "\n");
        }
        inFile.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null,
                "File Error: " + e.toString());
    }
    	
    }
}
