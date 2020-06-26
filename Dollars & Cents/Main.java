#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,s1=0,s2=0;
  cin>>d1;
  cin>>c1;
  cin>>d2;
  cin>>c2;
  s1=d1+d2;
  s2=c1+c2;
  while(s2>=100){

    s2=s2-100;
    s1=s1+1;
  }
  cout<<s1<<"\n";
  cout<<s2;
  //Type your code here.
}