package hw;
import java.util.*;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021031 孟京澤
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		fun1(n);
}
public static void fun1(int m){
//	m%2*1+((m/2)%2)*10+((m/2*2)%2)*100+((m/2*2*2)%2)*1000
	int sum=0,a=1,sum2=0;
	while(m>=1)
	{
		sum=m%2;
		m=m/2;
		sum2=sum2+sum*a;
		a=a*10;
	}
	System.out.print(sum2);
	}

}


