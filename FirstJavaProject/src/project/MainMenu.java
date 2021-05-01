package project;

import java.util.Scanner;

import interfaces.LockedMeInterface;

public class MainMenu implements LockedMeInterface{

	int id;
	Scanner scanner = new Scanner(System.in);
		
	public void displayMenu() {
		
		System.out.println("");
		System.out.println("Choose 1 --> Show the current files in root directory");
		System.out.println("Choose 2 --> Create File / Write File / Delete File");
		System.out.println("Choose 3 --> Exit Application");
		System.out.println("");
		
		System.out.print("Please enter your choice : ");
		id = scanner.nextInt();
		if(id == 1) {
			ShowFiles showFile = new ShowFiles();
			showFile.displayRootFile();
			displayMenu();
			
		}
		else if(id ==2) {
			SubMenu subMenu = new SubMenu();
			subMenu.displaySubMenu();
		}
		else if(id==3) {
			System.out.println("Thanks for choosing Locked Me Application!!");
			System.exit(id);
		}
		else {
			System.out.println("Please choose the correct option!");
		}

		
	}

}
