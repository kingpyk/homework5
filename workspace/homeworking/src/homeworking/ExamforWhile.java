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
		System.out.println("반복문         연습하기1");
		System.out.println("**************");
		System.out.println("1.1부터 입력한 수까지 더하기");
		System.out.println("2.최대값/최소값구하기");
		System.out.println("3.입력받은 숫자의 합계와 평균구하기");
		System.out.println("4.원하는 구구단 출력하기");
		System.out.println("5.짝수단/홀수단 출력하기");
		System.out.println("6.종료하기");
		System.out.print("원하는 메뉴는(숫자를 입력하시오)>>");
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
	System.out.print("###1부터 입력한 수까지 더하기");
	System.out.print("마지막 수를 입력(Q:종료)");
	int num1 = a.nextInt();
	if(num1 == 'Q')
		System.exit(0);
	for(int i=1;i<=num1;i++){
		sum += i;
	}
		System.out.print("총 합은 "+sum+"입니다");
	}
}
class MaxAndMin{
	void maxmin(){
		Scanner b = new Scanner(System.in);
		System.out.println("###최대값/최소값구하기");
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num1 = b.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num2 = b.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num3 = b.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num4 = b.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
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
			System.out.print("가장 큰 수는"+max+"이고");
			System.out.print("가장 작은 수는"+min+"입니다");
		}
	}
class SumAndAvg{
	void saa(){
		Scanner c = new Scanner(System.in);
		System.out.println("###합산평균구하기");
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num1 = c.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num2 = c.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num3 = c.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num4 = c.nextInt();
		System.out.print("0~100까지 사이의 숫자를 입력(Q:종료)>>");
		int num5 = c.nextInt();
		int sum=0;
		double avg=0;
		int num[] = {num1,num2,num3,num4,num5};
		for(int i=0;i<5;i++)
		{
		sum += num[i];
		}
		avg = sum/5.0;
		System.out.print("합계는"+sum+"이고 평균은"+avg+"입니다");
	}
}
class GuGuDan{
void ggd(){
	Scanner d = new Scanner(System.in);
	System.out.println("###원하는 구구단 출력하기");
	System.out.print("출력하고싶은 단(Q:종료)");
	int num = d.nextInt();
	if (num<2&&num>10)
		System.out.println("==> 잘못입력");
		for(int i=1;i<10;i++)
		{
			if(i%2==1)
			{
				System.out.println("")
			}
			System.out.println(num+"*"+i+"="+num*i+" ");
		}
	}
}
class GuGuDan2{
void ggd2(){
	Scanner e = new Scanner(System.in);
	System.out.println("###짝수단/홀수단 출력하기");
	System.out.print("E:짝수단,O:홀수단(Q종료)");
	String s = e.next();
	if(s.equals("E"))
	{
		for(int i=1; i<10;i++){
			for(int j=2;j<10;j+=2){
				System.out.println(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	if(s.equals("O"))
	{
		for(int i=1; i<10;i++){
			for(int j=1;j<10;j+=2){
				System.out.println(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	if(s.equals("Q"))
	{
		System.exit(0);
	}
}
}
