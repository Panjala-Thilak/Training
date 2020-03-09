package Bitwise;

import java.util.Scanner;

public class QueryXor
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the size of the Array");
	    int n=scanner.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=scanner.nextInt();
	    }
	    System.out.println("Enter the number of quries");
	    int q=scanner.nextInt();
	    int[] result=new int[q];
	    for(int i=0;i<q;i++)
	    {
	        result[i]=0;
	        int l=scanner.nextInt();
	        int r=scanner.nextInt();
	        for(int j=l;j<=r;j++)
	        {
	            result[i]=result[i]^a[j];
	        }
	    }
	    System.out.println("Result is:");
	    for(int i=0;i<q;i++)
	    System.out.print(result[i]+" ");
	}
}
