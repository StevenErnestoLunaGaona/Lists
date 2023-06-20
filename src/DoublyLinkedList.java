class DoublyLinkedList extends AbstractList {

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
            newNode.prev = current;
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
            if (head != null) {
                head.prev = newNode;
            }
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
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
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
            if (head != null) {
                head.prev = null;
            }
        } else {
            Node current = head;
            int count = 0;
            while (current != null && count < index) {
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Índice inválido.");
                return;
            }

            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }
}