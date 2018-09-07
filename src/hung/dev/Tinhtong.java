package hung.dev;

import java.util.Scanner;

public class Tinhtong {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.printf("Nhap so nguyen duong n = ");
		int n = scanner.nextInt();
		int tong = 0;
		for (int i=1; i<= n; i++) {
			tong = tong + i;
		}
		System.out.printf("Tong la : " + tong);
	}
}