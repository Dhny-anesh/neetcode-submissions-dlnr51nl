class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0; i< n; i++)
        {
            int element = nums[i];
            int j = i -1;

            while(j>= 0 && nums[j] > element)
            {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = element;
        }
    }
}