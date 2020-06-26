#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++){
  for(j=0;j<n;j++)
    cin>>a[i][j];
  }
    int sum=0;
  for(i=0;i<m;i++){
  for(j=0;j<n;j++){
    sum+=a[i][j];
    }
      cout<<sum<<"\n";
    sum=0;
  }
 
  //Type your code here.
}