package lab7_splayTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * 1 write a method that returns a string that contains values visited during a 'find'
 * 		add each node search into a string and print at the end
 * 2
 * 
 * 
 */

public class driver {

	public static void main(String[] args) throws FileNotFoundException {
	TreeNode root = new TreeNode();
	
     int nodevalue;
	
	Scanner infile = new Scanner (new File ("bst.txt"));
	
	
	nodevalue = infile.nextInt();
	
	root.setData(nodevalue);
	
	BinaryTree tree = new BinaryTree();
	tree.root = root;
	
	tree.find(root, 1);
	
	infile.nextLine();
	
	while(infile.hasNextLine()) {
		
		String children = infile.nextLine();
		
		Scanner parseline = new Scanner (children);
		
		nodevalue = parseline.nextInt();
		
		
		/*
8
8 4 12 
4 1 5 
12 10 15
15 14 25
*/
		TreeNode toBeUpdated = tree.find(root, nodevalue);
		//System.out.println("To be updated " + toBeUpdated.data);
		while(parseline.hasNextInt()) {
			
			
			tree.Insert(toBeUpdated, parseline.nextInt());
			
			 
			
		}
		
		
		
	
	
	}
	
	System.out.print("in order traversal\n");
	tree.printinordertraversal(root);
	
	System.out.print("\npre order traversal\n");
	tree.preorder(root);
	
	
	
	
   }
}
