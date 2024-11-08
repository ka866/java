public class MaxSumOfTwoInteger{
    public static void main(String[] args) {
        int[] A = {3, 5, 1, 7, 9}; 
        System.out.println("The maximum sum of two distinct integers is: " + MaxSum(A));
    }

    public static int MaxSum(int[] A) {
        if (A.length < 2) {
            System.out.println("Array must have at least two elements.");
            return 0;
        }

       
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : A) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        return (secondMax != Integer.MIN_VALUE) ? (firstMax + secondMax) : 0;
    }
}