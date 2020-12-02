package Lab4;

public class Tree {

	private Node root;

	public Tree() {
		
		this.root = null;
	}
	
	public void insert(String name, int no) {
		
		Node Newnode = new Node();
		Newnode.name = name;
		Newnode.no = no;
		
		if(root == null) {
			root = Newnode;
		}else {
			
			Node current = root;
			Node parent;
			
			while(true) { // always true
				parent = current;
				if(no<current.no) {
					current = current.leftchild;
					if(current == null) {
						parent.leftchild = Newnode;
						return;
					}
				}else {current = current.rightchild;
				if(current == null) {
					parent.rightchild = Newnode;
					return;
					
					}
				}
			}
	
		}
	}
	
	private void inorder(Node localroot) {//left, root, right 
		if(localroot != null) {
			inorder (localroot.leftchild);
			localroot.displayNode();
			inorder (localroot.rightchild);
		}
		
	}
	public void Traverseinoder() {
		inorder(root);
	}
	
	private void preorder(Node localroot) {//root, left, right 
	if(localroot != null) {
		localroot.displayNode();
		preorder (localroot.leftchild);
		preorder (localroot.rightchild);
		}
	}
	public void Traversepreoder() {
		preorder(root);
	}
	
	private void postorder(Node localroot) {// left, right,root 
		if(localroot != null) {
			
			preorder (localroot.leftchild);
			preorder (localroot.rightchild);
			localroot.displayNode();
			}
		}
	public void Traversepostoder() {
			postorder(root);
		}
	
	
	private Node findrecursive(Node localroot, int no) {
		
		if(localroot == null) {
			return null;
		}
		else if (localroot.no == no) {
			System.out.println(localroot.name);
			return localroot;	
		}
		else if(localroot.no<no) {
			
			return findrecursive(localroot.leftchild,no);
		}
		else
			return findrecursive(localroot.rightchild,no);
	}
	
	public Node callrecursive(int no) {
		return findrecursive(root, no);
	}
	
	public Node find(int no) {
        Node current = root;

        while (current.no != no) {
            if(no < current.no) {
                current = current.leftchild;
            } else {
                current = current.rightchild;
            }

            if(current == null) {
                return null;
            }
        }
        System.out.println(current.name);
        return current;
    }
	
	public void deleteall() {
		root = null;
		
	}
	
}	