package lists;

public class LinkedListPractice {

	public static void main(String[] args) {

		CustomLinkedList linkedLi = new CustomLinkedList();
		
		Node firstNode = new Node(3);
		Node secNode = new Node(4);
		Node thirdNode = new Node(5);
		Node fourthNode = new Node(6);
		
		linkedLi.head = firstNode;
		firstNode.next = secNode;
		secNode.next = thirdNode;
		thirdNode.next = fourthNode;
		
		linkedLi.displayContents();
		linkedLi.deleteBackHalf();
		linkedLi.displayContents();
	}

}
