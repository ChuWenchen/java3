public class ArithmeticOperator{
	public static void main(String[] agrs){
		
        // ȡģ��ʽ  a % b = a - a / b * b
		System.out.println(-10 % 3);    // -1
		System.out.println(10 % -3);    //  1
		System.out.println(-10 % -3);   // -1


		System.out.println("-----------------");
		int i = 1;
		i = i++;      // ������һ���м����  temp = i�� i = i + 1��i = temp
		System.out.println(i);
		int j =  1;
		j = ++j;      //   j = j + 1, temp = j, j = temp
		System.out.println(j);
	} 
} 