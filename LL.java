import org.w3c.dom.Node;

public class LL {

    Node head;

    //create a node
    class Node
    {
        String data;
        Node next;

        Node(String data) // this is also called constructor
        {
            this.data = data;
            this.next = null;
        }
    } // done the node till here


    // Add the element at first position
    public void addFirst(String data)
    {
       Node newNode = new Node(data); // create a node 
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void AddLast(String data)
    {
        Node newNode = new Node(data); // create a node 
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

    // print  all item in the list
    public void printList()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head; // create a curnode for traverse the node from start
            while (curNode != null)
            {
                System.out.print(curNode.data+ " --> ");
                curNode = curNode.next;
            }
            System.out.println("null");   
    }
    // delete first
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }
    // delete last node
    public void deleteLast()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null)
        {
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; 
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList(); 

        list.AddLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        System.out.println("Delete method... ");
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }
}
