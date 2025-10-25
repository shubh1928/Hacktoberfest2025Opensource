public class DigitExtractionHashing {

	public static void main(String[] args) {

		int[] keys = { 12345, 23456, 34567, 45678 };
		int tableSize = 10;
		int[] hashTable = new int[tableSize];

		for (int key : keys) {
			int extractedDigits = (key / 10) % 100; // Extract 2 middle digits
			int index = extractedDigits % tableSize;
			hashTable[index] = key;
			System.out.println("Key: " + key + " → Extracted: " + extractedDigits + " → Index: " + index);
		}

	}

}
