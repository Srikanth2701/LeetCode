/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while(head != null){
            values.add(head.val);
            head=head.next;
        } 

        int n = values.size();
        int[] answer = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i < n; ++i){
            while(!deque.isEmpty() && values.get(deque.peek()) < values.get(i)){
                answer[deque.peek()] = values.get(i);
                deque.pop();
            }
            deque.push(i);
        }
        return answer;
    }
}