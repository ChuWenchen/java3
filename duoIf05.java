import java.util.Scanner;
public class duoIf05{
	public static void main(String[] agrs){
		Scanner myScanner = new Scanner(System.in);
        System.out.println("����������·�");
		int moth = myScanner.nextInt();
		Scanner yScanner = new Scanner(System.in);
		System.out.println("����������");
		int age = yScanner.nextInt();

		if(moth >= 4 && moth <= 10){
			if(age >= 18 && age <=60){
				System.out.println("����Ʊ60");
			}else if(age <= 18){
				System.out.println("��ͯƱ���30");
			}else{
				System.out.println("����Ʊ20");
			}

		}else{
			if(age >= 18 && age <= 60){
				System.out.println("����Ʊ40");
			}else{
				System.out.println("20");
			}
		}
	}
}