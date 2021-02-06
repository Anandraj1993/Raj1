

public class AscendingOrderInArray {
	public static void main(String[] args) {
		int a[] = { 20, 40, 70, 30, 50 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
