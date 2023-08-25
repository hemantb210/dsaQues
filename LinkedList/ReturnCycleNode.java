package LinkedList;

public class ReturnCycleNode {
    // Java program to return first node of loop

        static class Node
        {
            int key;
            Node next;
        }

        static Node newNode(int key)
        {
            Node temp = new Node();
            temp.key = key;
            temp.next = null;
            return temp;
        }

        // A utility function to print a linked list
        static void printList(Node head)
        {
            while (head != null)
            {
                System.out.print(head.key + " ");
                head = head.next;
            }
            System.out.println();
        }

        // Function to detect first node of loop
// in a linked list that may contain loop
        static Node detectLoop(Node head)
        {

            // Create a temporary node
            Node temp = new Node();
            while (head != null)
            {

                // This condition is for the case
                // when there is no loop
                if (head.next == null)
                {
                    return null;
                }

                // Check if next is already
                // pointing to temp
                if (head.next == temp)
                {
                    break;
                }

                // Store the pointer to the next node
                // in order to get to it in the next step
                Node nex = head.next;

                // Make next point to temp
                head.next = temp;

                // Get to the next node in the list
                head = nex;
            }
            return head;
        }

        /* Driver program to test above function*/
        public static void main(String[] args)
        {
            Node head = newNode(3);
            head.next = newNode(2);
            head.next.next = newNode(0);
            head.next.next.next = newNode(-4);
//            head.next.next.next.next = newNode(10);

            /* Create a loop for testing */
            head.next.next.next.next = head.next;

            Node res = detectLoop(head);
            if (res == null)
                System.out.print("Loop does not exist");
            else
                System.out.print("Loop starting node is " +
                        res.key);

        }
    }




