package Bitwise;

import java.util.Scanner;

public class MinNumberofReplacements {

	public static void main(String[] args) {                  // Code will give wrong ans for larger inputs
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		int input1=input;
		int countminus=0;		//Use camelCase
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
		/*If we consider n=n+1 if n is odd*/	// Try to do this for every iteration in else at line 21.
							//there can be a combination of n+1 and n-1 to get the minimum replacements count
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
