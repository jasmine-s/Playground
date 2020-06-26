#include<iostream>
using namespace std;
int main()
{
  int x;
  double y;
  std::cin>>x;
  std::cin>>y;
  if(y==13.30 && x>13)
  {
    std::cout<<"$5.00";
  }
  else if(y==13.30 && x<=13)
  {
    std::cout<<"$2.00";
  }
  else if(x>13)
  {
    std::cout<<"$8.00";
  }
  else
  {
    std::cout<<"$4.00";
  }
    //Type your code here.
}