package BaiTapJava;
import java.util.Scanner;
public class BTTongHop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner s= new Scanner(System.in);
do {
	System.out.println("Moi ban chon: ");
	System.out.println("1. Kiem Tra So Nguyen To ");
	System.out.println("2. Tong Cac So Nguyen To Cho Den N ");
	System.out.println("3. Phan Tich So Nguyen To ");
	System.out.println("4. Chuyen Doi Sang Nhi Phan");
	int n= s.nextInt();
	switch (n) {
	case 1:
	{int d;
		do {
	
		int k;
		System.out.println("nhap mot so bat ki");
		k=s.nextInt();
		if (k<=1)
			System.out.println(k+ "khong phai so nguyen to");
		else {
			int h=0;
			for (int i=1; i<=k; i++)
			{
				if (k%i ==0)
					h++;
				
			}
			if (h==2)
				System.out.println(k+" la so nguyen to");
			else System.out.println(k+" khong phai la so nguyen to");
		}
System.out.println("ban co muon tiep tuc khong\n");
System.out.println("1. YES"+ "  2. NO");
d= s.nextInt();
	}
		while(d==1);
		System.out.println("ok");
	}
	break;
	case 2:{
		int d;
		do {
	
		int k,i,sum=0;
		System.out.println("nhap mot so bat ki");
		k=s.nextInt();
		if (k<=0)
			System.out.println("khong hop le");
		else {
			
			boolean snt ;
			for ( i=2; i<=k; i++) {
				snt =true;
			
			for(int j=2; j<i;j++) {
				if (i%j==0)
					snt = false;
			}
				
				if (snt) 
				sum+=i;
					
			}
				
		}
		System.out.println("tong cac so nguyen to tu 1 den "+k+" la :");
		System.out.println(sum);
		System.out.println("ban co muon tiep tuc khong");
		System.out.println("1. YES"+ "  2. NO");
		d= s.nextInt();
	}
		while(d==1);
		System.out.println("ok");
		
		
}
	break;
	case 3:
	{
		int d;
		do {
			int k,i;
			System.out.println("nhap mot so bat ki");
			k=s.nextInt();
			if (k<=1)
				System.out.println("khong hop le");
			else
			{
				System.out.println("thua so nguyen to cua "+k+" la :");
			boolean snt =true;
			for (i=2;i<=k;i++) 
				while(k%i==0) {
				if (snt == false)
					System.out.print(" x ");
				k/=i;
				System.out.print(i);
				snt = false;
				}
			
			
			}
			System.out.println("\nban co muon tiep tuc khong");
			System.out.println("1. YES"+ "  2. NO");
			d= s.nextInt();
		}
		while(d==1);
		System.out.println("ok");
		}
	break;
	case 4:
	{
	int d;
	do {
		int k;
		System.out.println("nhap mot so bat ki");
		k=s.nextInt();
		int p=k;
		if (k<=0) System.out.println("khong hop le");
		else {
			String h="";
			while (k>0) {
				h=k%2+h;
		     k=k/2;
		}
		System.out.println(p+" sau khi chuyen doi sang nhi phan la :");
		System.out.println(h);
		}
		System.out.println("\nban co muon tiep tuc khong");
		System.out.println("1. YES"+ "  2. NO");
		d= s.nextInt();
	}
	while (d==1);
		System.out.println("ok");
	}
	break;
	}
	
System.out.println("ban co muon chon chu de khac khong");
System.out.println("1. YES"+"  2. NO");
a= s.nextInt();
}
while(a==1);
System.out.println("ok, tam biet ban nhe");
	}
}
