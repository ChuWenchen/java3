import java.util.Scanner;   //表示把 java.util 这个包里的 Scanner类引入
public class Input{
	public static void main(String[] agrs){
		// Scanner类，表示简单文本扫描器，在java.util包
		// 创建Scanner对象，new 表示创建一个对象
		//  myScanner就是 Scanner类的对象
		Scanner myScanner = new Scanner(System.in);  //System.in 表示键盘输入
	                     // 新的Scanner类（接收键盘输入）
	    System.out.println("请输入姓名");
	    String name = myScanner.next();      //创建一个name字符串用于接收， .next表示扫描字符串
	    System.out.println("年龄");
	    int age = myScanner.nextInt();
	    System.out.println("成绩");
	    float cj = myScanner.nextFloat();
	    System.out.println("姓名：" + name + "年龄：" + age
	    	 + "成绩：" + cj);

    }
}