package Presentationlayer;
import java.awt.*;
import javax.swing.*;
import Business_layer.add;
import java.awt.event.*;

public class Manu implements ActionListener{
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3,l4;
	public Manu()
	{
		f=new JFrame("Simple Calculator");
		b1=new JButton("add");
		b2=new JButton("substract");
		b3=new JButton("Multiply");
		b4=new JButton("Divison");
		b5=new JButton("Cancel");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		l1=new JLabel("enter x");
		l2=new JLabel("enter y");
		l3=new JLabel("ANS");
		l4=new JLabel("");
		f.setVisible(true);
		f.setSize(200,200);
		f.add(l4);
		l4.add(l1);
		l4.add(t1);
		l4.add(l2);
		l4.add(t2);
		l4.add(l3);
		l4.add(t3);
		l4.add(b1);
		l4.add(b2);
		l4.add(b3);
		l4.add(b4);
		l4.add(b5);
		l1.setBounds(150,70,200,90);
		l2.setBounds(150,150,200,90);
		l3.setBounds(150,230,200,90);
		l4.setBounds(150,300,200,90);
		b1.setBounds(150,380,200,90);
		b2.setBounds(400,380,200,90);
		b3.setBounds(700,380,200,90);
		b4.setBounds(1000,380,200,90);
		b5.setBounds(500,600,200,90);
		t1.setBounds(450,70,200,90);
		t2.setBounds(450,150,200,90);
		t3.setBounds(450,230,200,90);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		add ad=new add();
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		if(ae.getSource().equals(b1))
		{
			String v=String.valueOf((ad.addition(x,y)));
			t3.setText(v);
		}
		else if(ae.getSource().equals(b2))
		{
			String v=String.valueOf((ad.substraction(x,y)));
			t3.setText(v);	
		}
		else if(ae.getSource().equals(b3))
		{
			String v=String.valueOf((ad.multiplication(x,y)));
			t3.setText(v);
		}
		else if(ae.getSource().equals(b4))
		{
			String v=String.valueOf((ad.division(x,y)));
			t3.setText(v);
		}
		else if(ae.getSource().equals(b5))
		{
			f.setVisible(false);
		}
		else
		{
			f.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		new Manu();
		

	}

}
