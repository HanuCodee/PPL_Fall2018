package day2;
import java.io.File;
public class ex4 {
	public static void main(String[] args) {
		// Tạo đối tượng File là đại diện cho 1 đường dẫn
		File apath = new File("C:/users/M/Desktop/abc.txt");
		// Kiểm tra sự tồn tại
		System.out.println("Apath exists? " + apath.exists());
		if(apath.exists()) {
			// In ra đường dẫn
			System.out.println("Absolute apath: " + apath.getAbsolutePath());
		}else {
			System.out.println("File doesn't exist");
		}
		
		
	}
	

}
