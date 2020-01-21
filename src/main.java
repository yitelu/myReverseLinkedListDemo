public class main {

    public static void main(String[] args) {

        myList list = new myList();

        list.head = new myList.Node(1);
        list.head.next = new myList.Node(2);
        list.head.next.next = new myList.Node(3);
        list.head.next.next.next = new myList.Node(4);

        System.out.println("original Linked List: ");
        printList(list.head);

        list.head = list.reverse(list.head);
        System.out.println(" ");
        System.out.println("Reversed linked list: ");
        printList(list.head);
    }

    public static void printList(myList.Node node){

        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
