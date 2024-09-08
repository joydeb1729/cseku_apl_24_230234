#include <bits/stdc++.h>

using namespace std;


int sumOfBoundaryElements(vector<vector<int>>& matrix) {


    int rows = matrix.size();
    int cols = matrix[0].size();
    int sum = 0;

    for (int j = 0; j < cols; j++)
    {
        sum += matrix[0][j];
    }

    for (int j = 0; j < cols; j++)
    {
        sum += matrix[rows - 1][j];
    }

 
    for (int i = 1; i < rows - 1; i++) 
    {
        sum += matrix[i][0];           
        sum += matrix[i][cols - 1];    
    }

    return sum;
}

int main(){

    vector<vector<int>> matrix;
    
    matrix = 

    {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}   
    };

    cout <<"Sum of boundary elements: "<<sumOfBoundaryElements(matrix)<< endl;

    return 0;
}
