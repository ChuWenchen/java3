public class duoIf01{
	public static void main(String[] agrs){
		int a = 10;
		int b = 5;
		if((a + b)%3 == 0){
			if((a + b)%5 == 0){
				System.out.println("能被3和5整除");
			}
		}
	}
}