package Bitwise;
/*In this program i am storing the result of each query(DynamicProgramming)*/
import java.util.Arrays;
import java.util.Scanner;

public class QueryXor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the size of the Array");
	    int n=scanner.nextInt();
	    int[] a=new int[n];
	    int[][] mat=new int[n][n];
	    for (int[] row : mat) 
            Arrays.fill(row,0); 
	    for(int i=0;i<n;i++)
	    {
	        a[i]=scanner.nextInt();
	    }
	    System.out.println("Enter the number of quries");
	    int q=scanner.nextInt();
	    int[] result=new int[q];
	    for(int i=0;i<q;i++)
	    {
	    	int k,flag=0;
	        result[i]=0;//a^0=a i.e.,any value XOR’d with zero is left unchanged
	        int l=scanner.nextInt();
	        int r=scanner.nextInt();
	        if(mat[l][r]==0)
	        {
	        for(k=r-1;k>0;k--)
	        {
	        	if(mat[l][k]!=0)
	        	{
	        		flag=1;
	        		break;
	        	}
	        	else
	        		continue;
	        }
	        result[i]=mat[l][k];
	        if(flag!=1)
	        	k=l-1;
	        for(int j=k+1;j<=r;j++)
	        {
	            result[i]=result[i]^a[j];
	        }
	        mat[l][r]=result[i];
	        }
	        else
	        	result[i]=mat[l][r];
	    }
	    System.out.println();
	    System.out.println("Result is:");
	    for(int i=0;i<q;i++)
	    System.out.print(result[i]+" ");

	}

}
