package BaiTapJava;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		int n;
		int b;
		Scanner s = new Scanner(System.in);
		System.out.println("nhap n");
		n= s.nextInt();
		
		if (n<2)
			System.out.println("khong phai so nguyen to");
		else {
			int a=0;
			for (int i =1 ; i<=n;i++)
				
				 if (n % i ==0)
					 a++;
			if (a==2)System.out.println("la so nguyen to");
					
				else System.out.println("khong phai so nguyen to");
		}	System.out.println("ban co muon tiep tuc khong");
		System.out.println("1. YES    0. NO");
		b = s.nextInt();
		
		while (b >=1) {	
			System.out.println("ban co muon tiep tuc khong");
		System.out.println("1. YES    0. NO");
		b = s.nextInt();
			switch(b) {
			case 0:
				System.out.println("OK, dung lai tai day");
			break;
			case 1:
				System.out.println("nhap n");
				n= s.nextInt();
				if (n<2)
					System.out.println("khong phai so nguyen to");
				else {
					int a=0;
					for (int i =1 ; i<=n;i++)
						
						 if (n % i ==0)
							 a++;
					if (a==2)System.out.println("la so nguyen to");
							
						else System.out.println("khong phai so nguyen to");
					break;
				}
				
			}
	}
			
			
	}}


