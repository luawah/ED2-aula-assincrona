
public class Question4 {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		Integer val;
		Node prox;

		Node(Integer val) {
			this.val = val;
			prox = null;
		}
	}

	void removeDuplicates() {
		Node no = head;

		while (no != null) {
			Node temp = no;

			while (temp != null && temp.val.equals(no.val)) {
				temp = temp.prox;
			}

			no.prox = temp;
			no = no.prox;
		}
	}

	public void push(int val) {

		Node no = new Node(val);

		no.prox = head;

		head = no;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.prox;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Question4 llist = new Question4();
		llist.push(1);
		llist.push(1);
		llist.push(2);
		llist.push(2);
		llist.push(3);
		llist.push(3);

		System.out.println("LinkedList antes da remoção: ");
		llist.printList();

		llist.removeDuplicates();

		System.out.println("LinkedList após da remoção:");
		llist.printList();
	}
}

