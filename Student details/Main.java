#include<iostream>
#include<bits/stdc++.h> 
#include<string>
using namespace std;
struct Student
{
  char name[30];
  char dept[10];
  int y;
  float cgpa;
};
int main()
{
  int n,i,j;
  cout<<"Enter the number of students\n";
  cin>>n;
  char x[n][30];
  char t[30];
  Student s[n];
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name\n";
    cin.ignore();
    cin.getline(s[i].name,30);
    strcpy(x[i], s[i].name);
    cout<<"Enter department\n";
    cin.getline(s[i].dept,20);
    cout<<"Enter year of study\n";
    cin>>s[i].y;
    cout<<"Enter cgpa\n";
    cin>>s[i].cgpa;
  }
  for(i=0;i<n;i++){
      for(j=0;j<n-i-1;j++)
      {
        if(strcmp(x[j],x[j+1])>0){
            strcpy(t, x[j]);
            strcpy(x[j], x[j+1]);
            strcpy(x[j+1], t);
        }                 
      }
  }
    cout<<"Details of students\n";
    for(int i=0;i<n;i++)
    {
      for(int j=0; j<n; j++){
        if(strcmp(x[i],s[j].name)==0){
        cout<<"Student "<<i+1<<endl;
        cout<<"Name:"<<s[j].name<<endl;
        cout<<"Department:"<<s[j].dept<<endl;
        cout<<"Year of study:"<<s[j].y<<endl;
        cout<<"CGPA:"<<setprecision(2)<<s[j].cgpa<<endl;
        break;           
        }  
        }
    }
    return 0;
  }