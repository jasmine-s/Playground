#include <iostream>
using namespace std;

struct Distance{
    int f;
    float i;
}d1 , d2, s;

int main()
{
    cin >> d1.f>> d1.i;
    cin >> d2.f>> d2.i;
    s.f = d1.f+d2.f;
    s.i = d1.i+d2.i;
    if(s.i > 12)
    {
        ++ s.f;
        s.i -= 12;
    } 
    cout << s.f << "'-" << s.i << "\"";
    return 0;
}