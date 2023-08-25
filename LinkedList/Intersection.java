package LinkedList;

public class Intersection {

    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int count1= count(headA);
        int count2= count(headB);
        int flag=0;
        if(count1>count2){
            flag=1;
        }
        int diff = flag==1?count1-count2:count2-count1;
        if(flag==1){
            int i =0;
            while(i<diff){
                headA=headA.next;
                i++;
            }
        }
        else {
            int i =0;
            while(i<diff){
                headB=headB.next;
                i++;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;



        }
        return null;



    }
    public int count(ListNode head){
        int count =0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;

    }

    public Palindrome.ListNode findIntersection(Palindrome.ListNode headA, Palindrome.ListNode headB){
        Palindrome.ListNode tempA = headA;
        Palindrome.ListNode tempB = headB;
        while(tempA!=tempB){
            tempA= tempA==null?headB:tempA.next;
            tempB= tempB==null?headA:tempB.next;
        }
        return tempA;


    }


}
