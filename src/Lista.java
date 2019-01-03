
public class Lista {
	public Node head, tail;

	public Lista() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addToHead(Film i) {
		if (isEmpty()) {
			head = tail = new Node(i);
		} else {
			head = new Node(i, head, null);
			head.next.prev = head;
		}
	}

	public void addToTail(Film i) {
		if (isEmpty()) {
			head = tail = new Node(i);
		} else {
			tail = new Node(i, null, tail);
			tail.prev.next = tail;
		}
	}

	public void deleteFromHead() {
		if (isEmpty()) {
			System.out.println("Lista je prazna.");
		} else {
			if (head == tail) {
				head = tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}
			System.out.println("Element je obrisan.");
		}
	}

	public void deleteFromTail() {
		if (isEmpty()) {
			System.out.println("Lista je prazna.");
		} else {
			if (head == tail) {
				head = tail = null;
			} else {
				tail = tail.prev;
				tail.next = null;
			}
		}
	}

	public int numOfEl() {
		int i = 0;
		for (Node tmp = head; tmp != null; tmp = tmp.next) {
			i++;
		}
		return i;
	}

	public void deleteElement(int poz) {
		if (poz == 1) {
			deleteFromHead();
		} else {
			if (poz == numOfEl()) {
				deleteFromTail();
			} else {
				int br = 2;
				Node tmp = head.next;
				while (br < poz) {
					tmp = tmp.next;
					br++;
				}
				Node prev = tmp.prev;
				Node next = tmp.next;
				prev.next = next;
				next.prev = prev;

			}
		}

	}

}
