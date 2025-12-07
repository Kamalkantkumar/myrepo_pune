package coreFinalMock;

public class FabbinacciSeries {
	
	public static void main(String[] args) {
		
	int a=0,b=1,count=10,c;
	System.out.println(a);	
		System.out.println(b);
		for (int i = 2; i <1000 ; i++) {
			c=a+b;//1
		a=b;
		b=c;
		if(c>=10) {
			break;
		}
		System.out.println(c);
			
		}
		
		
		
		
	}

}
