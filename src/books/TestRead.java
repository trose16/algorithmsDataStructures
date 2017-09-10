package books;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRead {
	
//	public static void main(String[] args) throws IOException{
//		FileReader file = new FileReader("books.csv");
//		BufferedReader reader = new BufferedReader(file);
//		String text;
//		while((text = reader.readLine()) != null){
//			System.out.println(text);
//		}
//		reader.close();
//	}
	
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new FileReader("books.csv"));
		String text;
		Scanner scanner;
		int index = 0;
		String title = null;
		String author = null;
		int year = 0;
		List<Book> bookList = new ArrayList<>();
		System.out.println(bookList);
		
		while((text = reader.readLine()) != null){
			Book bk = new Book(title, author, year);
			scanner = new Scanner(text);
			scanner.useDelimiter(",");
			while(scanner.hasNext()){
				String data = scanner.next();
				System.out.println(data);
				if(index == 0)
					title = data;
				else if (index == 1)
					author = data;
				else if (index == 2)
					year = Integer.parseInt(data);
				else
					System.out.println("Sorry wrong input");
				index ++;
			}
			index = 0;
			bookList.add(bk);
		}
		
		reader.close();
		System.out.println(bookList);
	}
	
}