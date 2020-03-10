package Bitwise;
/*In this program i am storing the result of each query*/
import java.util.Arrays;
import java.util.Scanner;

public class QueryXor1 {

	public static void main(String[] args) {       // this code wont work. And use functions instead of writing the whole code in main function.
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the size of the Array");
	    int n=scanner.nextInt();
	    int[] a=new int[n];
	    int[][] mat=new int[n][n];  // change variable name to a more appropriate one
	    for (int[] row : mat) 
            Arrays.fill(row,0);         // use identation and curly braces
	    for(int i=0;i<n;i++)
	    {
	        a[i]=scanner.nextInt();
	    }
	    System.out.println("Enter the number of quries");
	    int q=scanner.nextInt();
	    int[] result=new int[q]; 	// this shud be an array of arrays. Read the question again.
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
	        	result[i]=mat[l][r];	//not computing anything if mat[l][r] == 0
	    }
	    System.out.println();
	    System.out.println("Result is:");
	    for(int i=0;i<q;i++)
	    System.out.print(result[i]+" ");

	}

}
================================================================================================================================================
Modified Code
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int calculate(int[] a,int[][] store,int l,int r)
    {
        int ans=0,k;
         if(store[l][r]==0)
       {
	       for(k=r;k>=l;k--)
	       {
		if(store[l][k]!=0)
		{
			break;
		}
		else
			ans=ans^a[k];
	       }
	       if(k>=0)
	       	ans^=store[l][k];
	       store[l][r]=ans;
	       return ans;
       }
       else
       		return store[l][r];
    }

public static void main(String[] args) {      
	
Scanner scanner=new Scanner(System.in);
   System.out.println("Enter the size of the Array");
   int n=scanner.nextInt();
   int[] a=new int[n];
   int[][] store=new int[n][n];  
   for (int[] row : store)
   {
            Arrays.fill(row,0);  
        }
   for(int i=0;i<n;i++)
   {
       a[i]=scanner.nextInt();
   }
   System.out.println("Enter the number of quries");
   int q=scanner.nextInt();
   int[][] query=new int[q][2];
   int[] result=new int[q];
   for(int i=0;i<q;i++)
   {
       query[i][0]=scanner.nextInt();
       query[i][1]=scanner.nextInt();
   }
   for(int i=0;i<q;i++)
   {
    int k,flag=0;
       result[i]=0;//a^0=a i.e.,any value XOR’d with zero is left unchanged
       int l=query[i][0];
       int r=query[i][1];
       result[i]=calculate(a,store,l,r);
   }
   System.out.println();
   System.out.println("Result is:");
   for(int i=0;i<q;i++)
   System.out.print(result[i]+" ");

}
}
