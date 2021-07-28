package handler;

import entity.Human;
import util.Input;

public class Start {
	
	static Input input = new Input();
	
	public Human characterSettings() {
		boolean start = true;
		boolean settings = false;
		
		while(start) {
			System.out.println("1. New Game | 2. Exit");
			int choice = input.NumInput();
			if(choice == 1) {
				start = false;
				settings = true;
				//needs improvement
			}else if(choice == 2) {
				System.exit(0);
			}
		}
		
		while(settings) {
			System.out.println("Enter you name");
			String name = input.LetterInput();
			System.out.println("1. Male | 2. Female");
			System.out.println("Your gender");
			int gender = input.NumInput();
			Human player = new Human(name, 10, 10, 1, 2000, gender);
			return player;
		}
		
		return null;
	}
}
