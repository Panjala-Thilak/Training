/* 3.Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai< 231.
Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.
Input: [3, 10, 5, 25, 2, 8]
Output: 28
 */
package Bitwise;
//Worst case
import java.util.Scanner;

public class MaxResult {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] input=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			input[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					int cur=input[i]^input[j];
					max=(max<cur)?cur:max;
				}
			}
		}
		System.out.println(max);

	}

}
