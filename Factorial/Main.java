#include<iostream>
int main()
{
  int n,i,r=1;
  std::cin>>n;
  for(i=1;i<=n;i++)
     r*=i;
  std::cout<<"The factorial of "<<n<<" is "<<r;
  //Type your code here.
}