#include<iostream>
  //Type your code here.
int power(int n1, int n2);
int main() {
int a, n, result;
  std::cin>>a;
  std::cin>>n;
  result = power(a, n);
  std::cout<<"G.C.D of "<<a<<" and "<<n<<" = "<<result;
  return 0;
}
int power(int n1, int n2) {
while(n1 != n2)
    {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }
  return n1;
}