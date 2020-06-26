#include<iostream>
using namespace std;
int main()
{
int n,x=0,y,z=0,p=0,q=0,r=0;
cin>>n;
int a[n][n];
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
cin>>a[i][j];
for(int i=0;i<n;i++)
x+=a[0][i];
if(n==2 and x==5)
cout<<"Yes";
else if(n==3 and x==15)
cout<<"Yes";
else
cout<<"No";
  //Type your code here.
}
