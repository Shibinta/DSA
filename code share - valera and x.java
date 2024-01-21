/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=0,c1=0,c2=0;
	    char[][] ar=new char[n][n];
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            ar[i][j]=sc.next().charAt(0);
	        }
	    }
	    char ch=ar[0][0];
	    char chr=ar[0][1];
	    if(ch!=chr)
	    {
	        for(int i=0;i<n;i++)
    	    {
    	        for(int j=0;j<n;j++)
    	        {
    	            if(i==j || i==(n-j-1))
    	            {
    	                if(ar[i][j]!=ch)
    	                {
    	                    c=1;
    	                }
    	            }
    	            else{
    	                if(ar[i][j]!=chr)
    	                {
        	               c2=1;
    	                }
    	            }
    	        }
    	    }
    	    System.out.println(ch+" "+chr);
    		if(c==1 || c2==1)
    		System.out.println("No");
    		else
    		System.out.println("Yes");
	    }
	    else
	    System.out.println("No");
	}
}
