package PPL_Fall2018.Week3.LadyLee;

public class Ex9 {
	//  bai 10
	public static void main(String[] args) {
		Reverse();
	}

	public static String Reverse() {
		System.out.println("Enter a String: ");
		String a = Ex1.inputString();
		String[] str = a.split(" ");
		for (String s : str) {
			System.out.println(s);
		}

		StringBuffer sb = new StringBuffer();
		sb.append(str);
		for(int i = 0; i < ; i--) {
			System.out.println(sb);
		}
		return a;

	}
}
