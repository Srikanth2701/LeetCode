class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int idx=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<n;i++){
            if(idx==i) continue;
            if(nums[i]*2>max) return -1;
        }
        return idx;
    }
}