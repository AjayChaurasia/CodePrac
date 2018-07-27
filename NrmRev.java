import java.util.Scanner;

class NrmRev{
public static void main(String[] args){
	System.out.println("Enter the String You want to Reverse :");
Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
for(int i=str.length()-1;i>=0;i--){
System.out.print(str.charAt(i));
}
}
}