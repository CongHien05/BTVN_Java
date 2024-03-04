package BaiTapJava;
import java.util.Scanner;
public class BaiTapTongHop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		do {
System.out.println("Moi ban chon: ");
System.out.println("1. Kiem Tra So Nguyen To ");
System.out.println("2. Tong Cac So Nguyen To Cho Den N ");
System.out.println("3. Phan Tich So Nguyen To ");
System.out.println("4. Chuyen Doi Sang Nhi Phan");
int Chon = sc.nextInt();
switch  (Chon) {
case 1:
{
int k, cout = 0;
do {
System.out.println("nhap so nguyen n");
int n = sc.nextInt();
int can = (int) Math.sqrt(n);
for (int i = 2; i <= can; i++) {
	if (n%i == 0) { 
		cout += 1;
	if (cout == 0 ) {
		System.out.println(n + " la so nguyen to");
	} else {
		System.out.println(n + " khong la so nguyen to");
	}
	}
}
System.out.println("Ban co muon tiep tuc\n" + "1. Yes	" + "2. No");
k = sc.nextInt();
	} while (k == 1);
break;
}
case 2: {  
	int k;
do {
	System.out.println("Nhap So N ");
	int n = sc.nextInt();
	int cout = 0;
	int sum = 0;
for (int i = 2; i < n; i++) {
	for (int j = 2; j < i; j++) {
		if (i % j == 0) {
		cout += 1;
		}
	}
	if (cout == 0) {
		sum += i;
	}
	cout = 0;
}
System.out.println("tong cac so nguyen to be hon" + n + "= " + sum);
System.out.println("Ban co muon tiep tuc\n" + "1. Yes	" + "2. No");
 k = sc.nextInt();
} while (k == 1);
break;
}
case 3: {
	int k = 0;
	do {
		System.out.println("Nhap so nguyen n");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println(n +" = "+ n);
		}
		else {
			int i = 2;
			do {
				if (n % i == 0) {
					System.out.print(i + " x");
					n /= i;
				} else {
					i++;
				}
			} while (n != 1);
		System.out.println("\n");
		}
		System.out.println("Ban co muon tiep tuc\n" + "1. Yes	" + "2. No");
		k = sc.nextInt();
	} while (k == 1);
	System.out.print("Ket thuc chuong trinh");
	break;
}
case 4: {
	int k;
	do {
	System.out.println("Moi Nhap So n ");
	int n = sc.nextInt();
	String nhiPhan = "";
	do {
		nhiPhan = (n%2) + nhiPhan ;
		n /= 2;
	}while (n > 0);
	System.out.println("So nhi phan la: " + nhiPhan);
	System.out.println("Ban co muon tiep tuc\n" + "1. Yes	" + "2. No");
	k = sc.nextInt();
} while (k == 1);
	break;
	}
	default:
	{
		System.out.println("Lua Chon nay khong hop le");
	}
		}
System.out.println("Ban co muon chon cai khac\n" + "1. Yes	" + "2. No");
h = sc.nextInt();
	} while (h == 1);
		System.out.println("Chuong Trinh Ket Thuc");
}
	}
