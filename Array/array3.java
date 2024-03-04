package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("nhap so luong phan tu");
		n=s.nextInt();
		ArrayList<Integer> list = new ArrayList<>(n);
		for (int i =0; i<n;i++)
		{
			System.out.println("nhap phan tu thu "+(i+1)+": ");
			
			int a=s.nextInt();
			list.add(a);
		}
		System.out.println(list);
//		tao mot list moi binh phuong cac pt cua list cu
		ArrayList<Integer> bp = new ArrayList<>(n);
		for (int x : list) {
		bp.add(x*x);
		}
		System.out.println("cac phan tu sau khi binh phuong la"+bp);
		
		int c=0;
		for (int x: bp)
		{if (x>50)
			c++;
		}
		System.out.println("cac phan tu lon hon 50 la "+c);

	}

}
