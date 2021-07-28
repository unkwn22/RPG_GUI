package util;

import java.util.Scanner;

public class Input {
	
	static Scanner scan = new Scanner(System.in);
	
	public String LetterInput() {
		System.out.print("Input: ");
		String input = scan.next();
		return input;
	}
	
	public int NumInput() {
		while(true) {
			try {
				System.out.print("Input: ");
				int input = Integer.parseInt(scan.next());
				return input;
			}catch(Exception e) {
				System.out.println("Please type in numbers");
			}
		}
	}

}
