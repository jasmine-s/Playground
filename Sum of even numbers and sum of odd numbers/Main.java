#include<iostream>
using namespace std;
int main()
{
  int size,i,sum1=0,sum2=0;
  cin>>size;
  int a[size];
  for(i=0;i<size;i++){
 
    cin>>a[i];
  }
  for(int i=0;i<size;i++){
    if(a[i]%2==0)
      sum1+=a[i];
    else
      sum2+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<sum1;
  cout<<"\nThe sum of the odd numbers in the array is "<<sum2;
  //Type your code here.
}