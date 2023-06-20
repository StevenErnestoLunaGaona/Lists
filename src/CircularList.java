class CircularList extends AbstractList {

    //Métodos
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
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

            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head;
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
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            if (head == head.next) {
                head = null;
            } else {
                current.next = head.next;
                head = head.next;
            }
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

            current.next = current.next.next;
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