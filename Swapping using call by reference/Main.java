#include <iostream>
using namespace std;

int main() 
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
    a = a + b;  
    b = a - b;  
    a = a - b;
   // Try out your code here
    cout <<"After swapping a= "<<a<<" and b="<<b;
    return 0;
}