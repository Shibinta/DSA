/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include<string.h>
#include<stdbool.h>
int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    bool b[26]={false};
    int ind=0;
    int n=strlen(str);
    for(int i=0;i<n;i++)
    {
        if('A'<=str[i] && 'Z'>=str[i])
        {
            ind=str[i]-'A';
        }
        if('a'<=str[i] && 'z'>=str[i])
        {
            ind=str[i]-'a';
        }
        b[ind]=true;
    }
    int flag=0;
    for(int i=0;i<26;i++)
    {
        if(b[i]!=true) flag=1;
    }
    if(flag==0)
    printf("Pangram");
    else
    printf("Not a pangram");
    return 0;
}
