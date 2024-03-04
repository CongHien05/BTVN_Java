package BaiTapJava;
import java.util.Scanner;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	 public class Bai3 {
	    private static Scanner s = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.print("Nhập số nguyên dương n = ");
	        int n = s.nextInt();
	        List<Integer> listNumbers = phanTichSoNguyen(n);
	        System.out.printf("Kết quả: %d = ", n);
	        int size = listNumbers.size();
	        for (int i = 0; i < size - 1; i++) {
	            System.out.print(listNumbers.get(i) + " x ");
	        }
	        System.out.print(listNumbers.get(size - 1));
	    }
	    public static List<Integer> phanTichSoNguyen(int n) {
	        int i = 2;
	        List<Integer> listNumbers = new ArrayList<Integer>();
	        // phân tích
	        while (n > 1) {
	            if (n % i == 0) {
	                n = n / i;
	                listNumbers.add(i);
	            } else {
	                i++;
	            }
	        }
	        // nếu listNumbers trống thì add n vào listNumbers
	        if (listNumbers.isEmpty()) {
	            listNumbers.add(n);
	        }
	        return listNumbers;
	    }
	}
 