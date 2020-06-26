#include <iostream>
int main() 
{
	// Type your code here
  int n,r;
  std::cin>>n;
  while(n!=0)
  {
    r=n%10;
    std::cout<<r;
    n=n/10;
  
}
	return 0;
}