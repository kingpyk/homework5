
package homework4;

import java.util.*;

public class B03 {

	
	public static void main(String[] args) {
		new B03().Month();
	}
	public void Month(){
		Scanner s = new Scanner(System.in);
		int month,day,i,Monthtotal = 0;
		System.out.print("���� �Է��Ͻÿ�.");
		month = s.nextInt();
		System.out.print("���� �Է��Ͻÿ�.");;
		day = s.nextInt();
		int[] month_day={31,28,31,30,31,30,31,31,30,31,30,31};
		for(i=0;i<month-1;i++){
			Monthtotal +=month_day[i];
		}
		int day_count=Monthtotal+day;
		System.out.print("�� ��¥�� 1����"+day_count+"��° ���� �ش�˴ϴ�.");
	}
	}

