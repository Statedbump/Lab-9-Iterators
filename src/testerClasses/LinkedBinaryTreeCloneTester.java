package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;

public class LinkedBinaryTreeCloneTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		LinkedBinaryTree<Integer> T = Utils.buildExampleTreeAsLinkedBinaryTree(), 
		cloneofT = Utils.buildExampleTreeAsLinkedBinaryTree(); 

		Utils.displayTree("Original t", T); 
		cloneofT = T.clone();
		Utils.displayTree("Clone of t", cloneofT); 
		
	}

}
