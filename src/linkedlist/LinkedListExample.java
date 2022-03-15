package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListExample ex = new LinkedListExample();

		TreeNode node1 = ex.new TreeNode("root");
		TreeNode node2 = node1.addChild(ex.new TreeNode("Women"));
		TreeNode node3 = node2.addChild(ex.new TreeNode("Shoes"));
		TreeNode node4 = node2.addChild(ex.new TreeNode("Accessories"));
		TreeNode node6 = node4.addChild(ex.new TreeNode("Watch"));
		TreeNode node7 = node4.addChild(ex.new TreeNode("Umbrella"));
		TreeNode node5 = node2.addChild(ex.new TreeNode("Clothes"));
		TreeNode node8 = node5.addChild(ex.new TreeNode("Dresses"));

		TreeNode node9 = node1.addChild(ex.new TreeNode("Men"));
		TreeNode node10 = node9.addChild(ex.new TreeNode("Clothes"));
		TreeNode node11 = node9.addChild(ex.new TreeNode("Shoes"));
		TreeNode node12 = node10.addChild(ex.new TreeNode("Shirts"));
		TreeNode node13 = node11.addChild(ex.new TreeNode("Sport"));
		TreeNode node14 = node11.addChild(ex.new TreeNode("Casual"));
		TreeNode node15 = node11.addChild(ex.new TreeNode("Outdoor"));

		// printTree(node1);
		
		LinkedList<Node> categoryLinkedList = CachedCategories.getInstance();

		ex.createFlatteningTree(node1, ex);
		

		for (Node node : categoryLinkedList) {
			System.out.print(node.category + "(" + node.depth + ") - ");
		}
	}

	public static void printTree(TreeNode root) {

		System.out.println(root.categoryName + " " + root.depth);

		for (TreeNode node : root.childrenNodes) {
			printTree(node);
		}

	}

	public void createFlatteningTree(TreeNode root, LinkedListExample ex) {

		LinkedList<Node> categoryLinkedList = CachedCategories.getInstance();

		for (TreeNode node : root.childrenNodes) {
			Node newNode = ex.new Node(node.categoryName, node.depth);
			categoryLinkedList.add(newNode);
			createFlatteningTree(node, ex);
		}

	}

	public class TreeNode {

		public String categoryName;
		public List<TreeNode> childrenNodes = new ArrayList<>();
		public TreeNode parent = null;
		public int depth = 0;

		public TreeNode(String categoryName) {
			this.categoryName = categoryName;
		}

		public TreeNode addChild(TreeNode node) {
			node.parent = this;
			node.depth = node.parent.depth + 1;
			this.childrenNodes.add(node);
			return node;
		}

	}

	public class Node {
		String category;
		int depth;

		public Node(String category, int depth) {
			this.category = category;
			this.depth = depth;
		}
	}

	public static class CachedCategories {

		private static LinkedList<Node> categoryLinkedList = null;

		private synchronized static void createInstance() {
			if (categoryLinkedList == null)
				categoryLinkedList = new LinkedList<>();
		}

		public static LinkedList<Node> getInstance() {
			if (categoryLinkedList == null)
				createInstance();

			return categoryLinkedList;
		}

	}

}
