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
  
  int max=a[0][0];
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      if(max<a[i][j])
        max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}  //Type your code here.