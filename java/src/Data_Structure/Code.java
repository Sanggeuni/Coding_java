package Data_Structure;

import java.util.Iterator;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		long sum = 0;
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);

	}

}
