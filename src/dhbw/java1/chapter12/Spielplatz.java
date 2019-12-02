package dhbw.java1.chapter12;

import java.io.File;
import java.io.FileNotFoundException;

public class Spielplatz {
	
	public static long getFileSize(String path) throws FileNotFoundException {
		File file = new File(path);
		if (!file.exists()) {
			throw new FileNotFoundException("Path: " + path + " was not found! ¯\\_(ツ)_/¯");
		}
		return file.length();
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println(getFileSize("C:/Users/Patri/git/DHBW-Java1/src/dhbw/java1/chapter12/Spielplatz.java"));
		System.out.println(getFileSize("scr/funnyile.txt"));
	}

}
