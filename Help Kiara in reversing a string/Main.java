#include <iostream>
int main()
{
  char str[50],rev[50];
  int end,i,count;
  std::cin.getline(str,100);
  for(i=0;str[i]!='\0';i++)
  {count++;}
  end=count;
  for(i=0;i<end;i++)
  {
    rev[i]=str[count-1];
    count--;
  }
  std::cout<<rev;
}