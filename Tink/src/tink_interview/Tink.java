package tink_interview;

import java.util.*;

public class Tink {

    public static void main(String[] args) {
//        var nums = new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
//        var nums2 = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//        plusOne(nums);
//        var nums3 = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//        spiralOrder(nums3);

        int a = 6;             // кол-во строк исходной матрицы
        int b = 12;            // кол-во столбцов исходной матрицы
        int[][] ar = new int[a][b];
        int[][] ar1 = new int[b][a];
        Random r = new Random();
        int t = 0;

        // Create matrix with random values
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(10);
            }
        }

        // print matrix
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] >= 0) {
                    ar1[j][i] = ar[i][j];
                }
            }
        }

        // print matrix
        for (int j = 0; j < ar1.length; j++) {
            for (int i = 0; i < ar1[j].length; i++) {
                System.out.print(ar1[j][i] + " ");
            }
            System.out.println();
        }
    }

//    public static List<Integer> spiralOrder(int[][] matrix) {
//        int N = matrix.length;
//        int M = matrix[0].length;
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//
//            }
//        }
//    }

    public static String reverseString2(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        // Check for empty matrices
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        // Variables to track the size of the matrix
        int N = mat.length;
        int M = mat[0].length;

        // The two arrays as explained in the algorithm
        int[] result = new int[N*M];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();

        // We have to go over all the elements in the first
        // row and the last column to cover all possible diagonals
        for (int d = 0; d < N + M - 1; d++) {

            // Clear the intermediate array every time we start
            // to process another diagonal
            intermediate.clear();

            // We need to figure out the "head" of this diagonal
            // The elements in the first row and the last column
            // are the respective heads.
            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M - 1;

            // Iterate until one of the indices goes out of scope
            // Take note of the index math to go down the diagonal
            while (r < N && c > -1) {

                intermediate.add(mat[r][c]);
                ++r;
                --c;
            }

            // Reverse even numbered diagonals. The
            // article says we have to reverse odd
            // numbered articles but here, the numbering
            // is starting from 0 :P
            if (d % 2 == 0) {
                Collections.reverse(intermediate);
            }

            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }

    public static int[] plusOne(int[] digits) {
        boolean carry = true;

        for (int i = digits.length - 1; carry && i >= 0; i--) {
            carry = digits[i] == 9;
            digits[i] = carry ? 0 : digits[i] + 1;
        }

        if (carry) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            System.arraycopy(digits, 0, tmp, 1, digits.length);
            digits = tmp;
        }

        return digits;
    }

    public static int dominantIndex(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                maxIndex = i;
            } else if (nums[i] != max && nums[i] * 2 > max) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    res = new int[]{i,j};
                }
            }
        }
        return res;
    }

    public static int pivotIndex(int[] nums) {
        int res = -1;
        var sumFromEnd = Arrays.stream(nums).sum();
        int sumFromBeginning = 0;

        for (int i = 0; i < nums.length; i++) {
            sumFromEnd -= nums[i];
            if (sumFromBeginning == sumFromEnd) {
                res = i;
                break;
            }
            sumFromBeginning += nums[i];
        }
        return res;
    }
}
