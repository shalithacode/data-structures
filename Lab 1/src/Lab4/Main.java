package Lab4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tree t1 = new Tree();
		t1.insert("Student 1", 01);
		t1.insert("Student 2", 02);
		t1.insert("Student 3", 03);
		t1.insert("Student 4", 04);
		t1.insert("Student 5", 05);
		
		System.out.println("Inorder traverse : ");
		t1.Traverseinoder();
		
		System.out.println("Preorder traverse : ");
		t1.Traversepreoder();
		
		System.out.println("Postorder traverse : ");
		t1.Traversepostoder();
		
		t1.find(04);
	}

}
