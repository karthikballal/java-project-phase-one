package project;

import java.util.Scanner;

import interfaces.LockedMeInterface;

public class SubMenu implements LockedMeInterface{
	
	int opt;
	Scanner scanner = new Scanner(System.in);
		
	public void displaySubMenu() {
		
		System.out.println("");
		System.out.println("Choose 1 --> Create file");
		System.out.println("Choose 2 --> Write content to the file");
		System.out.println("Choose 3 --> Show file content");
		System.out.println("Choose 4 --> Delete the file");
		System.out.println("Choose 5 --> Search the file");
		System.out.println("Choose 6 --> Go to Main Menu");
		System.out.println("");
		System.out.print("Please enter your choice : ");
		opt = scanner.nextInt();
		
		if(opt == 1) {
			CreateFile createFile = new CreateFile();
			createFile.fileDeatils();
			displaySubMenu();
		}
		else if(opt == 2) {
			WriteFile writeFile = new WriteFile();
			writeFile.writeFileDetails();
			displaySubMenu();
		}
		else if(opt == 3) {
			ShowFileContent showContent = new ShowFileContent();
			showContent.displayContent();
			displaySubMenu();
		}
		else if(opt == 4) {
			DeleteFile deleteFile = new DeleteFile();
			deleteFile.deleteFileDetails();
			displaySubMenu();
		}
		else if(opt == 5) {
			SearchFile searchFile = new SearchFile();
			searchFile.searchFileDeatil();
			displaySubMenu();
		}
		else if(opt == 6) {
			MainMenu mainMenu = new MainMenu();
			mainMenu.displayMenu();
		}
		else {
			System.out.println("Please choose correct option!");
			displaySubMenu();
		}
	}
}
