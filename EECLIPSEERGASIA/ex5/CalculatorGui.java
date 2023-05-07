package ex5;

import java.awt.*;
import java.awt.event.*;

import Operations.*;





public class CalculatorGui extends Frame{

	private static final long serialVersionUID = 1L;

	public static TextField display;
	
	public static Frame win;
	
	public static Operand op;

	public static Adder add;
	
	public static ResultPresenter rp;
	
	public static Subtractor sub;
	
	public static Multiplier mul; 
	
	public static Divider div;
	
	public Button button0;

	public Button button1;

	private Button button2;



	private Button buttonEnter;

	private Button buttonPlus;

	private Button buttonRes;

	private Button buttonc;

	private Button buttonce;

	private Button button3;

	private Button button6;

	private Button button5;

	private Button button4;

	private Button button7;

	private Button button8;

	private Button button9;

	private Button buttonDot;

	private Button buttonSub;

	private Button buttonDiv;

	private Button buttonMul;

    public static final int DBW = 45; 
    public static final int BH = 28;
  
	public CalculatorGui(Operand op,Adder add,ResultPresenter rp,Divider div,Multiplier mul,Subtractor sub)
	{	
		CalculatorGui.op= op;
		CalculatorGui.add = add;
		CalculatorGui.rp = rp;
		CalculatorGui.mul = mul;
        CalculatorGui.div = div;
        CalculatorGui.sub = sub; 

        
        win = new Frame("1093370");
	    win.setLayout(null);
	    win.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	    win.setBackground(Color.WHITE);    
	    win.setSize(283,320);
	    win.setLocation(40,80);
	    win.setVisible(true);
	    win.setResizable(false);
	    win.addWindowListener(new CloseWindowAndExit());
		//Button 0 
	    button0 = new Button("0");
		button0.setBounds(90, 265,DBW,BH);
		button0.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button0.setForeground(Color.blue);
		button0.addActionListener(new ButtonHandler("0"));
		win.add(button0);
		
		//Button 1
		button1 = new Button("1");
		button1.setBounds(40, 232, DBW,BH);
		button1.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button1.setForeground(Color.blue);
		button1.addActionListener(new ButtonHandler("1"));
		win.add(button1);
		
		//Button 2
		button2 = new Button("2");
		button2.setBounds(90,232, DBW,BH);
		button2.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button2.setForeground(Color.blue);
		button2.addActionListener(new ButtonHandler("2"));
		win.add(button2);
       
		//Button 3
		button3 = new Button("3");
		button3.setBounds(140, 232,DBW,BH);
		button3.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button3.setForeground(Color.blue);
		button3.addActionListener(new ButtonHandler("3"));
		win.add(button3);
		
		//Button 4
		button4 = new Button("4");
		button4.setBounds(40, 199,DBW,BH);
		button4.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button4.setForeground(Color.blue);
		button4.addActionListener(new ButtonHandler("4"));
		win.add(button4);
		
		//Button 5
		button5 = new Button("5");
		button5.setBounds(90, 199,DBW,BH);
		button5.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button5.setForeground(Color.blue);
		button5.addActionListener(new ButtonHandler("5"));
		win.add(button5);
		
		//Button 6
		button6 = new Button("6");
		button6.setBounds(140, 199,DBW,BH);
		button6.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button6.setForeground(Color.blue);
		button6.addActionListener(new ButtonHandler("6"));
		win.add(button6);
		
		//Button 7
		button7 = new Button("7");
		button7.setBounds(40, 166,DBW,BH);
		button7.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button7.setForeground(Color.blue);
		button7.addActionListener(new ButtonHandler("7"));
		win.add(button7);
		
		//Button 8
		button8 = new Button("8");
		button8.setBounds(90, 166,DBW,BH);
		button8.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button8.setForeground(Color.blue);
		button8.addActionListener(new ButtonHandler("8"));
		win.add(button8);
		
		//Button 9
		button9 = new Button("9");
		button9.setBounds(140, 166,DBW,BH);
		button9.setFont(new Font("TimesRoman", Font.PLAIN,14));
		button9.setForeground(Color.blue);
		button9.addActionListener(new ButtonHandler("9"));
		win.add(button9);
		
		//Button .
		buttonDot = new Button(".");
		buttonDot.setBounds(40, 265,DBW,BH);
		buttonDot.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonDot.setForeground(Color.blue);
		buttonDot.addActionListener(new ButtonHandler("."));
		win.add(buttonDot);                                       
		
		//Button Enter
		buttonEnter = new Button("Enter");
		buttonEnter.setBounds(140, 133, 100, 28);
		buttonEnter.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonEnter.setForeground(Color.red);
		buttonEnter.addActionListener(new ButtonHandler("Enter"));
		win.add(buttonEnter);
		
		//Button +
		buttonPlus = new Button("+");
		buttonPlus.setBounds(195, 265,DBW,BH);
		buttonPlus.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonPlus.setForeground(Color.blue);
		buttonPlus.addActionListener(new ButtonHandler("+"));
		win.add(buttonPlus);
	    
	    //Button -
		buttonSub = new Button("-");
		buttonSub.setBounds(195, 232,DBW,BH);
		buttonSub.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonSub.setForeground(Color.blue);
		buttonSub.addActionListener(new ButtonHandler("-"));
		win.add(buttonSub);
		
		//Button /
		buttonDiv = new Button("/");
		buttonDiv.setBounds(195, 166,DBW,BH);
		buttonDiv.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonDiv.setForeground(Color.blue);
		buttonDiv.addActionListener(new ButtonHandler("/"));
		win.add(buttonDiv);
		
		//Button *
		buttonMul = new Button("*");
		buttonMul.setBounds(195, 199,DBW,BH);
		buttonMul.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonMul.setForeground(Color.blue);
		buttonMul.addActionListener(new ButtonHandler("*"));
		win.add(buttonMul);                                    
		
		//Button =
		buttonRes = new Button("=");
		buttonRes.setBounds(140, 265,DBW,BH);
		buttonRes.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonRes.setForeground(Color.cyan);
		buttonRes.addActionListener(new ButtonHandler("="));
		win.add(buttonRes);
		
		//Button c
		buttonc = new Button("c");
		buttonc.setBounds(40, 133,DBW,BH);
		buttonc.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonc.setForeground(Color.green);
		buttonc.addActionListener(new ButtonHandler("c"));
		win.add(buttonc);
		
		//Button ce
		buttonce = new Button("ce");
		buttonce.setBounds(90,133,DBW,BH);
		buttonce.setFont(new Font("TimesRoman", Font.PLAIN,14));
		buttonce.setForeground(Color.green);
		buttonce.addActionListener(new ButtonHandler("ce"));
		win.add(buttonce); 
				
		//Display
	    display = new TextField();
	    display.setEditable(false);
	    display.setBounds(13, 55, 257, 30);
	    win.add(display);
		
		
  	}
}

class CloseWindowAndExit extends WindowAdapter {
	public void windowClosing(WindowEvent closeWindowAndExit) {
		System.exit(0);
	}
	
	}