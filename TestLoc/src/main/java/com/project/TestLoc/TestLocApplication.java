package com.project.TestLoc;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLocApplication {
	public static void main(String[] args) {
		String lineToRead = "";                                                 //will be used to read the lines from .txt file                                     //will be used to count blank lines
		int totalNumberofLines = 0;                                             //will be used to count all lines
		try {
			BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\KULUUBZ\\Documents\\TestLoc\\src\\main\\java\\com\\project\\TestLoc\\TestLocApplication.java"));
			try {
				while ((lineToRead = br.readLine()) != null) {
					totalNumberofLines++;
				}
			} catch (IOException ex) {
			}
			br.close();                                                         //close the buffer reader to empty ram area
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Total Number of Physical Lines " + totalNumberofLines);
	}
}
