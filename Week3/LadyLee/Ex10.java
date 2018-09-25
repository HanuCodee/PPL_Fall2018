package PPL_Fall2018.Week3.LadyLee;

public class Ex10 { //thuc ra la bai 9
	public static StringBuffer stringBuffer() {
		System.out.println("Enter a string: ");
		StringBuffer sb = new StringBuffer(Ex1.inputString());
		
		StringBuffer rev = sb.reverse();
		System.out.println("The reverse string is: " + rev);
		return rev;
	}
	public static void main(String[] args) {
		stringBuffer();
	}
	
}
