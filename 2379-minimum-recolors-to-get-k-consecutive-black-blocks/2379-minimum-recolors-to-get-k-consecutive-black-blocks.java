class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0, numWhite=0, numRecolors=Integer.MAX_VALUE;

        for(int right=0; right< blocks.length(); right++){
            if(blocks.charAt(right)=='W'){
                numWhite++;
            }
            if(right-left+1 == k){
                numRecolors=Math.min(numWhite,numRecolors);

                if(blocks.charAt(left)=='W') numWhite--;

                left++;
            }
        }
        return numRecolors;
    }
}