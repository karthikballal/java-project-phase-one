package project;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ShowFiles {
	
	Scanner scanner = new Scanner(System.in);
	
	public void displayRootFile() {
		
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
	}

}
