class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int var = 0;
        for(int i = 0; i<2;i++) 
        {
            for(int num:nums)
            {
                ans[var++] = num;
            }
            
        }
        return ans;
    }
}