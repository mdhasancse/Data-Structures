import java.util.Arrays;

public class removeDuplicate_item {
    Node head;
    
    //create a node
    class Node
    {
        int val;
        Node next;
        Node(int val) // this is also called constructor
        {
            this.val = val;
            this.next = null;
        }
    }

    public void push(int val)
    {
        Node newNode = new Node(val); // create a node 
        if(head == null)
        {
            head = newNode;
            return;
        }
        else{
            Node curNode = head; // create a curnode for traverse the node from start
            while (curNode.next != null)
            {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    public void removeDup_itemFromSorted_list(int val)
    {
        if (head == null)
        {
            return;
        }
        Node curr = head;
        while(curr != null && curr.next != null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return ;
        
    }
    

    public void print()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            
        }
        Node currentNode = head;
        while(currentNode != null)
        {
            System.out.print(currentNode.val + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void  main(String[] args) {
        // int val = 2; // key to delete
        removeDuplicate_item list = new removeDuplicate_item();
        list.push(1);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(3);
        
        list.print();
        System.out.println("After Delete the duplicate val");
        list.removeDup_itemFromSorted_list(0);
        list.print();
    }
}

