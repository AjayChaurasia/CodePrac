import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the first number:");
	int first=scan.nextInt();
	System.out.println("Enter the last number:");
	int last=scan.nextInt();
	System.out.println("===========");
	first=first+1;
	
	while(first<last){
		boolean vaild=false;
	for(int joke=2;joke<=first/2;joke++){
		if(first%joke==0){
			vaild=true;
			break;
			}
		}
	if(!vaild){
	System.out.println(first+" is prime");
	System.out.println("===========");
	}
	first++;
	}
}
}
