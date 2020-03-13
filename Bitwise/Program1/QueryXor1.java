package Bitwise;
/*In this program i am storing the result of each query*/
import java.util.Arrays;
import java.util.Scanner;

public class QueryXor1 {
    int calculate(int[] a,int[][] store,int l,int r)
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
	
	QueryXor1 run=new QueryXor1();
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
       result[i]=run.calculate(a,store,l,r);
   }
   System.out.println();
   System.out.println("Result is:");
   for(int i=0;i<q;i++)
   System.out.print(result[i]+" ");

}
}
