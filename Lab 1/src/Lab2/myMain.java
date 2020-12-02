package Lab2;

import java.util.Scanner;

public class myMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	QueueX q1 = new QueueX(5);
		Scanner id = new Scanner(System.in); 
		
		for(int i=0;i<5;i++) {
	    System.out.println("Enter Id: ");
	    q1.insert(id.nextInt());
	    
		}
		
		
		for(int i=0;i<5;i++) {
			int j = q1.remove();
			System.out.println(j);
		}
	                 */
		QueueX q = new QueueX(5);
		Scanner id = new Scanner(System.in); 
		
		for(int i=0;i<5;i++) {
	    System.out.println("Enter Id: ");
	    q.insert(id.nextInt());
	    
		}
		QueueX q1 = new QueueX(5);
		QueueX q2 = new QueueX(5);
		int num;
		for(int i=0;i<5;i++) {
	    num = q.remove();
	    if(num % 2 == 0)
	    q1.insert(num);
	    else q2.insert(num);
	    
		}
		System.out.println("EVEN");
		while(!q1.isEmpty()) {
			System.out.println( q1.remove());
		}
		
		System.out.println("-----------------");
		
		System.out.println("ODD");
		while(!q2.isEmpty()) {
			System.out.println(q2.remove());
		}
		
	}
}
