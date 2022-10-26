package Array;

public class SecongLargestNumber {
	public void findSecongLArgestnumber() {
		int[] array = { 8, 5, 4, 9, 6, 3, 7 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("find third largest number" + array[array.length - 3]);
		System.out.println("find second lagest number in array->" + array[array.length - 2]);
	}

	public static void main(String[] args) {
		SecongLargestNumber number = new SecongLargestNumber();
		number.findSecongLArgestnumber();

	}

}
