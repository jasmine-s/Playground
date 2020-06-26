#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main ()
{
char str1[50], str2[50];
gets(str1);
gets(str2);
if(strcmp(str1, str2)==0)
cout << "It is correct";
else
cout << "It is wrong";
return 0;
}
