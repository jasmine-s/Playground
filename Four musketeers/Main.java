#include<iostream>
using namespace std;
int main()
{
  int a[6],i;
  float sum1=0,sum2=0;
  float avg=0.0;
  for(i=0;i<6;i++)
    cin>>a[i];
  for(i=0;i<6;i++){
    if(i%2!=0)
    sum2+=a[i];
    else
      sum1+=a[i];
  }
  avg=sum1/3;
  cout<<avg<<"\n";
  avg=sum2/3;
  cout<<avg<<"\n";
  //Type your code here.
 
}