package PPL_Fall2018.Week2.Hoapt;
import java.io.File;
public class ex4 {
	public static void main(String[] args) {
		// Táº¡o Ä‘á»‘i tÆ°á»£ng File lÃ  Ä‘áº¡i diá»‡n cho 1 Ä‘Æ°á»�ng dáº«n
		File apath = new File("C:/users/M/Desktop/abc.txt");
		// Kiá»ƒm tra sá»± tá»“n táº¡i
		System.out.println("Apath exists? " + apath.exists());
		if(apath.exists()) {
			// In ra Ä‘Æ°á»�ng dáº«n
			System.out.println("Absolute apath: " + apath.getAbsolutePath());
		}else {
			System.out.println("File doesn't exist");
		}
		
		
	}
	

}
