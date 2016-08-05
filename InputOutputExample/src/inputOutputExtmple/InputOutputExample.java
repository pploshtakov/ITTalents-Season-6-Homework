package inputOutputExtmple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

import javax.activation.FileDataSource;

import myExceptions.NoSuchComandException;

public class InputOutputExample {
	public enum Comands {
		CREATE, modify, delete, search
	};

	static PrintStream output;

	public static void main(String[] args) throws IOException {
		File inputFile = new File(
				"E:\\ITTalents\\Season 6 Homework\\InputOutputExample\\src\\inputOutputExtmple\\console.txt");
		Scanner fileReader = new Scanner(inputFile);
		// String temp = fileReader.nextLine();
		// if (temp.indexOf("#CREATE") != -1) {
		// output = new PrintStream("E:\\ITTalents\\Season 6
		// Homework\\InputOutputExample\\src\\inputOutputExtmple\\output.txt");
		// }
		try {
		while (fileReader.hasNextLine()) {
				String temp = fileReader.nextLine();
				realizeComand(readFile(temp), temp);
			}
		}
		catch (NoSuchComandException e) {
				output.println(e.getMessage());
		} catch (FileNotFoundException e) {
				output.println(e.getMessage());
		} 
		finally {
			fileReader.close();
		}

	}

	private static Comands readFile(String nextLine) throws NoSuchComandException {
		String temp = nextLine;
		if (temp.indexOf("#CREATE") != -1) {
			return Comands.CREATE;
		}
		if (temp.indexOf("#modify") != -1) {
			return Comands.modify;
		}
		if (temp.indexOf("#delete") != -1) {
			return Comands.delete;
		}
		if (temp.indexOf("#search") != -1) {
			return Comands.search;
		}
		throw new NoSuchComandException();
	}

	private static void realizeComand(Comands c, String temp) throws FileNotFoundException {
		switch (c) {
		case CREATE:
			output = new PrintStream(
					"E:\\ITTalents\\Season 6 Homework\\InputOutputExample\\src\\inputOutputExtmple\\output.txt");
			break;
		case modify:
			output.append(temp.substring(temp.indexOf(" ")) + "\n");
			break;
		case delete:
			// TODO
			File delFile = new File("E:\\ITTalents\\Season 6 Homework\\InputOutputExample\\src\\inputOutputExtmple\\output.txt");
			delFile.deleteOnExit();
			break;
		case search:
			File file = new File("E:\\ITTalents\\Season 6 Homework\\InputOutputExample\\src\\inputOutputExtmple\\output.txt");
			Scanner newFileReader = new Scanner(file);
			int appears = 0;
			while (newFileReader.hasNextLine()) {
				String line = newFileReader.nextLine();
				int index = line.indexOf(temp.substring(temp.indexOf(" ")));
				while (index != -1) {
					appears++;
					index = line.indexOf(temp.substring(temp.indexOf(" ")), (index + 1));
				}
			}
			output.println("The word's appears " + appears + " times!");
			break;
		}
	}
}
