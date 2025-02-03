#include <iostream>
using namespace std;

int main() {
    int flag = 1;
    while (flag) {
        int n1, n2;
        cout << "enter number n1 and n2 (respectively) : ";
        cin >> n1 >> n2;
    
        char op;
        cout << "enter operation(+,-,*,/) : ";
        cin >> op;

        cout << "result :- ";
        switch(op) {
           case '+':
                cout << n1 << " + " << n2 << " = " << n1 + n2;
                break;
            case '-':
                cout << n1 << " + " << n2 << " = " << n1 - n2;
                break;
            case '*':
                cout << n1 << " + " << n2 << " = " << n1 * n2;
                break;
            case '/':
                cout << n1 << " + " << n2 << " = " << n1 / n2;
                break;
            default:
                cout << "input is done wrong";
                break;
        }
        cout << endl << endl;

        cout << "if you want to stop enter 0.\nelse to redo enter anything except zero : ";
        cin >> flag;
        cout << endl;
    }

    cout << "Thankyou";
    return 0;
}
