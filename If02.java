import java.util.Scanner;
public class If02{
	public static void main(String[] agrs){
		Scanner myScanner = new Scanner(System.in);
	    System.out.println("����");
	    int age = myScanner.nextInt();
	    if(age >= 18){
	    	System.out.println("����");
	    }
	    else{
	    	System.out.println("δ����");
	    }
	}
}