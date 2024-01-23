/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int fib(int n,int dp[])
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)return 1;
        else if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] dp=new int[n+1];
	    for(int i=0;i<=n;i++)
	    {
	        dp[i]=-1;
	    }
	    int r=fib(n,dp);
	    System.out.println(r);
	    
	}
}
