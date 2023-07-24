package java_first;

import java.util.Scanner;

public class program_one {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i+=2) {
			int t=c[i+1]-'0';
			while(t-- >0) {
				System.out.print(c[i]);
			}
		}
	    
	}

}
