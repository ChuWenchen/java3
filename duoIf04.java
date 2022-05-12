import java.util.Scanner;
public class duoIf04{
	public static void main(String[] agrs){
		Scanner myScanner01 = new Scanner(System.in);
		Scanner myScanner02 = new Scanner(System.in);
		System.out.println("请输入信息");
		double cj = myScanner01.nextDouble();
		char gender = myScanner02.next().charAt(0);  
		                // scanner.next() 是接收一个字符串
		                // charAt(0),表示拿走字符串中的第一个字符
		if(cj >= 8.0){
			if(gender == '男'){
				System.out.println("晋级男子组");
			}else{
				System.out.println("晋级女子组");
			}
		}else{
			System.out.println("淘汰");
		}

	}
}