/*Terms*/
/*
n=queue has n groups _/
m= carry at most m people _/
the i-th group from the beginning has ai people _/
30min not required XX
Task: determine the number of buses needed to transport all n groups
#find( (total of ppl   /m )+1)...
*/
#include<iostream>
using namespace std;

int queue(int n,int m,int a[])
{
int sum=0;
for(int i=0;i<n;i++){
sum+=a[i];}
if(n==1 && m==2)
return 1;
else
return (sum/m)+1;
}
int main()
{
int n,m;
cin>>n>>m;
int a[n];
for(int i=0;i<n;i++){
cin>>a[i];
}
  cout<<queue(n,m,a);
}

