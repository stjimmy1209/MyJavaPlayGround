package com.leetcode.test;

public class RotateMatrix {


    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(matrix);

    }

    /**
     * So basically we need to reverse the matrix upside down first, and then swap each symmetric element.
     *
     * 1. Reverse each row in a for-loop. (No need to consider whether the number of rows are odd or even. "/" would naturally do the trick.)
     * 2. We divide the matrix into three parts, that is to say, a diagonal (left top to right bottom), right up, left down.
     * 3. We do not need to rotate the diagonal.
     * 4. Now we only need to consider one of the two parts left. In this code, we swap each pair of symmetric elements in the right up part.
     * */
    static void rotate(int[][] matrix) {

        int length = matrix.length;
        for (int i = 0; i < length / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }



}
