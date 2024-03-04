package Array2chieu;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("nhap vao so dong ");
int a = s.nextInt();
System.out.println("nhap vao so cot ");
int b= s.nextInt();
int [][] mang= new int [a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println("nhap vao phan tu tai vi tri " +"["+i+"]"+" ["+j+"]");
				int n=s.nextInt();
				mang[i][j]=n;
			}
			
			}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(mang[i][j]+" ");
			}
			System.out.println(" ");
		}int tongc=0,tongp=0;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
	            if (i==j) {
	            	tongc+=mang[i][j];
	            }
	            if(i==(j-1)) {
	            	tongp+=mang[i][j];
	            }
		
			}
		
			}
				System.out.println("tong cheo chinh trong mang la: "+tongc);
			System.out.println("tong cheo phu trong mang la: "+tongp);
		

	}

}

