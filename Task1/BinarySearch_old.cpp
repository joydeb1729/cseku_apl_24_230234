#include <bits/stdc++.h>

using namespace std;

int BinarySearch(int *arr2, int size, int element) {
    int low = 0, high = size - 1;
    while (high >= low) {
        int mid = (high + low) / 2;

        if (arr2[mid] == element)
            return mid;

        else if (arr2[mid] < element)
            low = mid + 1;

        else
            high = mid - 1;
    }

    return -1;
}

int main() {
    int size, index, element;

    int arr2[] = {1, 12, 22, 34, 45, 56, 67, 145, 267, 523, 1089};

    size = sizeof(arr2) / sizeof(int);

    element = 67;

    index = BinarySearch(arr2,size,element);

    if (index != -1)
        cout << element << " is found at no. " << index + 1 << " position." << endl;
        
    else
        cout << element << " is not found." << endl;

    return 0;
}
