package AWT_Package;
//import java.awt.Button;
import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.Label;
//import java.awt.Panel;
//import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public  class Calci implements ActionListener{
	
	JFrame frame;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	public Calci() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame ("Calculator");
		frame.setSize(600,350);
		frame.setLocation(200, 150);
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 40));
		l1 = new JLabel("Num1");
		l2 = new JLabel("Num2");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 40));
		l3= new JLabel("Result");
		t3 = new JTextField(10);
		
		p2.add(l3);
		p2.add(t3);
		
		p3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 30));
		
		b1 = new JButton("+");
		b1.addActionListener(this);
		p3.add(b1);
		
		b2 = new JButton("-");
		b2.addActionListener(this);
		p3.add(b2);
		
		b3 = new JButton("*");
		b3.addActionListener(this);
		p3.add(b3);
		
		b4 = new JButton("/");
		b4.addActionListener(this);
		p3.add(b4);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		float result = 0;
		if(e.getSource() ==b1)
		{
			result =(Float.parseFloat(t1.getText()) + Float.parseFloat(t2.getText()) );
		}
		
		else if(e.getSource() == b2)
		{
			result =(Float.parseFloat(t1.getText()) - Float.parseFloat(t2.getText()) );
		}
		else if(e.getSource() == b3)
		{
			result =(Float.parseFloat(t1.getText()) * Float.parseFloat(t2.getText()) );
		}
		else if(e.getSource() == b4)
		{
			result =(Float.parseFloat(t1.getText()) / Float.parseFloat(t2.getText()) );
		}
		
		t3.setText(result + "");
	}

}
