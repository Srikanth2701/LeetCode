class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] v=new int[n+1];
        int dup=0,missing=0;
        for(int i=0;i<n;i++){
            v[nums[i]]++;
        }
        for(int i=1;i<v.length;i++){
            if(v[i]==2){
                dup=i;
            }
            if(v[i]==0){
                missing=i;
            }
        }
        return new int[] {dup,missing};
    }
}