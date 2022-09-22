package linked_list.singly;

public class Main {
    public static void main(String[] args)
    {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(10);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(20,1);
        sLL.insertInLinkedList(30,2);
        sLL.insertInLinkedList(40,3);
        sLL.insertInLinkedList(50,4);
        //System.out.println(sLL.head.next.next.value);
        sLL.traverseSinglyLinkedList();
        sLL.searchNode(30);
    }
}
