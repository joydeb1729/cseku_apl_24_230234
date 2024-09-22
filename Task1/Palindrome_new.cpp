#include <bits/stdc++.h>

using namespace std;

/*
   Check if the given string is a palindrome.
   Return true if it is a palindrome; otherwise, return false.
*/
bool isPalindrome(const string &str)
{
    int i;
    int length = str.length();

    /*
        Compare characters from the start and end moving towards the center.
        Return false if characters do not match.
        Return true if all characters match.
    */
    for (i = 0; i < length / 2; i++)
    {
        if (str[i] != str[length - i - 1])
        {
            return false;
        }
    }

    return true;
}

int main()
{
    string input;

    cout << "Enter a string: ";
    cin >> input;

    /* Check if the input string is a palindrome and output the result */
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
