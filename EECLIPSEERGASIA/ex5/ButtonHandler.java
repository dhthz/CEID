package ex5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Operations.RemoveLastCharacter;


class ButtonHandler implements ActionListener{
	
	String output;
	 
  public ButtonHandler(String x) {
		output = x;
	}

public void actionPerformed(ActionEvent pushingButton) {
	
	 RemoveLastCharacter rlc = new RemoveLastCharacter();
	  
	 switch(output)
     {
	  case "0" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "0");
	              CalculatorGui.op.addDigit("0");
	              break;
	              
	  case "1" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "1"); 
                  CalculatorGui.op.addDigit("1");
                  break;
	  
	  case "2" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "2"); 
                  CalculatorGui.op.addDigit("2");
                  break;
      
	  case "3" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "3");
                  CalculatorGui.op.addDigit("3");
                  break;
       
      case "4" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "4");
                  CalculatorGui.op.addDigit("4");
                  break;
       
      case "5" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "5");
                  CalculatorGui.op.addDigit("5");
                  break;
       
      case "6" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "6");
                  CalculatorGui.op.addDigit("6");
                  break;
       
      case "7" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "7");
                  CalculatorGui.op.addDigit("7");
                  break;
       
      case "8" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "8");
                  CalculatorGui.op.addDigit("8");
                  break;
       
      case "9" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "9");
                  CalculatorGui.op.addDigit("9");
                  break;
                  
      case "." :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ ".");
                  CalculatorGui.op.addDigit("."); 
                  break;   
       
      case "ce" : CalculatorGui.display.setText(rlc.removeLastChar(CalculatorGui.display.getText()));
                  CalculatorGui.op.deleteLastDigit();
                  break;
       
      case "c" :  CalculatorGui.display.setText(null);
                  CalculatorGui.op.reset();
                  break;
       
      case "+" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "+");
                  CalculatorGui.add.operate();
                  break;
       
      case "-" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "-");
                  CalculatorGui.sub.operate();
                  break;
       
      case "*" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "*");
                  CalculatorGui.mul.operate();
                  break;
       
      case "/" :  CalculatorGui.display.setText(CalculatorGui.display.getText()+ "/");
                  CalculatorGui.div.operate();
                  break;
       
      case "=" :   CalculatorGui.rp.operate();
                   break; 
                     
      case "Enter" : CalculatorGui.display.setText(CalculatorGui.display.getText()+ " ");
    	             CalculatorGui.op.complete();
                     break; 
                      
     } 
  }






}
