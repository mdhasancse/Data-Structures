public class stack {
    Node head;
    class Node{
        int data;
        stack.Node prev;
       

        Node(int data)
        {
            this.data = data;
            this.prev = null;
        }
    }
    public void AddTOStack(int data)
    {
        Node Newval = new Node(data);
        if(head == null)
        {
            head = Newval;
            return;
        }
        Newval.prev = head;
        head = Newval;
    }


    public void print()
    {
        if(head == null)
        {
            System.out.println("There is no value in the stack");
        }
        Node curNode = head;
        while(curNode != null)
        {
            System.out.println(curNode.data + " ");
            curNode = curNode.prev;
        }
    }
    
    
    
    public void deleteFromStack()
    {
        if(head == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        head = head.prev;
        // if (head.prev == null)
        // {
        //     head=null;
        //     return;
        // }
        // Node SecondLast = head;
        // Node LastNode = head.prev;
        // while(LastNode.prev != null)
        // {
        //     LastNode = LastNode.prev;
        //     SecondLast = SecondLast.prev;
        // }
        // SecondLast.prev = null;
    }
    
    
    public static void main(String[] args) {
        
        stack valStack = new stack();
        valStack.AddTOStack(2);
        valStack.AddTOStack(5);
        valStack.AddTOStack(7);
        valStack.print();
        System.out.println("After delete first item from stack");

        valStack.deleteFromStack();
        valStack.print();
    }
}
