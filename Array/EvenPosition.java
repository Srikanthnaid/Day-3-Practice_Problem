package Array;

public class EvenPosition {
	public void findEvenPosition() {
		int[] array = { 1, 5, 8, 74, 6 };
		for (int i = 0; i < array.length; i = i + 2) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		EvenPosition position = new EvenPosition();
		position.findEvenPosition();

	}

}
