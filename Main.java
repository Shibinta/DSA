/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*Ben loves ciphers. He has invented his own cipher called recreate. Recreate cipher is used for strings. To encrypt the 
string s=s1s2…sm (1≤m≤10), Polycarp uses the following algorithm:

he writes down s1 ones,

he writes down s2 twice,

he writes down s3 three times, ...

he writes down sm m times.

For example, if s="bab" the process is: "b" → "baa" → "baabbb". So the encrypted s="bab" is "baabbb".*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    int l=s.length();
	    String res="";
	    for(int i=0;i<l;i++)
	    {
	        res=res+s.charAt(i);
	        i=i+i;
	    }
		System.out.println(res);
	}
}
