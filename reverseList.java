import java.util.Arrays;
import java.util.LinkedList;

public class reverseList {
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        reverseList list = new reverseList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}





//     Node head;
    
//     //create a node
//     class Node
//     {
//         int val;
//         Node next;
//         Node(int val) // this is also called constructor
//         {
//             this.val = val;
//             this.next = null;
//         }
//     }

//     public void push(int val)
//     {
//         Node newNode = new Node(val); // create a node 
//         if(head == null)
//         {
//             head = newNode;
//             return;
//         }
//         else{
//             Node curNode = head; // create a curnode for traverse the node from start
//             while (curNode.next != null)
//             {
//                 curNode = curNode.next;
//             }
//             curNode.next = newNode;
//         }
//     }

//     public reverseList.Node  reverseListNode(Node head)
//     {
//         if(head == null){
//             return head;
//         }
//         Node cur = head;
//         Node prev = null;
//         Node next = null;
//         while(cur != null)
//         {
//             next = cur.next;
//             cur.next = prev;
//             prev = cur;
//             cur = next;
//         }
//         System.out.print(prev);
//         return null;
//     }

//     public void print()
//     {
//         if (head == null)
//         {
//             System.out.println("List is empty");
            
//         }
//         Node currentNode = head;
//         while(currentNode != null)
//         {
//             System.out.println(currentNode.val );
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }
//     public static void  main(String[] args) {
//         // int val = 2; // key to delete
//         reverseList list = new reverseList();
//         list.push(1);
//         list.push(1);
//         list.push(2);
//         list.push(3);
//         list.push(3);
        
//         list.print();
//         System.out.println("After Delete the duplicate val");
    
//         list.reverseListNode(0);
//         list.print();
//     }

//     private void reverseListNode(int i) {
//     }
    
// }

