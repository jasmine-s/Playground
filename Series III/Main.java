#include <iostream>
int main()
{
  int n,i,j=6,sum=5;
  std::cin>>n;
  for (i=1;i<=n;i++)
  {
    std::cout<<j<<" ";
    j=j+sum;
    sum=sum+5;  
  }
  return 0;
}
