package huffman;

import java.util.*;

public class Huffman {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your sentence: ");
		String sentence = in.nextLine();
		String binaryString = ""; // this stores the string of binary code

		for (int i = 0; i < sentence.length(); i++) { // go through the sentence
			int decimalValue = (int) sentence.charAt(i); // convert to decimal
			String binaryValue = Integer.toBinaryString(decimalValue); // convert
																		// to
																		// binary
			for (int j = 7; j > binaryValue.length(); j--) {
				binaryString += "0"; // this loop adds in leading
										// zeroes
			}
			binaryString += binaryValue + " "; // add to the string of binary
		}
		System.out.println(binaryString); // print out the binary

		int[] array = new int[256]; // an array to store all the frequencies

		for (int i = 0; i < sentence.length(); i++) { // go through the sentence
			array[(int) sentence.charAt(i)]++; // increment the appropriate
												// frequencies

		}

		PriorityQueue<Tree> PQ = new PriorityQueue<Tree>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.println("'" + (char) i + "' appeared " + array[i]
						+ ((array[i] == 1) ? " time" : " times"));
				Tree myTree = new Tree(); 
				myTree.frequency = array[i];
				myTree.root = new Node(); 
				myTree.root.letter = (char) i;
				PQ.add(myTree);
			}
		}

		while (PQ.size() > 1) {
			Tree firstTree = PQ.poll();
			Tree secondTree = PQ.poll();
			Tree comboTree = new Tree();
			comboTree.frequency = firstTree.frequency + secondTree.frequency;
			comboTree.root = new Node();
			comboTree.root.leftChild = firstTree.root;
			comboTree.root.rightChild = secondTree.root;
			PQ.add(comboTree);
		}

		Tree HuffmanTree = PQ.poll();
		int totalLength = 0;
		String theCode;
		for (int i = 0; i < sentence.length(); i++) {
			theCode = HuffmanTree.getCode(sentence.charAt(i));
			System.out.print(theCode + " ");
			totalLength += theCode.length();
		}
		System.out.println("\nCompressed size is " + totalLength + " bits / "
				+ sentence.length() * 7 + " bits = "
				+ (int) ((totalLength * 100) / (sentence.length() * 7))
				+ " %\n");
	}
}
