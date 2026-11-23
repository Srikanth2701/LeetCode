class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastindex = new int[26];
        for(int i=0; i < s.length(); i++){
            lastindex[s.charAt(i)-'a']=i;
        }

        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(seen[curr-'a']) continue;

            while(!stack.isEmpty() && stack.peek() > curr && lastindex[stack.peek()-'a'] > i){
                seen[stack.pop()-'a']=false;
            }
            stack.push(curr);
            seen[curr-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}