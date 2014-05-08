public class Brave {

	public static void main(String[] args) {
		multiPrint("Hello, world!", 10);
	}

	public static void multiPrint(String string, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(string);
		}
	}
}
