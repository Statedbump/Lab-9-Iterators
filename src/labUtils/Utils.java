package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4);
		Position<Integer> first = t.addChild(t.root(), 9);
		Position<Integer> second= t.addChild(t.root(), 20);
		t.addChild(first, 7);
		t.addChild(first, 10);
		
		Position<Integer>cOfsec = t.addChild(second, 15);
		Position<Integer>c2Ofsec = t.addChild(second, 21);
		
		t.addChild(cOfsec, 12);
		Position<Integer>cOfsec2 = t.addChild(cOfsec,17);
		t.addChild(cOfsec2, 19);
		
		Position<Integer>c2Ofsec2 = t.addChild(c2Ofsec,40);
		t.addChild(c2Ofsec2, 30);
		t.addChild(c2Ofsec2, 45);
				
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		Position<Integer> first = t.addLeft(t.root(), 9);
		Position<Integer> second= t.addRight(t.root(), 20);
		t.addLeft(first, 7);
		t.addRight(first, 10);
		
		Position<Integer>cOfsec = t.addLeft(second, 15);
		Position<Integer>c2Ofsec = t.addRight(second, 21);
		
		t.addLeft(cOfsec, 12);
		Position<Integer>cOfsec2 = t.addRight(cOfsec,17);
		t.addLeft(cOfsec2, 19);
		
		Position<Integer>c2Ofsec2 = t.addLeft(c2Ofsec,40);
		t.addLeft(c2Ofsec2, 30);
		t.addRight(c2Ofsec2, 45);
		return t; 
	}


}
