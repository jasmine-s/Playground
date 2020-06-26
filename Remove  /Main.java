#include<iostream>
using namespace std;
int main()
{
char sen[100];
cin.getline(sen,100);
int i=0;
while(sen[i]!='\0')
{
  //check for "the"
if(sen[i]=='t'){
i++;
if(sen[i]=='h')
{
i++;
if(sen[i]=='e')
{
i++;
if(sen[i]==' ')
i++;
}
}
else
{ i--;
 //print if not "the"
cout<<sen[i];
i++;
cout<<sen[i];
i++;
}
}
else
{
  cout<<sen[i];
i++;
}
}
}