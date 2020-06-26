#include<iostream>
using namespace std;
int main()
{
int r1,c1;
  cin>>r1>>c1;
  int a[r1][c1],b[r1][c1],i,j,c[r1][c1];
  for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
      cin>>a[i][j];
    }
  }
  for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
      cin>>b[i][j];
    }
  }
  for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
     cout<<a[i][j]+b[i][j]<<" ";
    }cout<<"\n";
    
  }
  
  //Type your code here.
}