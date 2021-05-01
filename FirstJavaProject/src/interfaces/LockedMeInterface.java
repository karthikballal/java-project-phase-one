package interfaces;

import project.MainProgram;

interface IMenu {

	void mainProgramDisplay();
	void displayMenu();
	void displayRootFile();
	void fileDeatils();
	void deleteFileDetails();
	void searchFileDeatil();
	void displayContent();
}
	
public interface LockedMeInterface {
	
		public static void main(String[] args) {

			MainProgram obj = new MainProgram();
			obj.mainProgramDisplay();
			
		}
	}

