package linked_list.singly;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue)
    {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size=1;
        return head;
    }


    public void insertInLinkedList(int nodeValue, int position)
    {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null)
        {
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if (position == 0)
        {
            node.next = head;
            head = node;
        }
        else if (position >= size)
        {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else
        {
            Node tempNode = head;
            int index = 0;
            while(index < position -1)
            {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            nextNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node tempNode = head;
            for(int traverse=0; traverse<size; traverse++)
            {
                System.out.print(tempNode.value);
                if ( traverse != size-1)
                    System.out.print("->");
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    public boolean searchNode(int nodeValue)
    {
        if(head != null)
        {
            Node tempNode = head;
            for(int traverse=0; traverse<size; traverse++)
            {
                if(tempNode.value == nodeValue)
                {
                    System.out.println("Found Node at location "+traverse);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not Found !!");
        return false;
    }
}
