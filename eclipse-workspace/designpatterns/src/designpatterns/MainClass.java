package designpatterns;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		String a=scanner.next();
     FactoryClass class1=new FactoryClass();
     InterfaceDemo os = class1.getOs(a);
		os.sum();
		
	}

}
