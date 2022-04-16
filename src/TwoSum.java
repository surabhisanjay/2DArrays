public class TwoSum {
    public static void main(String[] args) {
        int[] array={1,2,3};
        twoSum(array,5);
    }

    public static void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j && i < j) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
