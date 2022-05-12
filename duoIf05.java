import java.util.Scanner;
public class duoIf05{
	public static void main(String[] agrs){
		Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入出行月份");
		int moth = myScanner.nextInt();
		Scanner yScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = yScanner.nextInt();

		if(moth >= 4 && moth <= 10){
			if(age >= 18 && age <=60){
				System.out.println("成人票60");
			}else if(age <= 18){
				System.out.println("儿童票半价30");
			}else{
				System.out.println("老人票20");
			}

		}else{
			if(age >= 18 && age <= 60){
				System.out.println("成人票40");
			}else{
				System.out.println("20");
			}
		}
	}
}