import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener {
	TextField field1;
	TextField field2;
	Button multiply;
	Button plus;
	Button minus;
	Button divide;
	Button calculate;
	Button clear;
	Label output;
	Label about;
	int option;
	
	public void init() {
		setLayout(null);
		setBackground(Color.lightGray);
		field1 = new TextField (20);
		field2 = new TextField (10);
		multiply = new Button("*");
		plus = new Button("+");
		minus = new Button("-");
		divide = new Button("/");
		calculate = new Button(" = ");
		clear = new Button("Clear");
		output = new Label("Enter valid values.");
		about = new Label("Calculator created by Aluben");
		int option = 0;
		field1.setBounds(15, 15, 220, 20);
		field2.setBounds(15, 75, 220, 20);
		multiply.setBounds(15, 47, 35, 20);
		plus.setBounds(70, 47, 35, 20);
		minus.setBounds(140, 47, 35, 20);
		divide.setBounds(200, 47, 35, 20);
		calculate.setBounds(15, 110, 220, 20);
		clear.setBounds(15, 150, 220, 20);
		output.setBounds(15, 130, 220, 20);
		about.setBounds(45, 175, 220, 20);
		multiply.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		divide.addActionListener(this);
		calculate.addActionListener(this);
		clear.addActionListener(this);
		multiply.setBackground(Color.white);
		plus.setBackground(Color.white);
		minus.setBackground(Color.white);
		divide.setBackground(Color.white);
		calculate.setBackground(Color.white);
		clear.setBackground(Color.white);
		add(field1);
		add(field2);
		add(multiply);
		add(plus);
		add(minus);
		add(divide);
		add(calculate);
		add(clear);
		add(output);
		add(about);
	}

	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == multiply) 
		{
		multiply.setBackground(Color.lightGray);
		plus.setBackground(Color.white);
		minus.setBackground(Color.white);
		divide.setBackground(Color.white);
		option = 1;	
		}
		
		if(e.getSource() == plus) 
		{
		multiply.setBackground(Color.white);
		minus.setBackground(Color.white);
		plus.setBackground(Color.lightGray);
		divide.setBackground(Color.white);
		option = 2;	
		}
		
		if(e.getSource() == minus) 
		{
		multiply.setBackground(Color.white);
		plus.setBackground(Color.white);
		minus.setBackground(Color.lightGray);
		divide.setBackground(Color.white);
		option = 3;	
		}
		
		if(e.getSource() == divide) 
		{
		multiply.setBackground(Color.white);
		plus.setBackground(Color.white);
		minus.setBackground(Color.white);
		divide.setBackground(Color.lightGray);
		option = 4;
		}
		
		if(e.getSource() == clear) 
		{
		multiply.setBackground(Color.white);
		plus.setBackground(Color.white);
		minus.setBackground(Color.white);
		divide.setBackground(Color.white);
		field1.setText("");	
		field2.setText("");
		output.setText("Result: [NONE]");
		option = 0;	
		}
		
		if(e.getSource() == calculate) 
		{ 
			switch (option) {
				case 0:
					output.setText("Error: no calculation type selected.");
				break;
			
				case 1:	
					int multiply1;
					int multiply2;
					int multiplyResult;
					multiply1 = Integer.parseInt(field1.getText());
					multiply2 = Integer.parseInt(field2.getText());
					multiplyResult = multiply1 * multiply2;
					output.setText("Result: " + multiplyResult);
				break;
			
				case 2:
					int plus1;
					int plus2;
					int plusResult;
					plus1 = Integer.parseInt(field1.getText());
					plus2 = Integer.parseInt(field2.getText());
					plusResult = plus1 + plus2;
					output.setText("Result: " + plusResult);
				break;
			
				case 3:
					int minus1;
					int minus2;
					int minusResult;
					minus1 = Integer.parseInt(field1.getText());
					minus2 = Integer.parseInt(field2.getText());
					minusResult = minus1 - minus2;
					output.setText("Result: " + minusResult);
				break;
			
				case 4:	
					int divide1;
					int divide2;
					int divideResult;
					divide1 = Integer.parseInt(field1.getText());
					divide2 = Integer.parseInt(field2.getText());
					divideResult = divide1 / divide2;
					output.setText("Result: " + divideResult);
				break;
			
				default:
					output.setText("Fill in valid values.");
				break;
			}
		}
	}
}
