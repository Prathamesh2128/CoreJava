package Hello;

public class HelloWorld {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		String name = "Prathamesh Shinde";
		System.out.println(name);
		
		char charAt = name.charAt(9);
		System.out.println(charAt);
		
		char[] nameCharArray = name.toCharArray();
		System.out.println(nameCharArray);
		System.out.println(nameCharArray.length);
		for(int i = nameCharArray.length-1; i > 0; i--) {
			System.out.print(nameCharArray[i]);
		}
		
		
		System.out.println();
		double d = 10.22;
		float f = (float)d;
		System.out.println(f);
	}
}
