import java.util.Scanner;


public class SamePlaceReverseString {
	static String[] str2;
	public static void main(String[] args) {
		System.out.println("Enter the String You want to Reverse in Same Order:");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
	for(int i=0;i<str.length();i++)
		str2=str.split(" ");
	for(int i=0;i<str2.length;i++){
		StringBuilder sb=new StringBuilder(str2[i]);
		System.out.print(sb.reverse()+" ");
	}	
}
}
