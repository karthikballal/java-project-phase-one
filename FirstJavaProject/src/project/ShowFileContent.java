package project;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

import interfaces.LockedMeInterface;

public class ShowFileContent implements LockedMeInterface{

	Scanner scanner = new Scanner(System.in);
	
	public void displayContent() {

		String path = System.getProperty("user.dir");     
        System.out.println("Current Working Directory = " + path);
		System.out.print("Please enter the path where file content has to be viewed  : ");
		String dirName = scanner.nextLine();
		System.out.print("Enter name of the file to view the content : ");
		String fileName = scanner.nextLine();
		try {
				FileInputStream file = new FileInputStream(dirName + "/" + fileName);
				BufferedInputStream input = new BufferedInputStream(file);
				int i = input .read();
				while (i != -1) {
					System.out.print((char) i);

					// Reads next byte from the file
					i = input.read();
				}
				input.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	
	}
}
