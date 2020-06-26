#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  float overs,covers,c_r,t_r;
  std::cin>>a>>b>>c>>d;
  overs=int(a/6)+((float(a%6)*0.1));
  covers=int(d/6)+((float(d%6)*0.1));
  c_r=float(c)/float(covers);
  t_r=b/overs;
  std::cout<<overs<<"\n"<<covers<<"\n"<<fixed<<setprecision(1)<<c_r<<"\n"<<t_r<<"\n";
  if(t_r>c_r){
    std::cout<<"Not Eligible to Win";
  }
else{
  std::cout<<"Eligible to Win";
}//Type your code here.
}