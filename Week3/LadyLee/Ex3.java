package PPL_Fall2018.Week3.LadyLee;

public class Ex3 {
	public static String FirstCharacter() {
		System.out.println("Ex3. Enter name: ");
		String a = Ex1.inputString();
		System.out.println("The first character of name is: " + a.charAt(0));
		return a;
}
	public static void main(String[] args) {
		FirstCharacter();
	}
	
}
