package lab7_splayTree;

public class BinaryTree {
	
	TreeNode root;
	
	
	
	public BinaryTree() {
		root = null;
		
	}
	
	public TreeNode find(TreeNode root, int value) {
		if(root == null || root.data == value) {
			return root;
		}
		
		if(value < root.data) {
			return find(root.left, value);
		}
		
		
		return find(root.right, value);
		
	}
	
	
	public TreeNode Insert(TreeNode updatednode, int value) {
		
		if(updatednode == null) {
			TreeNode n = new TreeNode();
			n.setData(value);
			return n;
		}
		
		if(value < updatednode.data) {
			return updatednode.left = Insert(updatednode.left, value);
		}
		
		if(value > updatednode.data) {
			return updatednode.right = Insert(updatednode.right, value);
		}
		
		
		return updatednode;
		
	}
	
	public void printinordertraversal(TreeNode node) {
		
		if(node == null) {
			return;
		}
		
		printinordertraversal(node.left);
		
		System.out.print(node.data + " ");
		
		printinordertraversal(node.right);
		
		
		
	}
	
	public void preorder(TreeNode node) {
		
		if (node== null)
			return;
		
		System.out.print(node.data + " ");
		
		preorder(node.left);
		
		preorder(node.right);
		
		
		
	}
	

}
