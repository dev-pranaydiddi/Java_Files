package Practice_3;

public class MaxSubArrProd {
    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If negative → swap
//            if (nums[i] < 0) {
//                int temp = max;
//                max = min;
//                min = temp;
//            }
//
//            max = Math.max(nums[i], max * nums[i]);
//            min = Math.min(nums[i], min * nums[i]);

            int tempMax = Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
            int tempMin = Math.min(nums[i],Math.min(max*nums[i],min*nums[i]));
            max = tempMax; min= tempMin;
            maxProd = Math.max(maxProd, max);
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {2,-4,-5,-2,3};
        System.out.println(maxProduct(arr)); // Output: 6
    }
}

//

