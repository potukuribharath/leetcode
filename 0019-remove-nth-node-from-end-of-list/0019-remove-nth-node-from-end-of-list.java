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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        
        
        ListNode tail=head;
        
        while(tail!=null){
            count+=1;
            tail=tail.next;
        }
         if(count==n){
            head=head.next;
            return head;
        }
        
        if(count==1){
            head=null;
            return head;
        }
        if(count==2){
            if(n==1){
                head.next=null;
                return head;
            }
            if(n==2){
                head=head.next;
                return head;
            }
        }
        if(count ==3){
            if(n==1){
                head.next.next=null;
                return head;
            }
            if(n==2){
                head.next=head.next.next;
                head.next.next=null;
                return head;
            }
            if(n==3){
                head=head.next;
                return head;
            }
        }
        tail=head;
        for(int i=0;i<count-n-1;i++){
            head=head.next;
        }
        head.next=head.next.next;
       
            head=tail;
        System.out.print(count);
            return head;
    }
}