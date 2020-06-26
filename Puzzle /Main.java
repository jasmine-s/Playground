#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
 int i,j;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];}
}
  for(i=0;i<c;i++){
    for(j=0;j<r;j++){
      std::cout<<a[j][i]<<" ";
    }std::cout<<"\n";
  }
}
    
    