package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		File currentDirectory = new File(".");
		
		System.out.println(currentDirectory.getAbsolutePath());
		//shows working directory
		
		System.out.println(currentDirectory.getCanonicalPath());
		
		//show files in the directory
		for(String f: currentDirectory.list()) {
			System.out.println(f);
		}

	}

}
