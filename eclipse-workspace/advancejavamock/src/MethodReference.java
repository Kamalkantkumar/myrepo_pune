
public class MethodReference {
	public static void calculator() {
		System.out.println("sum of a and b is ");
	}
	public static void main(String[] args) {
		//MethodReference methodReference=new MethodReference();
		CalculatorInterface calculatorInterface=MethodReference::calculator;
		calculatorInterface.sum();
		}
	
	
}
