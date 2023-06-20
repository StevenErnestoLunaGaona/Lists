abstract class AbstractList implements List {

    //Atributos
    protected Node head;

    //Constructor
    public AbstractList() {
        this.head = null;
    }

    //Métodos
    public void display() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}