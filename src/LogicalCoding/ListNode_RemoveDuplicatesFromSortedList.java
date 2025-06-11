package LogicalCoding;

public class ListNode_RemoveDuplicatesFromSortedList{

	// Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to remove duplicates from sorted list
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the input list: [1, 1, 2]
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        System.out.print("Original list: ");
        printList(head);

        // Remove duplicates
        head = deleteDuplicates(head);

        System.out.print("After removing duplicates: ");
        printList(head);
    }
}


