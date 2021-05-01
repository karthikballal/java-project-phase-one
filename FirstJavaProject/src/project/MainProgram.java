package project;

import interfaces.LockedMeInterface;

public class MainProgram implements LockedMeInterface{

	public void mainProgramDisplay() {
		
		System.out.println("------Welcome to LockedMe Application------");
		System.out.println("Developed by : Karthik Ballal");
		System.out.println("Email : karthikballal@ymail.com");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		MainMenu optMenu = new MainMenu();
		optMenu.displayMenu();
	}

}
