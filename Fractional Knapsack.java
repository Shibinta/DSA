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
	    int t,j;
	    int t1,wt,x=0;
	    wt=sc.nextInt();
	    
	    int[] price=new int[n];
	    int[] quantity=new int[n];
	    int[] avg=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        price[i]=sc.nextInt();
	    }
	    for(j=0;j<n;j++)
	    {
	        quantity[j]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        avg[i]=price[i]/quantity[i];
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(j=i;j<n;j++)
	        {
	            if(avg[i]<avg[j])
	            {
	                t1=avg[i];
	                avg[i]=avg[j];
	                avg[j]=t1;
	                
	                t=quantity[i];
	                quantity[i]=quantity[j];
	                quantity[j]=t;
	                
	                t=price[i];
	                price[i]=price[j];
	                price[j]=t;
	            }
	            
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(wt>=avg[i])
	        {
	            wt=wt-avg[i];
	            x=x+(avg[i]*quantity[i]);
	        }
	        else if(wt<avg[i]){
	            x+=wt*(quantity[i]);
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(quantity[i]);
	    }
	    
		System.out.println(x);
	}
}
