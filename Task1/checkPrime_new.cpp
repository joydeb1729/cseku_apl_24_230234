#include <bits/stdc++.h>

using namespace std;

/*
   Check if a given number is prime.
   Return true if the number is prime; otherwise, return false.
*/
bool isPrime(long long number)
{
    long long i;
    if (number == 1)
    {
        return false;
    }

    /*
        Check for factors from 2 up to the square root of the number.
        Return false if a factor is found.
        Return true if no factors are found.
    */
    for (i = 2; i * i <= number; i++)
    {
        if (number % i == 0)
        {
            return false;
        }
    }

    return true;
}

int main()
{
    int testCases;
    long long inputNumber;

    cout << "Enter the number of test cases: ";
    cin >> testCases;

    /* Process each test case */
    while (testCases--)
    {
        cout << "Enter a number to check if it is prime: ";
        cin >> inputNumber;

        /* Output the result based on the primality check */
        if (isPrime(inputNumber))
        {
            cout << "The number " << inputNumber << " is prime." << endl;
        }
        else
        {
            cout << "The number " << inputNumber << " is not prime." << endl;
        }
    }

    return 0;
}
