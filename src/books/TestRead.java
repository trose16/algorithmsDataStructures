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
//		BufferedReader reader = new BufferedReader(new FileReader("books.csv"));
//		String text;
//		Scanner scanner;
//		int column = 0;
//		String title = null;
//		String author = null;
//		int year = 0;
//		List<Book> bookList = new ArrayList<>();
//		
//
//			while((text = reader.readLine()) != null){
//				try {
//					Book bk = new Book(title, author, year); // need to initialize w/params
//					scanner = new Scanner(text);
//					scanner.useDelimiter(",");
//						while(scanner.hasNext()){
//							String data = scanner.next();
//							if(column == 0)
//								title = data;
//							else if (column == 1)
//								author = data;
//							else if (column == 2)
//								year = Integer.parseInt(data);
//							column ++;
//						} 
//					reader.close();
//					column = 0;
//					bookList.add(bk);
//					
//					System.out.println("Number of books read in: " + bookList.size());
//					for(int i = 0; i< bookList.size(); i++){
//						System.out.println(bookList.get(i));
//					}
//					
//					}catch (NumberFormatException error) {
//							System.err.println("Problem reading in " + text);
//					}catch (IOException error) {
//							System.err.println("Problem reading in " + text);
//						}	
//				}		
//	
//		}		
	
}