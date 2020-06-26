#include <iostream>
using namespace std;
int main()
{
int array[4], position, c, n, value;
cout<<"Enter the number of elements in the array"<<endl;
cin>>n;
cout<<"Enter the elements in the array"<<endl;
for (c = 0; c < n; c++)
cin>>array[c];
cout<<"Enter the location where you wish to insert an element"<<endl;
cin>>position;
if(position>n)
{
cout<<"Invalid Input";
}
else
{
cout<<"Enter the value to insert"<<endl;
cin>>value;
for (c = n - 1; c >= position - 1; c--)
array[c+1] = array[c];
array[position-1] = value;
cout<<"Array after insertion is"<<endl;
for (c = 0; c <= n; c++)
{
  cout<<array[c]<<"\n";
}
} 
}