package Lab3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Link l1= new Link("student 1", 80.1);
		Link l2= new Link("student 2", 54.1);
		Link l3= new Link("student 3", 45.01);
		
		l1.next = l2;
		l2.next = l3;
		
		l1.displayDetails();
		*/
		
		LinkList mylist = new LinkList();
		mylist.insertFirst("student 1", 50.12);
		mylist.insertFirst("student 2", 54.1);
		mylist.insertFirst("student 3", 45.01);
		mylist.insertFirst("student 4", 85.02);
		mylist.insertFirst("student 5", 45.101);
		mylist.insertFirst("student 6", 47.11);
		
		
		mylist.deleteLink("student 4");
		mylist.displayLinks();
	}

}
