package BaiTapJava;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	int k;
	System.out.println("nhap mot so nho hon 100 ");
	k = s.nextInt();
	while (k>100) {
		System.out.println("nhập lại đê");
	k = s.nextInt();
	
	}
	System.out.println(tong(k));
	}
	public static boolean snt(int n) {
		if (n<2) return false;
		
		for (int i =2; i<= Math.sqrt(n);i++)
		
			if (n % i ==0)
				return false;
			return true;
	}
	public static int tong(int b)
	{
		int i;
		int s=0;
		for (i=2; i<b; i++)
			if (snt(i)==true)
				s=s+i;
		return s;
	}
}
	