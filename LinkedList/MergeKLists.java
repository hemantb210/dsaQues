package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKLists {
    public class ListNode {
      int val;
     ListNode next;
    ListNode() {}
   ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (ListNode head : lists){
            while(head!=null){
                arr.add(head.val);
            }
        }
        Collections.sort(arr);
        ListNode head = new ListNode();
        for(int i=0; i<arr.size();i++){
            head.val= arr.get(i);
            head= head.next;
        }
        return head;
    }

}
