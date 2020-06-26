#include<iostream>
using namespace std;
int main()
{
int n;
cout<<"Enter the number of elements in the array"<<"\n";
cin >> n;
int arr[n];
cout<<"Enter the elements in the array"<<"\n";
for(int i = 0; i < n; i++)
{
cin >> arr[i];
}
int i;
int o = 0, e = 0;
for(i = 0; i < n; i++)
{
if(arr[i] % 2 == 1)
o++;
if(arr[i] % 2 == 0)
e++;
}
if(o == n)
cout<<"The array is Odd";
else if(e == n)
cout<<"The array is Even";
else
cout<<"The array is Mixed";
return 0;
}
