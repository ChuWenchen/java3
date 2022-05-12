import java.util.Scanner;
public class If02{
	public static void main(String[] agrs){
		Scanner myScanner = new Scanner(System.in);
	    System.out.println("年龄");
	    int age = myScanner.nextInt();
	    if(age >= 18){
	    	System.out.println("成年");
	    }
	    else{
	    	System.out.println("未成年");
	    }
	}
}