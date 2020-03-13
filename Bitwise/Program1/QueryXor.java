/*
 1.Given the array arr of positive integers and the array queries where queries[i] = [Li, Ri], for each query i compute the XOR of elements from Li to Ri (that is, arr[Li] xorarr[Li+1] xor ... xorarr[Ri] ). Return an array containing the result for the given queries.

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] 

 */
package Bitwise;

import java.util.Scanner;

public class QueryXor
	{

		public static void main(String[] args) {    //Code works but not of production quality
			    Scanner scanner=new Scanner(System.in);   // try to use bufferedReader
			    System.out.println("Enter the size of the Array");
			    int n=scanner.nextInt();
			    int[] a=new int[n];
			    for(int i=0;i<n;i++)
			    {
			        a[i]=scanner.nextInt();
			    }
			    System.out.println("Enter the number of quries");
			    int query=scanner.nextInt();
			    int[] result=new int[query];
			    for(int i=0;i<q;i++)
			    {
			        result[i]=0;//a^0=a i.e.,any value XOR’d with zero is left unchanged
			        int l=scanner.nextInt();
			        int r=scanner.nextInt();
			        for(int j=l;j<=r;j++)
			        {
			            result[i]=result[i]^a[j];
			        }
			    }
			    System.out.println("Result is:");
			    for(int i=0;i<q;i++)   
			    {
			   	 System.out.print(result[i]+" ");
			    }
		}

	}
