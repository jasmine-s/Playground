#include<iostream>
int main(){
  // Type your code here
  int n,f=1,i;
  std::cin>>n;
  for(i=1;i<=n;i++){
    f*=i;
  }
  std::cout<<f;
}