package Array;

public class Frequency {
	public void findFrequencyOfElements() {
		int[] array = { 1, 2, 5, 4, 8, 3, 0, 4, 5, 6, 1, 8 };
		int[] fre = new int[array.length];
		int visited = -1;

		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					fre[j] = visited;
				}
			}
			if (fre[i] != visited) {
				fre[i] = count;
			}
		}
		System.out.println("---------------------");
		System.out.println("Elements | frequency");
		System.out.println("----------------------");
		for (int i = 0; i < fre.length; i++) {
			if (fre[i] != visited) {
				System.out.println("" + array[i] + " | " + fre[i]);
			}
		}
		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		frequency.findFrequencyOfElements();

	}

}
