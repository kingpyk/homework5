package homeworking;

import java.util.Scanner;

public class B02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о����(��������)�� �Է��Ͻÿ�");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.println("����Ʈ�� ������"+pyung_area+"�Դϴ�");
		
		if(pyung_area <15)
			System.out.print("���� ����Ʈ�Դϴ�.");
		if(15<pyung_area&&pyung_area <30)
			System.out.print("�߼��� ����Ʈ�Դϴ�.");
		if(30<pyung_area&&pyung_area <50)
			System.out.print("���� ����Ʈ�Դϴ�.");
		if(pyung_area >50)
			System.out.print("���� ����Ʈ�Դϴ�.");
	}

}
