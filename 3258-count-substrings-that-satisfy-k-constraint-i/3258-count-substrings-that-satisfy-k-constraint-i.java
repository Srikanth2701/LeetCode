class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int i=0,j=0,cnt1=0,cnt0=0,cntSubstrings=0;
        while(j < s.length()){
            if(s.charAt(j)=='0') cnt0++;
            else cnt1++;

            while(cnt0 > k && cnt1 >k){
                if(s.charAt(i)=='0') cnt0--;
                else cnt1--;
                i++;
            }
            cntSubstrings+=j-i+1;
            j++;
        }
        
        return cntSubstrings;
    }
}