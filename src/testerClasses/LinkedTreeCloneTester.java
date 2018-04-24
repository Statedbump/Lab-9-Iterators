package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedTree;

public class LinkedTreeCloneTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		//Tester class for Exercise 7
		LinkedTree<Integer> t = new LinkedTree<>();
		LinkedTree<Integer> cloneOft;

		Utils.displayTree("Original t", t); 
		cloneOft = t.clone();
		Utils.displayTree("Clone of t", cloneOft); 
		
	}

}
