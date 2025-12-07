package designpatterns;

public class FactoryClass {

	public InterfaceDemo getOs(String str) {
		if(str.equalsIgnoreCase("a")) {
		return new SumClass();
		}else if(str.equalsIgnoreCase("b")) {
			return new SumClass1();
		}else
		return new SumClass2();
		
	}

}
