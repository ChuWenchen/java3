import java.util.Scanner;
public class duoIf03{
	public static void main(String[] agrs){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���÷�");
		int fen = myScanner.nextInt();
		if(fen == 100){
			System.out.println("���ü���");
		}else if(fen >= 80 && fen <= 99){
			System.out.println("��������");
		}else if(fen >= 60 && fen <= 80){
			System.out.println("����һ��");
		}else{
			System.out.println("���ò�����");
		}
	}
}