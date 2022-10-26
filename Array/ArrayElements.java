package Array;

public class ArrayElements {
	public void printAllElementsOfArray() {
		int[] array = { 1, 2, 3, 4, 5 };
		int count = 0, i;
		for (i = 0; i < array.length; i++) {
			count++;
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		ArrayElements elements = new ArrayElements();
		elements.printAllElementsOfArray();

	}

}
