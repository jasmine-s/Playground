#include<iostream>
using namespace std;
int main()
{
int m, n, sum = 0, r1 = 0, cn = 0, d = 0;
cin >> m >> n;
int i, j;
int a[m][n];
for(i = 0; i < m; i++)
{
for(j = 0; j < n; j++)
cin >> a[i][j];
}
for(i = 0; i <= 0; i++)
{
for(j = 0; j < n-1; j++)
{
r1 = r1 + a[i][j];
}
}
for(j = n - 1; j == n-1; j--)
{
for(i = 1; i < m; i++)
{
cn = cn + a[j][i];
}
}
for(i = 0; i < m; i++)
{
for(j = 0; j < n; j++)
{
if ((i + j) == (m - 1))
{
d += a[i][j];
}
}
}
cout << "Sum of Zig-Zag pattern is "<<d+r1+cn;
}