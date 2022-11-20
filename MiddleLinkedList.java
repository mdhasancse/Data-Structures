public class MiddleLinkedList {
       public ListNode middleNode(ListNode head) {
        // Logic 
          ListNode slowNode = head;
           ListNode FastNode = head;
           while(FastNode != null && FastNode.next != null)
           {
               slowNode = slowNode.next;
               FastNode =FastNode.next.next;
           }
           return slowNode;
       }
   }

