#include <bits/stdc++.h>

using namespace std;

/* 
   Calculate the sum of the boundary elements of a given matrix.
   Return the total sum of boundary elements.
*/
int sumOfBoundaryElements(const vector<vector<int>>& matrix) 
{
    /* Variables to store the number of rows, columns and sum of boundary elements in the matrix */
    int rowCount, colCount, boundarySum;
    int row, col;
    rowCount = matrix.size(); 
    colCount = matrix[0].size();
    boundarySum = 0;

    /* Sum the first row of the matrix */
    for (col = 0; col < colCount; col++) 
    {
        boundarySum += matrix[0][col];
    }

    /* Sum the last row of the matrix */
    for (col = 0; col < colCount; col++) 
    {
        boundarySum += matrix[rowCount - 1][col];
    }

    /* Sum the first and last elements of the intermediate rows */
    for (row = 1; row < rowCount - 1; row++) 
    {
        boundarySum += matrix[row][0];
        boundarySum += matrix[row][colCount - 1]; 
    }

    return boundarySum;
}

int main() 
{
    /* Initialize the matrix */
    vector<vector<int>> matrix = 
    {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}   
    };

    /* Output the sum of boundary elements */
    cout << "Sum of boundary elements: " << sumOfBoundaryElements(matrix) << endl;

    return 0;
}
