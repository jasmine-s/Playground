#include<iostream>
using namespace std;
int main(){
int a, b;
cin>>a;
if(a<=200){
  b=a*0.5;
cout<<"Rs."<<b;}
else if(a<=400){
 b= (0.65*a)+100;
cout<<"Rs."<<b;
}
else if(a<=600){
b=(0.80*a)+200;
cout<<"Rs."<<b;
}
else{
 int rs=(1.25*a)+425; 
  cout<<"Rs."<<rs;
}}