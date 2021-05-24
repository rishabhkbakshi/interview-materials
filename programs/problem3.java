package programs;

public class problem3 {
	
	// fabonocci series
	private void fabonocciSeries() {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 0 || i == 1) {
				System.out.println(i);
			} else {
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}			
		}
	}
}
