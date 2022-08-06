package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		File currentDirectory = new File(".");
		//can supply full directory path instead of .
		
		System.out.println(currentDirectory.getAbsolutePath());
		//shows working directory
		
		System.out.println(currentDirectory.getCanonicalPath());
		
		//show files in the directory
		for(String f: currentDirectory.list()) {
			System.out.println(f);
		}
		
		//write to a file
		Path path = Paths.get("text.txt");
		
		String text = "Hello\nthere";
		Files.write(path, text.getBytes());
		
		//read from a file
		String retrievedText = Files.readString(path);
		System.out.println(retrievedText);

	}

}
