#include <iostream>
using namespace std;
int main ()
{
  int x, times=0;
  cin>>x;
  cout<<x<<"\n";
  while (x!=1)
{
  if ((x%2)==1)
{
  x=(3*x)+1;
  cout<<x<<"\n";
  times=times+1;
}
  else
{
  x=x/2;
  cout<<x<<"\n";
  times=times+1;
}
}
  cout<<times;
}