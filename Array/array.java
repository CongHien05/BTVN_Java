package Array;
import java.util.Arrays;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number1 ;
		
		number1= new int [5];
		
		int i;
		
  Scanner s= new Scanner(System.in);
  
   for( i =0; i< number1.length;i++) {
	 System.out.print("nhap phan tu cua mang :");
      number1[i]= s.nextInt();
     }
   
   
   System.out.println("cac phan tu trong mang la: ");
   
   System.out.println(Arrays.toString(number1));
   
      double trungbinh=0;
      int tong=0;
      for ( i = 0; i < number1.length; i++) {
    	  tong+=number1[i];		
	}
      System.out.println("tong cac phan tu trong mang la : "+tong);
      trungbinh= (double)tong/number1.length;
      System.out.println("trung binh cac gia tri trong mang se la "+trungbinh);
}
}
