package com.alevel.java.nix.homework.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SubstringSearch {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\file.txt");
			//создаем объект FileReader для объекта File
			FileReader fr = new FileReader(file);
			//создаем BufferedReader с существующего FileReader для построчного считывания
			BufferedReader reader = new BufferedReader(fr);
			// считаем сначала первую строку
			String line = reader.readLine();

			while (line != null) {
				boolean isContain2 = line.contains("mysite");
				if (isContain2 == true) {
					System.out.println(line);
				}
				//System.out.println(line);
				// считываем остальные строки в цикле
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

