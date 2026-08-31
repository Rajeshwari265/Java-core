class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;
        
        while (current != null) {
            nextNode = current.next; // 1. Save the next node
            current.next = prev;     // 2. Reverse the link
            prev = current;          // 3. Move prev forward
            current = nextNode;      // 4. Move current forward
        }
        
        return prev; // New head of the reversed list
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        System.out.print("Original list: ");
        printList(head);
        
        ListNode reversedHead = reverseList(head);
        
        System.out.print("Reversed list: ");
        printList(reversedHead);
    }
}
