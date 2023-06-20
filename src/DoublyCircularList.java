class DoublyCircularList extends AbstractList {

    //Métodos
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            head.prev = newNode;
            last.next = newNode;
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
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
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
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void deleteNode(int index) {
        if (index < 0 || head == null) {
            System.out.println("Índice inválido o la lista está vacía.");
            return;
        }

        if (index == 0) {
            if (head.next == head) {
                head = null;
            } else {
                head.next.prev = head.prev;
                head.prev.next = head.next;
                head = head.next;
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

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        System.out.print(current.data + " ");
        current = current.next;

        while (current != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
