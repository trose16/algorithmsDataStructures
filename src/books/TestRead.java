package books;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRead {
	
	public static void main(String[] args) throws IOException{
		FileReader file = new FileReader("books.csv");
		BufferedReader reader = new BufferedReader(file);
		String text;
		while((text = reader.readLine()) != null){
			System.out.println(text);
		}
		reader.close();
	}
	
}