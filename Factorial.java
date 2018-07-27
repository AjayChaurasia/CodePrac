package basic;

import java.util.Scanner;

class Factorial {
public static void main(String[] args) {
	System.out.println("Enter the number whose you want to find factorial:");
	Scanner scan = new Scanner(System.in);
	int num=scan.nextInt();
	int temp=num;
	while(num > 1){
	temp*=num-1;
	num--;
	}
	System.out.println(temp);
}
}
