package Operations;
import java.util.Stack;

public class Subtractor {
  Stack<Double> st;
  
  public Subtractor(Stack<Double> st) {
    this.st = st;
  }
  
  public void operate() {
    Double d = this.st.pop();
    this.st.push(Double.valueOf(((Double)this.st.pop()).doubleValue() - d.doubleValue()));
  }
}
