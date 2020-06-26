#include <iostream>
int main(){
  int a,b;
  std::cin>>a;
  std::cin>>b;
  if(a>b)
    std::cout<<b<<" is smallest number";
  else
    std::cout<<a<<" is smallest number";
  return 0;
}