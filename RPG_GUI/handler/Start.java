package handler;

import entity.Human;
import util.Clear;
import util.Input;

public class Start {
	
	static Input input = new Input();
	static Clear clear = new Clear();
	
	public Human characterSettings() {
		boolean start = true;
		boolean settings = false;
		
		while(start) {
			System.out.println("1. New Game | 2. Exit");
			int choice = input.NumInput();
			Start.clear.clear();
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
			Start.clear.clear();
			System.out.println("1. Male | 2. Female");
			System.out.println("Your gender");
			int gender = input.NumInput();
			Start.clear.clear();
			Human player = new Human(name, 10, 10, 1, 3, 3,20000000, gender);
			return player;
		}
		
		return null;
	}
}
