package homeworking;

import java.util.Scanner;

public class B02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양면적(제곱미터)를 입력하시오");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.println("아파트의 평형은"+pyung_area+"입니다");
		
		if(pyung_area <15)
			System.out.print("소형 아파트입니다.");
		if(15<pyung_area&&pyung_area <30)
			System.out.print("중소형 아파트입니다.");
		if(30<pyung_area&&pyung_area <50)
			System.out.print("중형 아파트입니다.");
		if(pyung_area >50)
			System.out.print("대형 아파트입니다.");
	}

}
