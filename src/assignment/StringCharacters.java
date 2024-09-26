package assignment;

public class StringCharacters {

	static void CountChars(String str) {

		final char[] VOWELS = { 'o', 'u', 'i', 'a', 'e' };
		int VowelsCount = 0;
		int LetterCount = 0;
		int SpaceCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				SpaceCount++;
			} else if (Character.isLetter(str.charAt(i))) {
				LetterCount++;
				for (int j = 0; j < VOWELS.length; j++) {
					if (Character.toLowerCase(str.charAt(i)) == VOWELS[j]) {
						VowelsCount++;
					}
				}

			}

		}

		System.out.println("The text contained vowels: " + VowelsCount + "\n" + "consonants "
				+ (LetterCount - VowelsCount) + "\n" + "spaces: " + SpaceCount);

	}

	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";

		CountChars(text);

	}

}
