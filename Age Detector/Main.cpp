#include<iostream>
using namespace std;
int main()
{
  int x,y,by,cy,ca;
  cin>>x>>y;
  if(x>y){by=1900+x;
cy=2000+y;
ca=cy-by;
cout<<ca;
}
else
{
by=2000+x;
cy=2000+y;
ca=cy-by;
cout<<ca;
}//Type your code here.
}
