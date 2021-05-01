package project;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import interfaces.LockedMeInterface;

public class DeleteFile implements LockedMeInterface{

	Scanner scanner = new Scanner(System.in);
	
	public void deleteFileDetails() {

		
		String del_path = System.getProperty("user.dir");     
        System.out.println("Current Working Directory = " + del_path);
        
		System.out.print("Enter File Directory : ");
		String dirName = scanner.nextLine();
		File dir = new File(dirName);
		File [] files = dir.listFiles();
		Arrays.sort(files, (f1,f2) -> f1.compareTo(f2));
		
		for(File file : files) {
			if(!file.isHidden()) {
				if(file.isDirectory()) {
					System.out.println("DIR \t" + file.getName());
					}
				else {
					System.out.println("FILE\t" + file.getName());
				}
			}
		}
		
		
		System.out.print("Enter file name (DELETE_FILE) : ");
		String deleteFileName = dirName + "/" +  scanner.nextLine();
		
		File file = new File(deleteFileName);
				
		try {
			
			if(file.delete()) {
				
				System.out.println(file.getName() + " deleted"); 
			}
			
			else {
				System.out.println("File is not deleted!");  
			}


		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
