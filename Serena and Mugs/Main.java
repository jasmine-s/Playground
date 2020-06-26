#include<iostream>
using namespace std;
void printresult(int* arr,int n,int c){
  int i=0,sum=0;
  for(i=0;i<n;i++)
{sum=sum+arr[i];}
  if(sum<=c)
{
cout<<"YES";
  }
  else
{cout<<"NO";
}
}
int main()
{
  int n,c,i,sum=0;
  cin>>n>>c;
  int arr[n];
  for(i=0;i<n;i++)
{
    cin>>arr[i];
}
  printresult(arr,n,c);
  return 0;
}