package Operations;
import java.util.Stack;

import ex5.CalculatorGui;

public class ResultPresenter {
  Stack<Double> st;
  
  public ResultPresenter(Stack<Double> st) {
    this.st = st;
  }
  
  public void operate() {
    String str = ((Double)this.st.pop()).toString();
    CalculatorGui.display.setText(str);
  }
}
