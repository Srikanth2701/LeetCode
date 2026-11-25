class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n= temps.length;
        int[] result = new int[n];
        Deque<Integer> stack =new ArrayDeque<>();

        for(int i=0; i < temps.length; i++){
            while(!stack.isEmpty() && temps[stack.peek()] < temps[i]){
                result[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}