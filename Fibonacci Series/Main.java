#include <iostream>
int main(){
int n, t1 = 0, t2 = 1, nextTerm = 0,i;
  std::cin >> n; 
  if(n == 0|| n == 1)
    std::cout <<"The term "<<n<<" in the fibonacci series is "<<n;
else
nextTerm = t1 + t2;
for (i = 3;i <= n; ++i)
{
t1 = t2; t2 = nextTerm; 
  nextTerm = t1 + t2;}
std::cout <<"The term "<<n<<" in the fibonacci series is "<< t2;

}