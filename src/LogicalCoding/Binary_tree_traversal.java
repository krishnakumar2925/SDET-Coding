package LogicalCoding;

import java.util.*;


class TreeNode{
	int val;
	TreeNode left, right;

	TreeNode(int val) {
	    this.val = val;
}
}


public class Binary_tree_traversal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root =new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		Binary_tree_traversal obj =new Binary_tree_traversal();
		System.out.println(obj.inOrderTraversal(root));
		

	}

	private List<Integer> inOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		inOrder(root,result);
		return result;
	}

	private void inOrder(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub
		if(root==null) return;
		inOrder(root.left,result);
		result.add(root.val);
		inOrder(root.right,result);
	}

}
