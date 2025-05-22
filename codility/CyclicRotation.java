// Package: codility
public class CyclicRotation {

    public int[] solution(int[] Arr, int rotate) {

        if (Arr.length==0 || rotate==0 || Arr.length==rotate) {
            return Arr;            
        }

        // If the number of rotations is greater than the length of the array,
        // we can reduce it to the equivalent number of rotations
        rotate = rotate % Arr.length;
        // Create a new array to store the rotated values
        int[] rotatedArr = new int[Arr.length];
        // Copy the last 'rotate' elements to the beginning of the new array
        for (int i = 0; i < rotate; i++) {
            rotatedArr[i] = Arr[Arr.length - rotate + i];
        }
        // Copy the remaining elements to the new array
        for (int i = rotate; i < Arr.length; i++) {
            rotatedArr[i] = Arr[i - rotate];
        }

        return rotatedArr;
    }
}

/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
*/