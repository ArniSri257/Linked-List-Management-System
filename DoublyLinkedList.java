class DoublyLinkedList{
	public DoublyNode head ;
	
	void insertAtBeginning(int val) {
		DoublyNode node = new DoublyNode(val);
		node.next=head;
		node.prev=null;
		if (head!=null) {
		head.prev=node;
		}
		head= node;
	}
	
	void insertAtEnd(int val) {
		if(head==null) {
			insertAtBeginning(val);
			return;
		}
		DoublyNode node = new DoublyNode(val);
		DoublyNode temp;
		temp= head;
		while(temp.next!=null) {
			temp= temp.next;
		}
		node.next=null;
		node.prev= temp;
		temp.next= node;
	}
	void insertAtPosition(int val , int pos) {
		if (pos<1) {
			System.out.println("Invalid position");
			return;
		}
		
		if(pos==1) {
			insertAtBeginning(val);
			return;
		}
		DoublyNode temp = head;
		
		for (int i=0; i<pos-1 && temp!=null ;i++) {
			temp= temp.next;
			}
		
		if (temp==null) {
			System.out.println("Position out of bound");
			return;
		}
		
		DoublyNode node = new DoublyNode(val);
		node.next= temp.next;
		node.prev= temp;
		
		if (temp.next!= null) {
			temp.next.prev=node;	
		}
		temp.next=node;
	}
	
	void insertAfterNode(int findVal, int val) {
		DoublyNode temp = head;
		
		while(temp!= null && temp.data!= findVal) {
			temp= temp.next;
		}
		if (temp== null) {
			System.out.println("Value not found in list");
			return;
		}
		
		DoublyNode node = new DoublyNode(val);
		node.next= temp.next;
		node.prev= temp;
		
		if (temp.next!= null) {
			temp.next.prev=node;	
		}
		temp.next=node;
	}
	
	void insertBeforeNode(int findVal, int val) {
	    DoublyNode temp = head;

	    while (temp != null && temp.data != findVal) {
	        temp = temp.next;
	    }
	    if (temp == null) {
	        System.out.println("Value not found in list");
	        return;
	    }
	    DoublyNode node = new DoublyNode(val);
	    node.next = temp;
	    node.prev = temp.prev;
	    if (temp.prev != null) {
	        temp.prev.next = node;
	    } else {
	        head = node;
	    }
	    temp.prev = node;
	}
	
	//////////////////////////////////////////////////
	void deleteFromBeginning() {
		if (head==null) {
			System.out.println("List is empty");
			return;
		}
		head= head.next;
		
		if (head!=null) {
			head.prev=null;
		}
	}
	void deletefromEnd() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		DoublyNode temp= head;
		while(temp.next!=null) {
			temp= temp.next;
		}
		temp.prev.next= null;
	}
	
	void deletefromPosition(int pos) {
		
		if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }
		if (pos<1) {
			System.out.println("Invalid position");
			return;
		}
		
		if(pos==1) {
			deleteFromBeginning();
			return;
		}
		DoublyNode temp = head;
		
		for (int i=0; i<pos-1 && temp!=null ;i++) {
			temp= temp.next;
		}
		if (temp==null || temp.next==null) {
			System.out.println("Position out of bound");
			return;
		}
		temp.next= temp.next.next;
		
		if (temp.next!= null) {
			temp.next.prev=temp;	
		}
	}
	void deletebyValue(int val) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		DoublyNode temp = head;
		
		while(temp != null && temp.data!= val ) {
			temp= temp.next;
		}
		if (temp==null) {
			System.out.println("Value not found in list");
			return;
		}
		if(temp.prev==null) {
			head= temp.next;
		}
		else {
			temp.prev.next= temp.next;
		}
		if (temp.next!= null) {
			temp.next.prev=temp.prev;	
		}
	}
	////////////////////////////////////////////
	void searchDoubly(int val) {
		DoublyNode temp= head;
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
		DoublyNode temp= head;
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
	void displayForward() {
		DoublyNode temp;
		temp=head;
		if (head == null) {
		    System.out.println("List is empty");
		    return;
		}
		while(temp!= null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("-------------");
	}
	
	void displayBackward() {
		DoublyNode temp;
		temp=head;
		if (head == null) {
		    System.out.println("List is empty");
		    return;
		}
		while(temp.next!= null) {
			temp=temp.next;
		}
		while(temp!= null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
		System.out.println("-------------");
	}
	
	void countNodes() {
		int count=0;
		DoublyNode temp= head;
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
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		DoublyNode temp = head;
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
		DoublyNode temp = head;
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
		DoublyNode fast= head;
		DoublyNode slow=head;
		while(fast!=null && fast.next!=null) {
			slow= slow.next;
			fast= fast.next.next;
		}
		System.out.println("Mid element is :"+slow.data);
	}
	void reverse() {
		DoublyNode prev=null;
		DoublyNode curr= head;
		DoublyNode next;
		
		while(curr!=null) {
			next = curr.next ;
			curr.next = prev;
			curr.prev= next;
			
			prev=curr;
			curr=next;
		}
		head= prev;
	}
}


	
	
