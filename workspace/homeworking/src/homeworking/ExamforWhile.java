package homeworking;

import java.util.Scanner;
public class ExamforWhile  {
	public static void main(String[] args) {
		SumofNumbers aa = new SumofNumbers();
		MaxAndMin bb = new MaxAndMin();
		SumAndAvg cc = new SumAndAvg();
		GuGuDan dd = new GuGuDan();
		GuGuDan2 d2 = new GuGuDan2();
		Scanner s = new Scanner(System.in);
		System.out.println("***************");
		System.out.println("�ݺ���         �����ϱ�1");
		System.out.println("**************");
		System.out.println("1.1���� �Է��� ������ ���ϱ�");
		System.out.println("2.�ִ밪/�ּҰ����ϱ�");
		System.out.println("3.�Է¹��� ������ �հ�� ��ձ��ϱ�");
		System.out.println("4.���ϴ� ������ ����ϱ�");
		System.out.println("5.¦����/Ȧ���� ����ϱ�");
		System.out.println("6.�����ϱ�");
		System.out.print("���ϴ� �޴���(���ڸ� �Է��Ͻÿ�)>>");
		int menu1 = s.nextInt();
		switch(menu1){
			case 1:
				aa.sum();
				break;
			case 2:
				bb.maxmin();
				break;
			case 3:
				cc.saa();
				break;
			case 4:
				dd.ggd();
				break;
			case 5:
				d2.ggd2();
				break;
			case 6:
				System.exit(0);
	}
}
}
class SumofNumbers{
	void sum(){ 
	int sum=0;
		Scanner a = new Scanner(System.in);
	System.out.print("###1���� �Է��� ������ ���ϱ�");
	System.out.print("������ ���� �Է�(Q:����)");
	int num1 = a.nextInt();
	if(num1 == 'Q')
		System.exit(0);
	for(int i=1;i<=num1;i++){
		sum += i;
	}
		System.out.print("�� ���� "+sum+"�Դϴ�");
	}
}
class MaxAndMin{
	void maxmin(){
		Scanner b = new Scanner(System.in);
		System.out.println("###�ִ밪/�ּҰ����ϱ�");
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num1 = b.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num2 = b.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num3 = b.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num4 = b.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num5 = b.nextInt();
		int num[] = {num1,num2,num3,num4,num5};
		int max=num[0];
		int min=num[0];
		for(int i=0;i<5;i++)
		{
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
		}
			System.out.print("���� ū ����"+max+"�̰�");
			System.out.print("���� ���� ����"+min+"�Դϴ�");
		}
	}
class SumAndAvg{
	void saa(){
		Scanner c = new Scanner(System.in);
		System.out.println("###�ջ���ձ��ϱ�");
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num1 = c.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num2 = c.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num3 = c.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num4 = c.nextInt();
		System.out.print("0~100���� ������ ���ڸ� �Է�(Q:����)>>");
		int num5 = c.nextInt();
		int sum=0;
		double avg=0;
		int num[] = {num1,num2,num3,num4,num5};
		for(int i=0;i<5;i++)
		{
		sum += num[i];
		}
		avg = sum/5.0;
		System.out.print("�հ��"+sum+"�̰� �����"+avg+"�Դϴ�");
	}
}
class GuGuDan{
void ggd(){
	Scanner d = new Scanner(System.in);
	System.out.println("###���ϴ� ������ ����ϱ�");
	System.out.print("����ϰ���� ��(Q:����)");
	int num = d.nextInt();
	if (num<2&&num>10)
		System.out.println("==> �߸��Է�");
		for(int i=1;i<10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
class GuGuDan2{
void ggd2(){
	Scanner e = new Scanner(System.in);
	System.out.println("###¦����/Ȧ���� ����ϱ�");
	System.out.print("E:¦����,O:Ȧ����(Q����)");
	String s = e.next();
	if(s.equals("E"))
	{
		for(int i=2; i<10;i+=2){
			for(int j=1;j<10;j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	if(s.equals("O"))
	{
		for(int i=1; i<10;i+=2){
			for(int j=1;j<10;j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	if(s.equals("Q"))
	{
		System.exit(0);
	}
}
}
