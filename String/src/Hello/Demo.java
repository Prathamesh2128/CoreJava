package Hello;

public class Demo {

	public static void main(String[] args) {

		String name = "swiss";

		char arr[] = name.toCharArray();

		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] == arr[i]) {
					
				}
				else {
					System.out.println(arr[i]);
				}
				
			}

		}

	}

}
