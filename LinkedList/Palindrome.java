package LinkedList;

public class Palindrome {
    ListNode start;
   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    void print(){
        ListNode current = start;
        while(current!=null){
            System.out.print(current.val);
            current= current.next;
        }
        System.out.println();


    }
    void insert(ListNode node){
        if(start==null){
            start = node;
            start.next=null;}
        else{
            ListNode current= start;
            while(current.next!=null){
                current = current.next;
            }
            current.next= node;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){return true;}

        ListNode slow = head;
//        System.out.println(slow.val +" slow");
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
//            System.out.println(fast.val + " fast ");
            slow = slow.next;
//            System.out.println(slow.val + " slow af ");
            fast = fast.next.next;
//            System.out.println(fast.val + " fast af");
        }
//        System.out.println(fast.val + " af loop");

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=slow){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
//            System.out.println(prev.val + " prev");
            curr=next;
        }
        if(fast!=null){
            slow= slow.next;
        }
//        System.out.println("slow " +slow.val);

        ListNode revhead= prev;
        while(revhead!=null){
//            System.out.println("revheadv " +revhead.val);
            if(revhead.val!=slow.val){
                return false;
            }
            else{
                slow=slow.next;
                revhead=revhead.next;
            }
        }
        return true;



    }
    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        pd.insert(new ListNode(1));
        pd.insert(new ListNode(0));
//        pd.insert(new ListNode(3));
//        pd.insert(new ListNode(2));
//        pd.insert(new ListNode(1));
        pd.print();
        System.out.println(pd.isPalindrome(pd.start));
    }

}
