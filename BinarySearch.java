public class binarysearch {
	public static void main(String args[]) {
		String dict[] = {"a", "b", "c", "d", "e", "f"};
		System.out.println(binarySearch(dict, "f"));
	}

	public static boolean binarySearch(String[] dictionary, String word) {
		int lowerBound = 0;
		int upperBound = dictionary.length - 1;

		// iterate repeatedly until we've found the spot where the word should be
		while (lowerBound <= upperBound) {
			// take a guess
			int guess = (upperBound + lowerBound) / 2;

			// did we find the word?
			if (dictionary[guess].equals(word)) {
				return true;
			}
			// if we're too early in the alphabet, re-search the second half
			else if (dictionary[guess].compareTo(word) < 0) {
				lowerBound = guess + 1;
			// if we're too early in the alphabet, re-search the first half
			} else {
				upperBound = guess - 1;
			}
		}

		// if we haven't found the word, we return false
		return false;
	}
}
