package assignment;

import java.util.Arrays;

public class SortWords {

	static void sort(String str) {

		final char SIGNS[] = { ';', '.', ',', '`', '?', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+', '{',
				'}', '[', ']' };

		String newStr = "";
		escapeSign: for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < SIGNS.length; j++) {
				if (str.charAt(i) == SIGNS[j]) {
					continue escapeSign;
				}
			}
			newStr += str.charAt(i);
		}

		String[] words = newStr.split(" ");
		Arrays.sort(words);

		for (String w : words) {
			System.out.println(w);

		}
	}

	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;" + " Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";

		sort(text);

	}

}
