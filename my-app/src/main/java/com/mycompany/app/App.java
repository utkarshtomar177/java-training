package com.mycompany.app;

/**
 * Read CSV and print
 *
 */
import java.io.*;
public class App 
{
	
	public static void read(String csv_file) {
		try {
			File file = new File(csv_file);
			FileReader file_reader = new FileReader(file);
			BufferedReader buffer_reader = new BufferedReader(file_reader);
			String end = "";
			while((end = buffer_reader.readLine()) != null) {
				System.out.print(end);
				System.out.println();
				
			}
			
			buffer_reader.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
	}
	

	public static void main(String[] args) {
		String csv_file = "C:/test/abc.csv";
		App.read(csv_file);
		System.out.println();
		String txt_file = "C:/test/abc.txt";
		App.read(txt_file);
   	}
}
