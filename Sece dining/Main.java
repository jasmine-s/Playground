#include<iostream>
#include <cstring>
using namespace std;
int main()
{
//Type your code here.
char str[10];
int r;
cin>>str>>r;
if(strcmp(str,"front")==0)
{
if (r==1)
cout<<"Left Handed";
else
cout<<"Right Handed";
}
else
{
 if(r==1)
cout<<"Right Handed";
else
cout<<"Left Handed";
}
}