#include<iostream>
using namespace std;
int main()
{
  int h1,m1,s1;
  cin>>h1>>m1>>s1;
   int h2,m2,s2;
  cin>>h2>>m2>>s2;
  int dh,dm,ds;
 // int h=12,m=60,s=60;
  if(s2>s1){
    --m1;
    s1+=60;
  }
  ds=s1-s2;
  if(m2>m1){
  --h1;
    m1+=60;
  }
  dm=m1-m2;
  dh=h1-h2;
  cout<<dh<<":"<<dm<<":"<<ds<<"\n";
  //Type your code here.
}