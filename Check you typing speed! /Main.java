#include <iostream>
int main()
{
 int id,marks;
 std::cin>>id>>marks;
 if((marks>0)&&(marks<=10))
   std::cout<<id<<" is eligible for reward.";
}