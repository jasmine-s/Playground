#include<iostream>
using namespace std;
int main()
{
  int a,n,i,k=1;
  cout<<"Enter the value of a"<<"\n";
  cin>>a;
  cout<<"Enter the value of n"<<"\n";
  cin>>n;
  for(i=1;i<=n;i++)
    k*=a;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<k;
  //Type your code here.
}