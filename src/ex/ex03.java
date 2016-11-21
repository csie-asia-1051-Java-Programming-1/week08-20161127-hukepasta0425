﻿package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021031 孟京澤
 */
import java.util.*; 
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src =new Scanner (System.in);
		int n1=src.nextInt();
		int m1=src.nextInt();
		
		System.out.print("------------");
		int n2=src.nextInt();
		int m2=src.nextInt();
		int data1[][]=new int[n1][m1];
		int data2[][]=new int[n2][m2];
		int data3[][]=new int[n1][m2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				data1[i][j]=src.nextInt();
			}
		}
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				data2[i][j]=src.nextInt();
			}
		}
		
	}

}


