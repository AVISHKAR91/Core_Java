package sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Simplecolorchoose implements ActionListener { 
	JFrame frame;
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	
	JButton b;
	
	public Simplecolorchoose() {
		
		frame = new JFrame("Color Choser");
		frame.setSize(600,300);
		frame.setLocation(200,150);
		
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 40 , 40));
		l1 = new JLabel("This is demo text.");
		
		p1.add(l1);
		
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20 , 40));
		
		l2 = new JLabel("R");
		l3 = new JLabel("G");
		l4 = new JLabel("B");
	
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		p2.add(l2);
		p2.add(t1);
		
		p2.add(l3);
		p2.add(t2);
		
		p2.add(l4);
		p2.add(t3);
		
		p3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 30 , 30));
		
        b = new JButton("Set Color");
        b.addActionListener(this);
        
        p3.add(b);
        
        JButton reset = new JButton("Reset");
        reset.addActionListener(this);
        
        p3.add(reset);
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}



	


	public void actionPerformed(ActionEvent ae) {
    	
		Object reset = null;
		if(ae.getSource() == reset)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			l1.setForeground(Color.BLACK);
			
		}
		else
		{
		l1.setForeground(new Color(Integer.parseInt(t1.getText()), Integer.parseInt(t3.getText()), Integer.parseInt(t2.getText())));
		}
	}
}
	


