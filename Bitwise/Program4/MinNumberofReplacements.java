package Bitwise;

import java.util.Scanner;

public class MinNumberofReplacements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		int input1=input;
		int countminus=0;
		int countplus=0;
		/*If we consider n=n-1 if n is odd*/
		while(input!=1)
		{
		if(input%2==0)
		{
				input=input>>1;
				countminus++;
		}
		else
		{
			input-=1;
			countminus++;
		}
		}
		/*If we consider n=n+1 if n is odd*/
		while(input1!=1)
		{
		if(input1%2==0)
		{
				input1=input1>>1;
				countplus++;
		}
		else
		{
			input1+=1;
			countplus++;
		}
		
	}
		System.out.println(Math.min(countplus, countminus));
}
}
