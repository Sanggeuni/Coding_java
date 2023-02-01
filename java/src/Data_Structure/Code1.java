package Data_Structure;

import java.util.Iterator;
import java.util.Scanner;

/** 10진수 48일 때, 문자는 '0'이므로 문자를 숫자로 변환할 때는 -48 or - '0'을 해줘야한다.*/
public class Code1 {

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
