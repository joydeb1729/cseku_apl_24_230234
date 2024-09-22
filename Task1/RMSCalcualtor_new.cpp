#include <bits/stdc++.h>

using namespace std;

/*
   Calculate the Root Mean Square (RMS) of a vector of integers.
   Return the RMS value.
*/
double calculateRMS(vector<int> &numbers, int count)
{
    double sumOfSquares = 0.0, meanOfSquares;

    /* Calculate the sum of squares of the elements */
    for (int i = 0; i < count; i++)
    {
        sumOfSquares += numbers[i] * numbers[i];
    }

    /* Calculate the mean of squares and return the square root of the mean */
    meanOfSquares = sumOfSquares / count;

    return sqrt(meanOfSquares);
}

int main()
{
    int elementCount, rmsValue;

    cout << "Enter the number of elements: ";
    cin >> elementCount;

    /* Initialize vector with size elementCount */
    vector<int> numbers(elementCount);

    cout << "Enter the elements: ";
    for (int i = 0; i < elementCount; i++)
    {
        cin >> numbers[i];
    }

    /* Calculate and output the RMS value */
    rmsValue = calculateRMS(numbers, elementCount);
    cout << "RMS value of the array is: " << rmsValue << endl;

    return 0;
}
