package Array;

public class Duplicates {
	public void findDuplicatrs() {
		int[] array = { 1, 4, 5, 2, 4, 6, 8, 4, 5, 2 };
		System.out.println("original array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nduplicates in an array:");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j] ==array[i])
				System.out.print(array[j]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Duplicates duplicates = new Duplicates();
		duplicates.findDuplicatrs();

	}

}
