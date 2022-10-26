package Array;

public class OddPosition {
	public void findOddPositionNumber() {
		int[] array = { 1, 4, 5, 8, 9, 6, 4, 2, 3 };
		// when we find odd position yake index as 1 starting.
		for (int index = 1; index < array.length; index = index + 2) {
			System.out.println(array[index]);
		}
	}

	public static void main(String[] args) {
		OddPosition position = new OddPosition();
		position.findOddPositionNumber();

	}

}
