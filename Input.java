import java.util.Scanner;   //��ʾ�� java.util �������� Scanner������
public class Input{
	public static void main(String[] agrs){
		// Scanner�࣬��ʾ���ı�ɨ��������java.util��
		// ����Scanner����new ��ʾ����һ������
		//  myScanner���� Scanner��Ķ���
		Scanner myScanner = new Scanner(System.in);  //System.in ��ʾ��������
	                     // �µ�Scanner�ࣨ���ռ������룩
	    System.out.println("����������");
	    String name = myScanner.next();      //����һ��name�ַ������ڽ��գ� .next��ʾɨ���ַ���
	    System.out.println("����");
	    int age = myScanner.nextInt();
	    System.out.println("�ɼ�");
	    float cj = myScanner.nextFloat();
	    System.out.println("������" + name + "���䣺" + age
	    	 + "�ɼ���" + cj);

    }
}