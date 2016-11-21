package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021031 孟京澤
 */
import java.util.*; 
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src =new Scanner (System.in);
//輸入數
		int cal=src.nextInt();
//近位數
		int f=src.nextInt();
		f=f/10;
		int n=0;
		while(cal>0)
		{
			
			n=n+(cal%10)*f;
			cal=cal/10;
			f=f*f;
		}
		
//改成幾近位
		int k=src.nextInt();
			fun1(n,k);
	}
	public static void fun1(int m,int k){
		int sum=0,a=1,sum2=0;
		while(m>=1)
		{
			sum=m%k;
			m=m/k;
			sum2=sum2+sum*a;
			a=a*10;
			
		}
		System.out.print(sum2);
	}

}
