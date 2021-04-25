package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 --> 1,2,3'e bölünür, 1+2+3 = 6,
		// 28 --> 1,2,4,7,14, 1+2+4+7+14 = 28
		int number = 5;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println("Mükemmel Sayýdýr");
		}else {
			System.out.println("Mükemmel Sayý Deðildir");
		}
			

		}

	}


