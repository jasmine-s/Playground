#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int a[r][c],b[r][c];
 int i,j,k;
  int ab[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
}
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++){
      std::cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for (j=0;j<c;j++)
    {
      std::cout<<a[i][j]+b[i][j]<<" ";
    }
    std::cout<<"\n";
  }
      
}
