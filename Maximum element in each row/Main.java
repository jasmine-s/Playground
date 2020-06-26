#include<iostream>
using namespace std;
int main()
{
    int nr,nc,i,j;
  cin>>nr>>nc;
  int a[nr][nc],max;
 for(i=0;i<nr;i++)
{
    for(j=0;j<nc;j++)
{
      cin>>a[i][j];
    }
 }
for(i=0;i<nr;i++)
{
max=a[i][0];
for(j=1;j<nc;j++)
  if(a[i][j]>max)max=a[i][j];
cout<<max<<"\n";
} //Type your code here.
}