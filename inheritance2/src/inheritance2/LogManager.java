package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritabanýna loglandý.");
		} else if (logType == 2) {
			System.out.println("Dosyaya loglandý.");
		} else {
			System.out.println("e-Posta gönderildi.");
		}
	}
}

//1 - Database
//2 - File
//3 - e-Mail