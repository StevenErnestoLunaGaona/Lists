public class Main {
    public static void main(String[] args) {

        // Lista Enlazada
        System.out.println("=== Lista enlazada ===");
        List linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.display();

        linkedList.insertNode(1, 4);
        linkedList.display();

        linkedList.deleteNode(2);
        linkedList.display();

        // Lista Doblemente Enlazada
        System.out.println("\n=== Lista doblemente enlazada ===");
        List doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(3);
        doublyLinkedList.display();

        doublyLinkedList.insertNode(1, 4);
        doublyLinkedList.display();

        doublyLinkedList.deleteNode(2);
        doublyLinkedList.display();

        // Lista Circular
        System.out.println("\n=== Lista circular ===");
        List circularList = new CircularList();
        circularList.addNode(1);
        circularList.addNode(2);
        circularList.addNode(3);
        circularList.display();

        circularList.insertNode(1, 4);
        circularList.display();

        circularList.deleteNode(2);
        circularList.display();

        // Lista Doblemente Circular
        System.out.println("\n=== Lista doblemente circular ===");
        List doublyCircularList = new DoublyCircularList();
        doublyCircularList.addNode(1);
        doublyCircularList.addNode(2);
        doublyCircularList.addNode(3);
        doublyCircularList.display();

        doublyCircularList.insertNode(1, 4);
        doublyCircularList.display();

        doublyCircularList.deleteNode(2);
        doublyCircularList.display();
    }
}