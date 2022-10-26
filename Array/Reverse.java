package Array;

public class Reverse {
	public void printArrayReverse() {
		int[] array = {1,2,3,4,5};
		System.out.println("original array->:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("After reverse array->:");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		reverse.printArrayReverse();

	}

}
