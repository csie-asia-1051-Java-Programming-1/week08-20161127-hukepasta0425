package ex;

import java.util.*;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021031 孟京澤
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("請輸入功能： ");
		int n = src.nextInt();
		System.out.println("輸入計算數字: ");

		int sum = 0;
		double sum2 = 0;
		switch (n) {
		case 1:
			System.out.print("加法：");
			int a = src.nextInt();
			int b = src.nextInt();
			sum = a + b;
			break;
		case 2:
			System.out.print("減法：");
			int c = src.nextInt();
			int d = src.nextInt();
			sum = c - d;
			break;
		case 3:
			System.out.print("乘法：");
			int e = src.nextInt();
			int f = src.nextInt();
			sum = e * f;
			break;
		case 4:
			System.out.print("除法：");
			int g = src.nextInt();
			int h = src.nextInt();
			sum = g / h;
			break;
		case 5:
			System.out.print("平方：");
			int i = src.nextInt();
			sum = i * i;

			break;
		case 6:
			System.out.print("立方：");
			int j = src.nextInt();
			sum = j * j * j;
			break;
		case 7:
			System.out.print("開根：");
			double k = src.nextInt();

			sum2 = Math.pow(k, 0.5);
			break;

		}
		if (n <= 6) {
			System.out.print(sum);
		} else {
			System.out.print(sum2);
		}
	}

}
