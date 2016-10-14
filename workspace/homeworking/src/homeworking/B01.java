package homeworking;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째숫자를 입력하시오 ");
		int num1 = s.nextInt();
		System.out.print("두번째숫자를 입력하시오 ");
		int num2 = s.nextInt();
		System.out.print("세번째숫자를 입력핫히오 ");
		int num3 = s.nextInt();
		
		int max=0;
		int min=0;
		if(num1 > num2 && num1 > num3)
			max = num1;
		else if(num2 > num1 && num2 > num3)
			max = num2;
		else if(num3 > num1 && num3 > num2)
			max = num3;
		
		if(num1 < num2 && num1 < num3)
			min = num1;
		else if(num2 < num1 && num2 < num3)
			min = num2;
		else if(num3 < num1 && num3 < num2)
			min = num3;	
	if(num1==num2 && num2==num3)
			max=num1;
		    min = num1;
		System.out.println("가장큰수는"+max+"이고, 가장작은수는 "+min+"입니다.");
	}

}