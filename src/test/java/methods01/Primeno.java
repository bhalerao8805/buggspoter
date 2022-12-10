package methods01;

import java.util.Scanner;

public class Primeno {
	public static void priime() {
		Scanner p = new Scanner(System.in);
		
		System.out.println("Enter number::");
		int no = p.nextInt();
		int a= 0;
		for(int i =2 ; i<=no-1;i++) {
			if(no%i==0) {
				a=a+1;
				
			}
		}
		if (a==0) {
			System.out.println("this is prime number");
		
		}
		else {
			System.out.println("this is not prime no");
		}
	}
	public static void main(String[] args) {
		Primeno.priime();
	}

}
