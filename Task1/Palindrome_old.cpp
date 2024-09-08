#include <bits/stdc++.h>

using namespace std;


bool isPalindrome(const string& str) {
    int n = str.length();

    for (int i = 0; i < n/2; i++) 
    {
        if (str[i] != str[n-i-1]) 
        {
            return false;
        }
    }

    return true; 
}

int main() {
    string input;


    cout << "Enter a string: ";
    cin >> input;

    if (isPalindrome(input)) 
    {
        cout << input << " is a palindrome." << endl;
    }
     
    else 
    {
        cout << input << " is not a palindrome." << endl;
    }

    return 0;
}
