class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i < n; i++){
            if(stack.isEmpty() || arr[i] > stack.peek()){
                stack.push(arr[i]);
            }else{
                int maxElement = stack.peek();
                while(!stack.isEmpty() && arr[i] < stack.peek()){
                    stack.pop();
                }
                stack.push(maxElement);
            }
        }
        return stack.size();
    }
}