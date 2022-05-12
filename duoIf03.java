import java.util.Scanner;
public class duoIf03{
	public static void main(String[] agrs){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("信用分");
		int fen = myScanner.nextInt();
		if(fen == 100){
			System.out.println("信用极好");
		}else if(fen >= 80 && fen <= 99){
			System.out.println("信用优秀");
		}else if(fen >= 60 && fen <= 80){
			System.out.println("信用一般");
		}else{
			System.out.println("信用不及格");
		}
	}
}