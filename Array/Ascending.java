package Array;

public class Ascending {
	public void sortAscendingOrder() {
		int[] array = { 8, 5, 4, 9, 6, 3, 7 };
		int temp = 0;
		
		//you can also using sort() method
		//Arrays.sort(array);
		
		System.out.println("Original Array->:");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nAfter Sorting Ascending order array->");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Ascending ascending = new Ascending();
		ascending.sortAscendingOrder();
	}

}

