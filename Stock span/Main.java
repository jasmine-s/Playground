#include<iostream>
using namespace std;
int main()
{
int n,x=1,y=0,i=0;
cin>>n;
int a[n];
for(i=0;i<n;i++)
  cin>>a[i];
cout<<x;
for(i=1;i<n;i++){
  if(a[i]<a[i-1]) cout<<"\n"<<x;
  else{
    y+=2;
    cout<<"\n"<<y;
  }
}
}