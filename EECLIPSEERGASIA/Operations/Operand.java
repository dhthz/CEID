package Operations;

import java.util.Stack;

public class Operand {
  private Stack<Double> st;
  
  private StringBuffer sb = new StringBuffer();
  
  public Operand(Stack<Double> st) {
    this.st = st;
  }
  
  private void showVal() {
    System.out.println(this.sb);
  }
  
  public void addDigit(String string) {
    this.sb.append(string);
    showVal();
  }
  
  public void deleteLastDigit() {
    if (this.sb.length() > 0) {
      this.sb.deleteCharAt(this.sb.length() - 1);
      showVal();
    } 
  }
  
  public void reset() {
    this.sb.setLength(0);
    showVal();
    this.st.removeAllElements();
  }
  
  public void complete() {
    if (this.sb.length() > 0) {
      this.st.push(Double.valueOf(Double.parseDouble(this.sb.toString())));
      this.sb.delete(0, this.sb.length());
      showVal();
    } 
  }
  
  public Operand() {}
}