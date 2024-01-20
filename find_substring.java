/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*Akhil created a whatsapp group decided to say hello to everybody. Akhil typed the word s. It is considered that Akhil managed 
to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, 
if Akhil types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered 
that Akhil got misunderstood and he didn't manage to say hello. Determine whether Akhil managed to say hello by the given word s.
Input Format
The first and only line contains the word s, which akhil typed. This word consisits of small Latin letters, its length 
is no less that 1 and no more than 100 letters.
Output Format
If Akhil managed to say hello, print "YES", otherwise print "NO".
Constraints
0<k<=30
0<N<=30
0<=a[i]<=500
**Sample Input **
ahhellllloou
Sample Output
yes*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    char[] ar=new char[]{'h','e','l','l','o'};
	    int j=0;
	    int n=s.length();
	    for(int i=0;i<n;i++)
	    {
	        char ch=s.charAt(i);
	        if(j<5)
	        {
	            if(ch==ar[j])
    	        {
    	            j++;
    	        }
	        }
	    }
	    if(j==5)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
