#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
string num;
string substr=".";
cin>>num;
if(num.find(substr) != string::npos) {
 size_t pos = num.find('.'); 
 string str3 = num.substr (pos+1);
  cout<<"Floating part is : "<<str3;
}
else
  cout<<"Floating part is : ";
}
	//Type your code here
