#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,rem,sum=0;
  cin>>n;
  int t=n;
  while(n!=0){
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  if(t%sum==0){
    cout<<"Harshad Number";
  }
  else{
    cout<<"Not Harshad Number";}
}

