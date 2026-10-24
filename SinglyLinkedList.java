

class SinglyLinkedList{
	public Node head;
	
	void display() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data);

	        if (temp.next != null) {
	            System.out.print(" -> ");
	        }
	        temp = temp.next;
	    }

	    System.out.println();
	}
	void insertAtBeginning(int val) {
		Node node= new Node(val);
		node.next= head;
		head= node;
	}
	
	void insertAtEnd(int val) {
		if (head==null) {
			insertAtBeginning(val);
			return;
		}
		Node node= new Node(val);
		Node temp;
		temp= head;
		while(temp.next!=null) {
			temp= temp.next;
			}
		temp.next=node;
	}
	
	void insertAtPosition(int val,int pos) {
		if(pos==1) {
			insertAtBeginning(val);
			return;
		}
		if(pos<1) {
			System.out.println("Invalid position");
			return;
		}
		Node temp = head;
		for(int i=1; i < pos-1 && temp != null; i++) {
			temp= temp.next;
		}
		if(temp==null) {
			System.out.println("Position out of bound");
			return;
		}
		Node newNode = new Node(val);
		newNode.next= temp.next;
		temp.next= newNode;
		}
	
	void insertAfterNode(int val,int pos) {
		if(pos<1) {
			System.out.println("Invalid position");
			return;
		}
		
		Node temp = head;
		
		for(int i=1; i<pos && temp !=null; i++) {
			temp= temp.next;
		}
		if(temp==null) {
			System.out.println("Position out of bound");
			return;
		}
		Node newNode = new Node(val);
		newNode.next= temp.next;
		temp.next= newNode;
		}
	
	void insertBeforeNode(int val,int pos) {
		if(pos<1) {
			System.out.println("Invalid position");
			return;
		}
		if(pos==1) {
			insertAtBeginning(val);
			return;
		}
		
		Node temp = head;
		for(int i=1; i<pos-1 && temp !=null; i++) {
			temp= temp.next;
		}
		
		if(temp==null || temp.next ==null) {
			System.out.println("Position out of bound");
			return;
		}
		Node newNode = new Node(val);
		newNode.next= temp.next;
		temp.next= newNode;
		}
	
	
	
	///////////////////////////////////////////////////////////////////
	

	void deleteFromBeginning() {
		
		if (head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp= head;
		head= temp.next;
	}
	
	void deleteFromEnd() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next ==null) {
			head= null;
			return;
		}
		
		Node temp =head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	void deleteFromPosition(int pos) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if (pos==1){
			deleteFromBeginning();
			return;
		}
		if (pos<1){
			System.out.println("position invalid");
			return;
		}
		
		Node temp = head;
		for(int i=1; i<pos-1 && temp!= null; i++) {
			temp =temp.next;
			}
		
		if (temp == null || temp.next==null) {
			System.out.print("Position out of bound");
			return;
			
		}
		temp.next= temp.next.next;
		
	}
	
	void deletebyValue(int val) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(head.data==val) {
			deleteFromBeginning();
			return;
		}
		
		Node temp= head;
		
		while(temp.next!=null && temp.next.data!= val) {			temp=temp.next;
		}
		
		if (temp.next==null) {
			System.out.println("Value not found in list");
			return;
		}
		temp.next= temp.next.next;
	}
	
	///////////////////////////////////////////////////////////////////
	void search(int val) {
		Node temp= head;
		int position =1;
		while(temp!= null && temp.data!=val ) {
			temp= temp.next;
			position++;
		}
		if (temp!=null) {
			System.out.println("Value at :"+position);
		}
		else if(temp==null) {
		System.out.println("Value not in list");
	}
}
	void update(int val,int newVal) {
		Node temp= head;
		while(temp!= null && temp.data!=val ) {
			temp= temp.next;
			}
		if (temp!=null) {
			temp.data= newVal;
		}
		else if(temp==null) {
		System.out.println("Value not in list");
		}
	}	
	void countNodes() {
		int count=0;
		Node temp= head;
		
		while(temp!=null) {
			temp= temp.next;
			count++;
		}
		if (count ==0) {
			System.out.println("Empty list");
		}
	
		System.out.println("Number of nodes:" +count);
	}
	
	void listMax() {
		if (head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node temp = head;
		int max =temp.data;
		
		while(temp!=null) {
			if(temp.data>max) {
				max= temp.data;
			}
			temp= temp.next;
		}
		System.out.println("Maximum:" +max);
	}
	void listMin() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node temp = head;
		int min =temp.data;
		
		while(temp!=null) {
			if(temp.data<min) {
				min= temp.data;
			}
			temp= temp.next;
		}
		System.out.println("Minimum:" +min);
	}
	
	void midElement() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node fast= head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null) {
			slow= slow.next;
			fast= fast.next.next;
		}
		System.out.println("Mid element is :"+slow.data);
	}
	
		void reverse() {
		Node prev=null;
		Node curr= head;
		Node next;
		
		while(curr!=null) {
			next = curr.next ;
			curr.next = prev;
			
			prev=curr;
			curr=next;
			}
		head=prev;
		display();
	}
		
		/*void sort() {
			Node current = head;
			
			while(current!=null) {
				current = head;
				while(current.next!=null) {
					
					if (current.data > current.next.data) {
						int temp= current.data;
						current.data= current.next.data;
						current.next.data = temp;
					}
					current = current.next;}
				
				
			}
		}
		*/
		
}

