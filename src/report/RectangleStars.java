package report;
import java.util.Scanner;
public class RectangleStars {
	void rec(){
		Scanner s = new Scanner(System.in);
		System.out.print("���簢�� ũ���Է�:");
		int num = s.nextInt();
		for(int i=0;i<5;i++){
			for(int j=0;j<num;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
 