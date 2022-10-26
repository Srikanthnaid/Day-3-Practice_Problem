package Array;

public class SmallestNumber {
	public void findSmallestNumber() {
		int[] array = { 1, 8, 6, 2, 4, 7, 9 };
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min + " is smallest number among the array");
	}

	public static void main(String[] args) {
		SmallestNumber number = new SmallestNumber();
		number.findSmallestNumber();

	}

}
