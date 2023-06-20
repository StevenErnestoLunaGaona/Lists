class LinkedList extends AbstractList {

    //Métodos
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertNode(int index, int data) {
        if (index < 0) {
            System.out.println("Índice inválido.");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;
            while (current != null && count < index - 1) {
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Índice inválido.");
                return;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteNode(int index) {
        if (index < 0 || head == null) {
            System.out.println("Índice inválido o la lista está vacía.");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            int count = 0;
            while (current != null && count < index - 1) {
                current = current.next;
                count++;
            }

            if (current == null || current.next == null) {
                System.out.println("Índice inválido.");
                return;
            }

            current.next = current.next.next;
        }
    }
}