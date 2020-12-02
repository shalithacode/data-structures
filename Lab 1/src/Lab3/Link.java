package Lab3;

public class Link {
	
	public String name;
	public double avarage;
	public Link next;
	
	public Link(String name, double d) {
		super();
		this.name = name;
		this.avarage = d;
		this.next = null;
	}
	
	public void displayDetails() {
		
		System.out.println(name + "  " +avarage );
		
	}
	

}
