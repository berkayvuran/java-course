package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println(number + ": Asal Sayý Deðildir");
			return;
		}

		if (number < 1) {
			System.out.println(number + ": Geçersiz Sayýdýr");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(number + ": Asal Sayýdýr");
		} else {
			System.out.println(number + ": Asal Sayý Deðildir");
		}

	}

}
