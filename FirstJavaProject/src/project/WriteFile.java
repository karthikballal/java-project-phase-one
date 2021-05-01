package project;

import java.io.FileOutputStream;
import java.util.Scanner;

import interfaces.LockedMeInterface;

public class WriteFile implements LockedMeInterface{

	Scanner scanner = new Scanner(System.in);
	
	public void writeFileDetails() {
		
		String write_path = System.getProperty("user.dir");     
        System.out.println("Current Working Directory = " + write_path);
		System.out.print("Please enter the path where text file has to edited  : ");
		String dirName = scanner.nextLine() + "/";
		System.out.print("Enter the file name : ");
		String writeFileName = scanner.nextLine() + ".txt";
		
		System.out.print("Enter content to the file : ");
		String data = scanner.nextLine();

		
		
		try {
			FileOutputStream output = new FileOutputStream(dirName + writeFileName);
			byte[] array = data.getBytes();
			output.write(array);
			
			System.out.println("Content is written to the file!");
			
			output.close();
            
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
