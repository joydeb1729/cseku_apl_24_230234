#include <bits/stdc++.h>

using namespace std;

double calculateRMS(vector<int>& vec, int n) {

    double sum = 0.0;

    for (int i = 0; i < n; i++) 
    {
        sum += vec[i] * vec[i];
    }

    double mean = sum / n;

    return sqrt(mean);
}

int main() {
    int n;
    vector<int> vec(n);
    
    cout << "Enter the number of elements: ";
    cin >> n;
    
    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) 
    {
        cin >> vec[i];
    }
    
    double rms = calculateRMS(vec, n);

    cout << "RMS value of the array is: " << rms << endl;
    
    return 0;
}
