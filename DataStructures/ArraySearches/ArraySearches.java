package lab7;

import java.util.Scanner;
import java.io.*;

public class Lab7 {

	static String[] array;

	public static void main(String[] args) {
		File loadFile = new File("C:\\words.txt"); 
		File saveFile = new File("C:\\sorted.txt"); 

		Scanner myscanner = new Scanner(System.in);
		System.out.println("How many items would you like to sort?");
		int nElems = myscanner.nextInt();
		array = new String[nElems];
		
		FileIO myFileIO = new FileIO();
		array = myFileIO.getContents(loadFile, nElems);
		
		System.out.println("What type of sorting method do u wanna do>>");
		String answer = myscanner.next();
		answer = answer.toUpperCase();
		long start = System.currentTimeMillis();

		if (answer.charAt(0) == 'B') {
			bubblesort();

			try {
				myFileIO.setContents(saveFile, array);
			} catch (Exception e) {
			}
		} else if (answer.charAt(0) == 'S') {
			selectionsort();

			try {
				myFileIO.setContents(saveFile, array);
			} catch (Exception e) {
			}
		} else {
			insertionsort();

			try {
				myFileIO.setContents(saveFile, array);
			} catch (Exception e) {
			}
		}
		long elaspe = System.currentTimeMillis() - start;
		System.out.println("It took " + elaspe + " Milieseconds to complete");
	}

	public static void bubblesort() {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].charAt(0) > array[j].charAt(0)) {
					swap(i, j);
				}
				if (array[i].charAt(0) == array[j].charAt(0)) {
					if (array[i].charAt(1) > array[j].charAt(0)) {
						swap(i, j);
					}
				}

			}

		}

	}

	public static void swap(int s1, int s2) {
		String temp = array[s1];
		array[s1] = array[s2];
		array[s2] = temp;

	}

	public static void selectionsort() {

		
			int min;
			for (int outer = 0; outer < array.length; outer++) {
				min = outer;
				for (int i = outer + 1; i < array.length; i++) {
					if (array[i].charAt(0) < array[min].charAt(0)) {
						min = i;
					}
				}
				swap(outer, min);
				
			}
		}
	

	public static void insertionsort() {

		for (int outer = 1; outer < array.length; outer++) {
			String temp = array[outer]; 
			int inner = outer; 
			while (inner > 0 && array[inner - 1].charAt(0) >= temp.charAt(0)) {
				array[inner] = array[inner - 1];
				inner--;
			} 
			array[inner] = temp;
		}
	}
}
