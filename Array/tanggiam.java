package Array;
import java.util.Arrays;
import java.util.Scanner;
public class tanggiam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,i,h,j;
			Scanner s= new Scanner(System.in);
			System.out.println("nhap phan tu toi da cua mang");
			 n=s.nextInt();
			int []mang= new int [n];
			

			for (i=0; i<mang.length;i++)
			{
				System.out.println("nhap phan tu thu "+i+": ");
				mang[i]=s.nextInt();
			}System.out.println("cac phan tu trong mang la");
			for (i=0; i<mang.length;i++)
			{
			System.out.print(mang[i]+" ");	
			}
			for(i=0, j = mang.length-1;i<j;i++,j--) {
				int empt;
				empt = mang[i];
				mang[i]=mang[j];
				mang[j]=empt;
			}
	System.out.println("\nmang sau khi dao nguoc la ");
	System.out.println(Arrays.toString(mang));
	
		Arrays.sort(mang);
		System.out.println("mang sau khi sap xep la");
		System.out.println(Arrays.toString(mang));
		int tong =0;
		for (i=0; i<mang.length;i++) {
		tong+=mang[i];	
		}
		System.out.println("tong cac phan tu trong mang la "+tong);
		System.out.println("moi nhap mot so bat ki");
		int so= s.nextInt();
		boolean kt=false;
		String vt= "";
		for (i=0; i<n;i++)
		{
			if (mang[i]==so)
			{
			kt=true;	
			vt+=(i+"");
			
			}
			
		}
		if (kt==true) {
				System.out.println(so+" la mot so trong mang va o vi tri "+vt);
			}
			else System.err.println(so+" khong nam trong mang");
	
}

}



