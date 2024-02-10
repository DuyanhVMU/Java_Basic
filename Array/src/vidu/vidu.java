package vidu;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n=sc.nextInt();
		int[] a=new int[n];	
		 for(int i=0;i<n;i++){
			 	System.out.print("Phan tu thu "+(i+1)+": ");	
	            a[i]=sc.nextInt();
	        }
			for(int i=0;i<n;i++) {
				System.out.print("Phan tu thu "+(i+1)+": ");
	            System.out.print(a[i]+" \n");
	        }
	}
}
