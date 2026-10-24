import java.util.Scanner;
public class Main{
	
	public static void main(String args[]) {
		
		Scanner scanner= new Scanner(System.in);
		
		SinglyLinkedList singlylist = new SinglyLinkedList();
		DoublyLinkedList doublylist = new DoublyLinkedList();
		
		
		int choice;
		
		do {
			System.out.println("\n===== LINKED LIST MANAGEMENT SYSTEM =====");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");


		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Singly Linked List Selected");
			
			int sChoice;
			do {
				System.out.println("\n********** Operation on Singly Linked List **********");
		        System.out.println("1. Insert at Beginning");
		        System.out.println("2. Insert at End");
		        System.out.println("3. Insert at Position");
		        System.out.println("4. Insert After a Node");
		        System.out.println("5. Insert Before a Node");
		        System.out.println("6. Delete from Beginning");
		        System.out.println("7. Delete from End");
		        System.out.println("8. Delete from Position");
		        System.out.println("9. Delete by Value");
		        System.out.println("10. Search");
		        System.out.println("11. Update");
		        System.out.println("12. Display");
		        System.out.println("13. Count Nodes");
		        System.out.println("14. Find Maximum");
		        System.out.println("15. Find Minimum");
		        System.out.println("16. Find Middle Element");
		        System.out.println("17. Reverse");
		        System.out.println("18. Sort");
		        System.out.println("19. Remove Duplicates");
		        System.out.println("20. Exit");
		        System.out.print("Enter the choice: ");

		        sChoice = scanner.nextInt();
		        
		        switch (sChoice) {
		        case 1:
		        	System.out.print("Enter value: ");
	                singlylist.insertAtBeginning(scanner.nextInt());
	                break;
	                
		        case 2:
		        	System.out.print("Enter value: ");
	                singlylist.insertAtEnd(scanner.nextInt());
	                break;
		        
		        case 3:
		        	System.out.print("Enter value: ");
		        	int val= scanner.nextInt();
		        	
		        	System.out.print("Enter position: ");
		        	int pos= scanner.nextInt();
		        	
	                singlylist.insertAtPosition(val, pos);
	                break;
	                
		        case 4:
		        	System.out.print("Enter value: ");
		        	int val1= scanner.nextInt();
		        	
		        	System.out.print("Enter position: ");
		        	int pos1= scanner.nextInt();
		        	
	                singlylist.insertAfterNode(val1, pos1);
	                break;
	                
		        case 5:
		        	System.out.print("Enter value: ");
		        	int val2= scanner.nextInt();
		        	
		        	System.out.print("Enter position: ");
		        	int pos2= scanner.nextInt();
		        	
	                singlylist.insertBeforeNode(val2, pos2);
	                break;
		        	
		        case 6:
		        	singlylist.deleteFromBeginning();
		        	break;
		        	
		        case 7:
		        	singlylist.deleteFromEnd();
		        	break;
		        	
		        case 8:
		        	System.out.print("Enter position: ");
		        	int pos3= scanner.nextInt();
		        	singlylist.deleteFromPosition(pos3);
		        	break;
		        	
		        case 9:
		        	System.out.print("Enter value: ");
		        	int val3= scanner.nextInt();
		        	singlylist.deletebyValue(val3);
		        	break;
		        	
		        case 10:
		        	System.out.print("Enter value: ");
		        	int val4= scanner.nextInt();
		        	singlylist.search(val4);
		        	break;
		        case 11:
		        	System.out.print("Enter value to be replaced: ");
		        	int val5= scanner.nextInt();
		        	System.out.print("Enter new value: ");
		        	int val6= scanner.nextInt();
		        	singlylist.update(val5, val6);
		        	break;
		        	
		        case 12:
		        	singlylist.display();
		        	break;
		        	
		        case 13:
		        	singlylist.countNodes();
		        	break;
		        	
		        case 14:
		        	singlylist.listMax();
		        	break;
		        	
		        case 15:
		        	singlylist.listMin();
		        	break;
		        	
		        case 16:
		        	singlylist.midElement();
		        	break;
		        	
		        case 17:
		        	singlylist.reverse();
		        	break;
		       /* case 18:
		            singlylist.sort();
		            break;
		        case 19:
		            singlylist.removeDuplicates();
		            break;*/
		        case 20:
		        	System.out.println("Returning to main menu...");
	                break;
	                
	            default:
	            	System.out.println("Invalid choice, Try again.");
	            	break;
	            	}
		        

			}while(sChoice != 20);
			
			break;
			
		case 2:
			System.out.println("Doubly Linked List Selected");
			int dChoice;
			do {
				System.out.println("\n********** Operation on Doubly Linked List **********");
		        System.out.println("1. Insert at Beginning");
		        System.out.println("2. Insert at End");
		        System.out.println("3. Insert at Position");
		        System.out.println("4. Insert After a Node");
		        System.out.println("5. Insert Before a Node");
		        
		        System.out.println("6. Delete from Beginning");
		        System.out.println("7. Delete from End");
		        System.out.println("8. Delete from Position");
		        System.out.println("9. Delete by Value");
		        
		        System.out.println("10. Search");
		        System.out.println("11. Update");
		        System.out.println("12. Display Forward");
		        System.out.println("13. Display Backward");
		        System.out.println("14. Count Nodes");
		        System.out.println("15. Find Maximum");
		        System.out.println("16. Find Minimum");
		        System.out.println("17. Find Middle Element");
		        System.out.println("18. Reverse");
		        System.out.println("19. Sort");
		        System.out.println("20. Remove Duplicates");
		        System.out.println("21. Exit");
		        System.out.print("Enter the choice: ");

		        dChoice = scanner.nextInt();
		        
		        switch (dChoice) {
		        case 1:
		        	System.out.print("Enter value: ");
	                doublylist.insertAtBeginning(scanner.nextInt());
	                break;
	                
		        case 2:
		        	System.out.print("Enter value: ");
	                doublylist.insertAtEnd(scanner.nextInt());
	                break;
		        
		        case 3:
		        	System.out.print("Enter value: ");
		        	int val= scanner.nextInt();
		        	
		        	System.out.print("Enter position: ");
		        	int pos= scanner.nextInt();
		        	
	                doublylist.insertAtPosition(val, pos);
	                break;
	                
		        case 4:
		        	System.out.print("Enter existing node value: ");
		        	int existingVal= scanner.nextInt();
		        	
		        	System.out.print("Enter new value: ");
		        	int newVal= scanner.nextInt();
		        	
	                doublylist.insertAfterNode(existingVal, newVal);
	                break;
	                
		        case 5:
		        	System.out.print("Enter existing node value: ");
		        	int existingVal1= scanner.nextInt();
		        	
		        	System.out.print("Enter new value: ");
		        	int newVal1= scanner.nextInt();
		        	
	               doublylist.insertBeforeNode(existingVal1, newVal1);
	                break;
	                
		        case 6:
		        	doublylist.deleteFromBeginning();
		        	break;
		        	
		        case 7:
		        	doublylist.deletefromEnd();
		        	break;
		        	
		        case 8:
		        	
		        	System.out.print("Enter position: ");
		        	int pos5= scanner.nextInt();
		        	doublylist.deletefromPosition(pos5);
		        	break;
		        	
		        case 9:
		        	System.out.print("Enter value: ");
		        	int val3= scanner.nextInt();
		        	doublylist.deletebyValue(val3);
		        	break;
		        	
		        case 10:
		        	System.out.print("Enter value: ");
		        	int val8= scanner.nextInt();
		        	doublylist.searchDoubly(val8);
		        	break;
		        
		        case 11:
		        	
		        	System.out.print("Enter new value: ");
		        	int val9= scanner.nextInt();
		        	System.out.print("Enter value: ");
		        	int newval= scanner.nextInt();
		        	doublylist.update(val9, newval);
		        	break;
		        	
		        case 12:
		        	doublylist.displayForward();
		        	break;
		        	
		        case 13:
		        	doublylist.displayBackward();
		        	break;
		        	
		        case 14:
		        	doublylist.countNodes();
		        	break;
		        	
		        case 15:
		        	doublylist.listMax();
		        	break;
		        	
		        case 16:
		        	doublylist.listMin();
		        	break;
		        	
		        case 17:
		        	doublylist.midElement();
		        	break;
		        	
		        case 18:
		        	doublylist.reverse();
		        	break;
		        	
		       /* case 19:
		            doublylist.sort();
		            break;

		        case 20:
		            doublylist.removeDuplicates();
		            break;*/
		        	
		        case 21:
		        	System.out.println("Returning to main menu...");
	                break;
	                
	            default:
	            	System.out.println("This operation will be connected next");
		       }
		}while(dChoice != 21);
			break;
			
		case 3:
			System.out.println("Exiting Program...");
			break;
			
		default:
			System.out.println("Invalid choice. Try again.");
		
			}
		} while(choice != 3);
		
		scanner.close();
	}
	
}