#include <iostream>

using namespace std;

int BinarySearch(const int *array, int arraySize, int targetElement);

/*
   Perform a binary search on a sorted array to locate the target element.
   Return the index of the target if found; otherwise, return -1 if the element
   is not in the array.
*/
int BinarySearch(const int *array, int arraySize, int targetElement)
{
    int low = 0, high = arraySize - 1;

    /*
       Repeatedly halve the search range by comparing the middle element
       to the target. Adjust the range based on the comparison result.
    */
    while (high >= low)
    {
        int mid = low + (high - low) / 2;

        if (array[mid] == targetElement)
        {
            return mid;
        }
        else if (array[mid] < targetElement)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    /* Return -1 if the target element is not found in the array. */
    return -1;
}

int main()
{

    const int sortedArray[] = {1, 12, 22, 34, 45, 56, 67, 145, 267, 523, 1089};
    const int arraySize = sizeof(sortedArray) / sizeof(sortedArray[0]);
    const int target = 67;

    /* Call BinarySearch to find the target element's position in the array. */
    int foundIndex = BinarySearch(sortedArray, arraySize, target);

    /* Output the result: target element's position or not found message. */
    if (foundIndex != -1)
    {
        cout << "Element " << target << " is found at position " << (foundIndex + 1) << "." << endl;
    }
    else
    {
        cout << "Element " << target << " is not found in the array." << endl;
    }

    return 0;
}
