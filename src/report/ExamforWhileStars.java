package report;
import java.util.Scanner;
public class ExamforWhileStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("************");
		System.out.println("1. ���簢�� �����");
		System.out.println("2. �����ﰢ �����");
		System.out.println("3. �̵�ﰢ�� �����");
		System.out.println("4. ���̾Ƹ�� �����");
		System.out.println("5. �����ϱ�");
		System.out.print("���ϴ� �޴���>>");
		int menu = s.nextInt();
		switch(menu){
		case 1:
			new RectangleStars().rec();
			break;
		case 2:
			new TriangleStars().tri();
			break;
		case 3:
			new IsoscelesTriangleStars().iso();
			break;
		case 4:
			new DiamondStars().dia();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

}
