package Operations;
import java.util.Stack;

public class Divider {
  Stack<Double> st;
  
  public Divider(Stack<Double> st) {
    this.st = st;
  }
  
  public void operate() {
    this.st.push(Double.valueOf(((Double)this.st.pop()).doubleValue() / ((Double)this.st.pop()).doubleValue()));
  }
}