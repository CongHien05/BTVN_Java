package Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("nhap so luong phan tu toi da cua list");
		n=s.nextInt();
ArrayList<Integer> list= new ArrayList<>(n);
Random rd= new Random();
for (int i=0; i<n;i++){
	int ngaunhien = rd.nextInt(100);
	list.add(ngaunhien);
	
	
}
System.out.println(list);


	
	}

}
