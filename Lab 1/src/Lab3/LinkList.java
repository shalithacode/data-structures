package Lab3;

public class LinkList {

	private Link first;

	public LinkList() {
		
		this.first = null;
	}
	
	public boolean isEmpty() {
		
		return(first == null);
	}
	
	public void insertFirst(String name,double avg) {
		//create link
		Link newlink = new Link(name,avg);
		//link the new link to the existing link list
		newlink.next = first;
		//make the newLink as the first link in the link list
		first = newlink;
		
	}
	
	public Link deleteFirst(){
		
		Link temp = first; // save the refereance of the current first to temp
		first = first.next; // change the current first referance to the next available link
		
		return temp;
		
	}
	
public void displayLinks() {
	
	Link current  = first;	
		while(current != null) {
			current.displayDetails();
			current = current.next;	
		}
		
	}
public Link deleteLink(String name) {
	
	Link current = first ;
	Link previous = first;
	
	while(current.name != name) {
		if(current.next == null)
			return null;
		else
			
		{
			previous = current;
			current = current.next;
		}
	}
		if(current == first) 
			first = first.next;
		else
			previous.next = current.next;
		
		return current;

	
	
	
}
}
