package interitance2;

public class LogManager {
		public void log(int logType) {
			if(logType == 1) {
				System.out.println("Veritabanýna Loglandý");
			}
			else if(logType == 2) {
				System.out.println("Dosyaya Loglandý");
			}
			else if(logType == 3 ) {
				System.out.println("Emaile Loglandý");
			}
		}
}

/*
 * Database
 * File
 * Email
 * */
 