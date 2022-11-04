

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter array length: ");
		
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		int[] array2 = new int[arrayLength];
	
		
		// Konsol'dan aldigimiz verileri dizimize ekledik
		for (int i = 0; i < array.length; i++) {
			System.out.print("please enter number: ");
			array[i] = sc.nextInt();
		}
		// Array sinifinin sort methodu ile dizimizi sýraladik
		Arrays.sort(array);
		// Arrays sinifimizin toString methodu ile arrayimizi ekrana bastik
		System.out.println("array: " + Arrays.toString(array));
		
		for (int r : array) {
			int a = 0;
			for (int j = 0; j < array.length; j++) {
				if (r == array2[j]) {
					a++;
				}
			}
			int repeatedNumber = 0;
			if (a == 0) {
				int counter = 0;
				for (int i : array) {
					if (r == i) {
						counter++;
					}
				} 
				array2[repeatedNumber] = r;
				repeatedNumber++;  
				System.out.println("There are " + counter + " out of " + r + " numbers.");
			}
		}
	}
}
