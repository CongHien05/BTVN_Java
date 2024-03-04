import java.util.Arrays;
import java.util.Scanner;
//Mang 1 chieu menu.
public class MenuMang1chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=0;

int mang[]= new int [n];

while(true) {System.out.println("moi ban chon");
	System.out.println("1. Nhap gia tri cua mang");
	System.out.println("2. Xuat gia tri cua mang");
	System.out.println("3. Sap xep mang theo chieu tang dan ");
	System.out.println("4. Sap xep mang theo chieu giam dan");
	System.out.println("5. Tim gia tri max/min cua mang");
	System.out.println("6. Tong cac gia tri cua mang");
	System.out.println("7. Tong cac so nguyen to trong mang");
	System.out.println("0. Thoat");
	int choice = s.nextInt();
	switch(choice) {
	case 1:{
		int nhap;
		do{	
	System.out.println("nhap so luong phan tu trong mang");
		n= s.nextInt();
		mang = new int [n];
		for (int i = 0; i <n; i++) {
			System.out.println("nhap phan tu thu "+(i+1)+": ");
			mang[i]=s.nextInt();
		}
	
	System.out.println("nhap mang hoan tat");
		System.out.println("ban co muon nhap lai mang khong"+"  (1.YES    2.NO)");
		nhap =s.nextInt();
	}while (nhap ==1);
	System.out.println("tiep tuc nao");
	break;
	}
	
	case 2:{
		int nhap;
		do {
		System.out.println("gia tri cua mang la");
		for (int i=0; i<n; i++) {
			System.out.print(mang[i]+" ");
		}
		System.out.println(" ");
		System.out.println("ban co muon xem lai mang khong"+"  (1.YES    2.NO)");
		nhap=s.nextInt();}while(nhap==1);
		System.out.println("ok tiep tuc nao");
		
		break;
	}
	case 3:
	{int nhap;
	System.out.println("mang sau khi sap xep la: ");
	for (int i = 0; i < n ; i++) {
        for (int j = i + 1; j <n; j++) {
            if (mang[i] > mang[j]) {
                int temp = mang[i];
                mang[i] = mang[j];
                mang[j] = temp;
		
		}
        }
        System.out.println(mang[i]+" ");}
	
		System.out.println(" ");
		System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
		nhap=s.nextInt();
		while(nhap==2);
		System.out.println("ok tiep tuc nao");
		break;
	
	}
	case 4:
	{int nhap;
	System.out.println("mang sau khi sap xep la: ");
	for (int i = 0; i < n; i++) {
        for (int j = i + 1; j <n; j++) {
            if (mang[i] < mang[j]) {
                int temp = mang[i];
                mang[i] = mang[j];
                mang[j] = temp;
		}
        }System.out.print(mang[i]+" ");
        }System.out.println(" ");
		System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
		nhap=s.nextInt();
		while(nhap==2);
		System.out.println("ok tiep tuc nao");
		break;
		
	}
	case 5:{int nhap;
		int max=mang[0];
		for (int i = 0; i < n; i++) {
			if(max<mang[i])
				max= mang[i];
			
		}
		System.out.println("gia tri lon nhat cua mang la:"+max);
		int min=mang[0];
		for (int i = 0; i < n; i++) {
			if(min>mang[i])
				min= mang[i];
			
		}
		System.out.println("gia tri nho nhat cua mang la:"+min);
		System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
		nhap=s.nextInt();
		while(nhap==2);
		System.out.println("ok tiep tuc nao");
		break;
	}
	case 6:{int nhap;
		int tong=0;
		for (int i = 0; i < n; i++) {
			tong+=mang[i];
			
		}
		System.out.println("tong cac gia tri trong mang la: "+tong);
	

	System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
	nhap=s.nextInt();
	while(nhap==2);
	System.out.println("ok tiep tuc nao");
	break;}
	case 7:
	{
		int nhap;
		int tong=0;
	
		for (int i = 0; i < n; i++) {	boolean snt=true;
			if(mang[i]<2) {
				snt=false;}
				else {
			for (int j = 2; j < Math.sqrt(mang[i]); j++) {
				if(mang[i]%j==0) {snt=false;
				}
				}
			if(snt==true) tong+=mang[i];
			}
		
		}
		System.out.println("tong cac so nguyen to trong mang la: "+tong);
		System.out.println("ban co muon tiep tuc khong"+"  (1.YES    2.NO)");
		nhap=s.nextInt();
		while(nhap==2);
		System.out.println("ok tiep tuc nao");
			break;
		}
	
		
		case 0:{
		System.out.println("ok chung ta dung lai tai day");
		break;
	}
	default: {
		System.out.println("moi ban chon lai");
		break;
	
	}	
		}
		
	}
	
}
}



