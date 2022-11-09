import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.w3c.dom.Node;
public class Singlyy_List {
    Node head;

    //create a node
    class Node
    {
        Integer data;
        Node next;

        Node(Integer data) // this is also called constructor
        {
            this.data = data;
            this.next = null;
        }
    } // done the node till here


    // Add the element at first position
    public void addFirst(Integer data)
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
    // Insert the node at a given position
     public void InsertItemAnyPosiion(int position, int data)
     {
        Node newNode = new  Node(data);
        if (position == 1)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        else
        {
            int count=1;
            Node previous = head;
            while(count < position-1)
            {
                previous = previous.next;
                count++;
            }
            // Create temperory Node called Current for storing resr of data after while loop false
            Node current = previous.next;
            previous.next = newNode;
            newNode.next = current;
            
        }
     }

    // Add last
    public void AddLast(Integer data)
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


    public static void main(String[] args) {
        Singlyy_List list = new Singlyy_List();
        list.addFirst(2);
        list.addFirst(4);
        list.printList(); 

        list.AddLast(6);
        list.printList();

        list.addFirst(8);
        list.printList();
        
        System.out.println("");
        System.out.println("insert the item into position");
        list.InsertItemAnyPosiion(2, 3);
        list.printList();


    }
}


