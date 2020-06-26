#include<iostream>
using namespace std;
int main(){
int x,y,r;
double inter,amount,disc,finall;
cin>>x>>y>>r;
inter=(x*y*r)/100;
amount=x+inter;
disc=inter*2/100;
finall=x+inter-disc;
cout<<inter<<endl;
cout<<amount<<endl;
cout<<disc<<endl;
cout<<finall<<endl;
return 0;
}
