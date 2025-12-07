import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int B = scan.nextInt();
		int C = scan.nextInt();
		int area = B * C;
		

		if (B < 0 || C < 0) {

			throw new Exception("Breadth and height must be positive");

		}
		System.out.println(area);

	}

}