package Array;

public class LargestNumber {
	public void findLargestNumber() {
		int[] array = { 1, 2, 5, 8, 9, 10 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max+" is the largest number among the array");
	}

	public static void main(String[] args) {
		LargestNumber number = new LargestNumber();
		number.findLargestNumber();

	}

}
