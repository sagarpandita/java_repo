
public class BinarySearchTree {
	
	Node root;
	Node base_root;
	public void add (int x){
		
		base_root=getNullNode(x);

	}
	
	public Node getNullNode(int x) {
		boolean flag = true;
		while (flag){
			if (root == null){
				
				root=new Node(x);
				flag =false;
				return root;
			}
			else {
				if (root.val >= x){
					if (root.left ==null){
						root.left=new Node(x);
						flag=false;
					}
					root= root.left;
				}
				else {
					if (root.right ==null){
						root.right=new Node(x);
						flag=false;
					}
					root= root.right;
				}
			}
		}
		return root;
	}
	
	public void printTree () {
		
	}
	
}