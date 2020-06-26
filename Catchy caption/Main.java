#include <cstring>
#include <iostream>
using namespace std;
int main()
{
char s[100];
cin.getline(s,100);
int len = strlen(s);
int word=0;
for(int i=0;i<len;i++)
{
if(s[i]==' ')
word++;
}
if(word<=10) cout<<"Caption eligible for the contest"<<endl;
  else
 cout<<"Caption not eligible for the contest"<<endl;
}