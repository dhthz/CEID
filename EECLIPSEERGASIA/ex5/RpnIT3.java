package ex5;

import java.util.Stack;
import Operations.*;

public class RpnIT3 {
  
	
	public static void main(String[] args) {
		Stack<Double> st = new Stack<Double>();
		Operand op = new Operand(st);
		Adder add = new Adder(st);
		ResultPresenter rp = new ResultPresenter(st);
		Divider div = new Divider(st);
		Subtractor sub = new Subtractor(st);
		Multiplier mul = new Multiplier(st);
		
		CalculatorGui test = new CalculatorGui(op,add,rp,div,mul,sub);
		
		

	}

}
