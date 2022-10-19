package sample;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Demo1 implements ActionListener 
{
		JFrame jframe;
		JPanel jpanel;
		JButton jbutton;
		FlowLayout layout;
		
		
		public Demo1()
		{
			jframe = new JFrame();
			jframe.setTitle("Demo");
			jframe.setSize(300, 200);
			jframe.setLocation(100, 100);
			
			jpanel = new JPanel();
			layout = new FlowLayout(FlowLayout.CENTER,50,50);
			
			jbutton = new JButton("Make it Red");
			jbutton.addActionListener(this);
			
			jpanel.setLayout(layout);
			jpanel.add(jbutton);
			
			jframe.add(jpanel);
			
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jframe.setVisible(true);
			
			
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			jpanel.setBackground(Color.RED);
		}
		
	}


