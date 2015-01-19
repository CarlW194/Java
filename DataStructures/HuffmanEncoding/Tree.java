package huffman;

import java.io.*;
import java.util.*; // for Stack class

public class Tree implements Comparable<Tree> {
	public Node root;
	public int frequency = 0;

	public Tree() {
		root = null;
	}

	public int compareTo(Tree object) { //
		if (frequency - object.frequency > 0) {
			return 1;
		} else if (frequency - object.frequency < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	String path = "error";

	public String getCode(char letter) {
		inOrder(root, letter, ""); // call an inOrder traversal, starting at the
									// root, looking for this letter
		return path; // return the path that results

	}

	private void inOrder(Node localRoot, char letter, String path) {
		if (localRoot != null) {
			if (localRoot.letter == letter) {
				this.path = path;
			} else {
				inOrder(localRoot.leftChild, letter, path + "0");
				inOrder(localRoot.rightChild, letter, path + "1");
			}
		}
		return;
	}

}
