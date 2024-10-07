import java.util.Arrays;

public class LeetCode_16 {

    @SuppressWarnings("unused")
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Input array must have at least 3 elements.");
        }

        Arrays.sort(nums);  // Sort the array for efficient two-pointer approach
        int closestSum = nums[0] + nums[1] + nums[2];  // Initialize closest sum (can be improved)
        int minDiff = Math.abs(closestSum - target);  // Initialize minimum difference

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left <= right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(currentSum - target);

                if (diff == 0) {
                    return currentSum;  // Perfect match found, return directly
                }

                if (diff <= minDiff) {  // Update closest sum if closer or equally close
                    closestSum = currentSum;
                    minDiff = diff;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        LeetCode_16 obj = new LeetCode_16();
        int[] arr = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        int res = obj.threeSumClosest(arr, target);
        System.out.println(res);  // Output: -2
    }
}
