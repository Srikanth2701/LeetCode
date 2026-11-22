class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] count=new int[51];
        int[] ans=new int[nums.length-k+1];

        for(int i=0; i < nums.length; i++){
            count[nums[i]]++;

            if(i >=k){
                count[nums[i-k]]--;
            }
            if(i>=k-1){
                int[] temp=count.clone();
                for(int t=0; t < x; t++){
                    int best=0;
                    for(int num=50; num>=1; num--){
                        if(temp[num] > temp[best]) best=num;
                    }
                    ans[i-k+1] += best*temp[best];
                    temp[best]=0;
                }
            }
        }
        return ans;
    }
}