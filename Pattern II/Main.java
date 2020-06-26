#include <iostream>
int main(){
  int n,i,j,k=0;
  std::cin>>n;
  for(i=1;i<=n;i++){
    if (i%2 != 0) 
      { 
        for (j=k+1; j<k+i; j++)
          std::cout << j << "*"; 
        std::cout << j++<<"\n";
      
      k = j;     
      } 
    else{
          k = k+i-1;
          for (j=k; j>k-i+1; j--) 
          std::cout << j << "*";
          std::cout << j<<"\n";
        } 
  }
  return 0;
}