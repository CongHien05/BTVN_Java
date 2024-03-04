import java.util.Scanner;
	import java.util.Arrays;
public class btarray {
	
	
	
	    public static void main(String[] args) {
	    	int a=0,b=0;
	    	Scanner s= new Scanner(System.in);
	    	int mang [][]=new int[a][b]; 
	    	int n=1;
	    	while ( n !=0) {
	        
	        System.out.println("Moi ban chon ");
	        System.out.println("1.Nhap gia tri cua mang");
	        System.out.println("2.Xuat gia tri cua mang");
	        System.out.println("3.Gia tri min/max cua mang");
	        System.out.println("4.Tong cheo chinh");
	        System.out.println("5.Tong cheo phu");
	        System.out.println("0.Thoat");
	      n=s.nextInt();
	        switch(n) {
	        case 1:{int nhap;
	        do {
	        	
	        	System.out.println("nhap so dong");
	        	a=s.nextInt();
	        	 System.out.println("nhap so cot");
	        	 b=s.nextInt();
	        	 mang = new int [a][b];
	        	 for (int i = 0; i <a; i++) {
	        		 for (int j = 0; j < b; j++) {
	        			 System.out.println("nhap phan tu tai vi tri "+"["+(i+1)+"]"+"["+(j+1)+"]");
	        			int h=s.nextInt();
	        				mang[i][j]=h;
					}
				
				}
	        	 System.out.println("nhap phan tu vao mang thanh cong ");
	        	 System.out.println("nhap mang hoan tat");
	     		System.out.println("ban co muon nhap lai mang khong"+"  (1.YES    2.NO)");
	     		nhap =s.nextInt(); 
	        }while (nhap ==1);
	     	System.out.println("tiep tuc nao");
	     	break;
	     	}
	        case 2:
	        {int nhap;
	        	System.out.println("gia tri cua mang la: ");
	        	for (int i = 0; i <a; i++) {
	        		 for (int j = 0; j < b; j++) {
	        			 System.out.print(mang[i][j]+" ");
	        		 }
	        		 System.out.println(" ");
	        	}
	        	System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
	    		nhap=s.nextInt();
	    		while(nhap==2);
	    		System.out.println("ok tiep tuc nao");
	    		break;
	        		 }
	        case 3:{
	        	int nhap;
	        	int min=mang[0][0];
	        	int max=mang[0][0];
	        	for (int i = 0; i < a; i++) {
	        		for (int j = 0; j < b; j++) {
	        			if (min>mang[i][j])
	        				min=mang[i][j];
	        			else max=mang[i][j];
						
					}
					
				}
	        	System.out.println("gia tri lon nhat trong mang la: "+max);
	        	System.out.println("gia tri nho nhat trong mang la: "+min);
	        	System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
	    		nhap=s.nextInt();
	    		while(nhap==2);
	    		System.out.println("ok tiep tuc nao");
	    		break;
	        }
	        case 4:{int nhap,tong=0;
	        	for (int i = 0; i < a; i++) {
	        		for (int j = 0; j < b; j++) {
	        			if (i==j)
	        				tong+=mang[i][j];
						
					}
					
				}
	        	System.out.println("tong cheo chinh la: "+tong);
	        	System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
	    		nhap=s.nextInt();
	    		while(nhap==2);
	    		System.out.println("ok tiep tuc nao");
	    		break;
	        }
	        case 5:{
	        	int nhap,tong=0;
	        	for (int i = 0; i < a; i++) {
	        		for (int j = 0; j < b; j++) {
	        			if (i+j== (b-1))
	        				tong+=mang[i][j];
						
					}
					
				}
	        	System.out.println("tong cheo phu la: "+tong);
	        	System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
	    		nhap=s.nextInt();
	    		while(nhap==2);
	    		System.out.println("ok tiep tuc nao");
	    		break;
	        }
	        case 0:{
	        	System.out.println("ok chung ta dung lai tai day.");
	        	break;
	        }
	        default:{
	        	System.out.println("moi ban nhap lai");
	        }
	       
	        }
	        	 
	        }
	    }
	    }
	
