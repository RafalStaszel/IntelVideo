package com.kaos.video;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

	public ArrayList<String> readFile() {
		FileReader fr = null;
		String line = "";
		ArrayList<String> filmsL = new ArrayList<>();
		try {
			fr = new FileReader("src/main/resources/Movie.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		}

		BufferedReader bfr = new BufferedReader(fr);
		try {

			while ((line = bfr.readLine()) != null) {
				System.out.println(line);

				filmsL.add(line);

			}
		} catch (IOException e) {
			System.out.println("Read file error!");
			System.exit(2);
		}

		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("Close file error!");
			System.exit(3);
		}
		return filmsL;
	}

}
