package linkedlist;

public class linkedlistBegAndEnd {
	
		 class Node{    
		        int data;    
		        Node next;    
		            
		        public Node(int data) {    
		            this.data = data;        
		        }    
		    }       
		    public Node head = null;    
		    public void display() {    
		          
		        Node current = head;    
		            
		        if(head == null) {    
		            System.out.println("List is empty");    
		            return;    
		        }    
		        System.out.println("Nodes of singly linked list: ");    
		        while(current != null) {        
		            System.out.print(current.data + " ");    
		            current = current.next;    
		        }    
		        System.out.println();    
		    }    
		    
		    public void insertBeg(int data)
		    {
		        Node temp = new Node(data);    
		        if(head == null) {    
		        	 head = temp; 
		        }
		        else
		        {
		        	temp.next=head;
		        	head = temp; 
		        }
		    }
		    
		    public void insertEnd(int data)
		    {
		        Node temp = new Node(data);    
		        if(head == null) {    
		        	 head = temp; 
		        }
		        
		        else
		        {
		        	Node last = head;
		        	while (last.next != null) { 
		                last = last.next; 
		            } 
		            last.next = temp; 
		        }
		    }
		    public void deletionBeg()
		    {
		    	if(head==null)
		    	{
		    		System.out.println("LIST IS EMPTY");
		    	}
		    	else
		    	{
		    		Node temp=head;
			    	head=head.next;
			    	temp=null;
		    	}
		    	
		    }
		    

		  
		    public void deletionEnd()
		    {
		    	if(head==null)
		    	{
		    		System.out.println("LIST IS EMPTY");
		    	}
		    	else
		    	{
		    		Node secondlast=head;
		    		while(secondlast.next.next!=null)
		    		{
		    			secondlast=secondlast.next;
		    		}
		    		Node last=secondlast.next;
		    		secondlast.next=null;
		    		last=null;
		    		
		    		
		    	}
		    }
		    
		    
		public static void main(String[] args) {
			linkedlistBegAndEnd ob= new linkedlistBegAndEnd();
			ob.insertBeg(2);
			ob.insertBeg(23);
			ob.insertBeg(20);
			ob.insertBeg(40);
			ob.display();
			ob.insertEnd(45);
			ob.insertEnd(50);
			ob.display();
			ob.deletionBeg();
	                ob.display();
			ob.deletionEnd();
			ob.display();
	        
			
		}

	}
