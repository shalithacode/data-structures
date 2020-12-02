package Lab1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	StackX my = new StackX(5);
		my.push('A');
		my.push('B');
		my.push('C');
		my.push('D');
		my.push('E');
		
		System.out.println(my.peek());
		for(int i = 1; i<=5;i++) {
		System.out.println(my.pop());
		}
		System.out.println(my.Isempty());
		
		while(!my.Isempty())
		{
			System.out.println(my.pop());
		}   */
		
		
		System.out.println("Enter :");
		Scanner obj = new Scanner(System.in);
		String st = obj.nextLine();
		
		int len = st.length();
		StackX mystack = new StackX(len);
		
		for(int i=0;i<len;i++) {
			char c = st.charAt(i);
			if(c== '(' ) 
				mystack.push(c);
			
			else if(c== ')' )
				mystack.pop();
			
			
		}
		if (mystack.Isempty())
		System.out.println("Valid");
		else System.out.println("InValid");
	}

}
