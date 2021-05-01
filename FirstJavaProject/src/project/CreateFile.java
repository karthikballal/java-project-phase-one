package project;

import java.io.File;
import java.util.Scanner;

import interfaces.LockedMeInterface;

public class CreateFile implements LockedMeInterface{

	Scanner scanner = new Scanner(System.in);
	
	public void fileDeatils() {
		
		String path = System.getProperty("user.dir");     
        System.out.println("Current Working Directory = " + path);
		System.out.print("Enter file directory path for file creation : ");
		String dirName = scanner.nextLine();
		System.out.print("Enter file name (CREATE_FILE) : ");
		String fileName = scanner.nextLine();
		
		File file = new File(dirName + "/" + fileName + ".txt");
		
		try {

			boolean value = file.createNewFile();
			
			if(value) {
				
				System.out.println("New file is created!");
				
			}
			else {
				
				System.out.println("File already exists!");
				
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
