// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/submissions/854944924/

class Solution {
    public int minimumDeletions(int[] nums) {
        int max_index = 0; // max value index
        int min_index = 0; // min value index
        int n = nums.length; // length of array

        // finding the max, min ... index
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[max_index])
                max_index = i;

            if (nums[i] < nums[min_index])
                min_index = i;
        }

        // min value index
        int min_l = min_index + 1; // from left
        int min_r = n - min_index; // from right

        // which is shortest distance for min value with sign
        // +ve from left
        // -ve from right
        int min_count = min_l < min_r ? min_l : -min_r;

        // max value index
        int max_l = max_index + 1; // from left
        int max_r = n - max_index; // from right

        // shortest distance for max value with sign (+ve / -ve)
        int max_count = max_l < max_r ? max_l : -max_r;

        // now removing the sign ... for calulation ... in return statement
        int abs_min_count = Math.abs(min_count);
        int abs_max_count = Math.abs(max_count);

        int who_is_far = abs_min_count > abs_max_count ? abs_min_count : abs_max_count;
        int sum = abs_min_count + abs_max_count;

        // /* ------------------------- print statement / testing

        System.out.println("--------------------------------");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + ":" + nums[i] + ", ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("min_l : " + min_l);
        System.out.println("min_r : " + min_r);
        System.out.println("min_count : " + min_count);
        System.out.println("abs_min_count : " + abs_min_count);
        System.out.println("--------------------------------");
        System.out.println("max_l : " + max_l);
        System.out.println("max_r : " + max_r);
        System.out.println("max_count : " + max_count);
        System.out.println("abs_max_count : " + abs_max_count);
        System.out.println("--------------------------------");
        System.out.println("who_is_far : " + who_is_far);
        System.out.println("Sum : " + sum);
        System.out.println("--------------------------------");

        // ------------------------- */

        // Example 2. in description
        // if both are from same side ... left or right side
        if ((min_count > 0 && max_count > 0) || (min_count < 0 && max_count < 0)) {
            return who_is_far;
        }
        // (Example 1. in description)
        // if one from left ... one from right
        // out of 4 condition 2 condition check in above if
        else {
            // special important condition
            // for rest 2 condition ie. sum of outer edges
            // though they where closest
            // they will remove more element from the array
            // if sum of outer edges is less than
            // longest distance for min and max
            // then its ok

            int long_from_min = min_l > min_r ? min_l : min_r;
            int long_from_max = max_l > max_r ? max_l : max_r;

            if ((sum < long_from_min) && (sum < long_from_max))
                return sum;
            else if (long_from_min < long_from_max)
                return long_from_min;
            else
                return long_from_max;
        }
    }
}
