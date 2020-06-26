#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n],k,i,c=0;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>k;
  for(i=0;i<n;i++)
  {
    if(a[i]==k){  c=1; break;}
  }
    if(c==1)
      std::cout<<"She passed her exam";
     else std::cout<<"She failed";
  // Type your code here
}