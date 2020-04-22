import java.util.LinkedList;

class ListNode
{
    ListNode head; // head of linked list

        int data;
    ListNode next;
    ListNode(int d)
        {
            data = d;
            next = null;
        }

    //ListNode next;
    //ListNode(int x) { val = x; }
}
public class Problem8 {

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
       /* System.out.println("The middle element is [" +
                slow.data + "] \n");*/
        return slow;


    }


    public static ListNode middleListNode(ListNode head) {

        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        return slow_ptr;
    }


    /* Inserts a new ListNode at front of the list. *//*
    public void push(int new_data)
    {
        *//* 1 & 2: Allocate the ListNode &
                  Put in the data*//*
        ListNode new_ListNode = new ListNode(new_data);

        *//* 3. Make next of new ListNode as head *//*
        new_ListNode.next = head;

        *//* 4. Move the head to point to new ListNode *//*
        head = new_ListNode;
    }*/

    /* This function prints contents of linked list
       starting from  the given ListNode */
    public static void printList(ListNode head)
    {
        ListNode tListNode = head;
        while (tListNode != null)
        {
            System.out.print(tListNode.data+"->");
            tListNode = tListNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        ListNode head= new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(5);
        printList(head);
        middleNode(head);
        printList(head);

    }

}

