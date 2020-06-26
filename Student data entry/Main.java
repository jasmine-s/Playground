#include <iostream>
#include<cstring>
using namespace std;
struct student
{
  char name[50];
int roll;
float marks;
};
int main()
{
struct student s;
cin.get(s.name, 50);
std::cin>>s.roll;
std::cin>>s.marks;
std::cout<<"\nStudent Details"<<"\n";
std::cout<<"Name: "<<s.name<<"\n";
std::cout<<"Roll: "<<s.roll<<"\n";
std::cout<<"Marks: "<<s.marks<<"\n";
return 0;
}