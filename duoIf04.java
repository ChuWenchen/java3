import java.util.Scanner;
public class duoIf04{
	public static void main(String[] agrs){
		Scanner myScanner01 = new Scanner(System.in);
		Scanner myScanner02 = new Scanner(System.in);
		System.out.println("��������Ϣ");
		double cj = myScanner01.nextDouble();
		char gender = myScanner02.next().charAt(0);  
		                // scanner.next() �ǽ���һ���ַ���
		                // charAt(0),��ʾ�����ַ����еĵ�һ���ַ�
		if(cj >= 8.0){
			if(gender == '��'){
				System.out.println("����������");
			}else{
				System.out.println("����Ů����");
			}
		}else{
			System.out.println("��̭");
		}

	}
}