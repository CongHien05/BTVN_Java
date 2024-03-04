package BaiTapJava;

import java.util.Scanner;


public class Bai4 {
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("nhap n ");
		n = s.nextInt();
		if (n<0) System.out.println("khong hop le");
		else
		{	
			String i= "";
			while (n>0)
			{

				i = (n%2) + i;
				n/=2;
				
			}
		System.out.println(i);
			}
	}	
	}
