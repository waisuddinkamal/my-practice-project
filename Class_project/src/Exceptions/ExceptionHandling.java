package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {

		// checked exceptions will force you to handle the exception before running the
		// code

		try {
			printFileData("some Path");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no file found");
		}

		try {
			printFileData("some other path");
		} catch (FileNotFoundException e) {
			System.out.println("try a different file, this was not ");
		}

	}

	public static void printFileData(String path) throws FileNotFoundException {
		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
	}

}