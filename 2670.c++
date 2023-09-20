#include <iostream>
using namespace std;

int main(){
    int A1, A2, A3;
    cin >> A1 >> A2 >> A3;

    int t1, t2, t3, menor;
    t1 = 2 * A2 + 4 * A3;
    t2 = 2 * A1 + 2 * A3;
    t3 = 4 * A1 + 2 * A2;

    if( t1 <= t2 && t1 <= t3)
        menor = t1;
    else if(t2 <= t3)
        menor = t2;
    else    
        menor = t3;
    
    cout << menor << endl;

}

