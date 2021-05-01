package project;

import java.io.File;
import java.util.Scanner;

import interfaces.LockedMeInterface;

public class SearchFile implements LockedMeInterface{

	Scanner scanner = new Scanner(System.in);
	
	public void searchFileDeatil() {

		String path = System.getProperty("user.dir");     
        System.out.println("Current Working Directory = " + path);
		System.out.print("Enter File Directory : ");
		String dirName = scanner.nextLine();
		File directory = new File(dirName);
		System.out.println("Enter file name to be searched : ");
		String writeFileName = scanner.nextLine();
		

		
		String[] flist = directory.list();
		int flag = 0;
		if (flist == null) {
            System.out.println("Empty directory.");
        }
		else {
			  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(writeFileName)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }
	}
}
