package books;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Book implements Comparable<Object>{
	private String title;
	private String author;
	private int year;

	public Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	// 2nd simple constructor used by test client (BookApp.java).
	public Book(){}

	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getYear(){
		return year;
	}
	
	
	/*
	 * getList takes in a file parses the data using BufferedReader and
	 * the segments between commas are used to instantiate individual books. 
	 * Individual books are then added to a bookList and the list is returned.
	 * List follows the format: "title, author, year." If there is data that
	 * doesn't follow that format it notifies of the problem and reads the next line.
	 * @param file
	 * 
	 */	
	
	public static ArrayList<Book> getList(String file) {
		
		String csvFile = file;
		String line = "";
		String csvSplitBy = ",";
		ArrayList<Book> bookList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){		
			
			while((line = br.readLine()) != null){
				
				try {
				
					String[] text = line.split(csvSplitBy);
					Book book = new Book(text[0], text[1], Integer.parseInt(text[2]));
					bookList.add(book);
				
					} catch(ArrayIndexOutOfBoundsException e){
						
						System.out.println(" Problem reading in " + "'" + line + "'");
						
					} catch (NumberFormatException e) {
					
						System.out.println(" Problem reading in " + "'" + line + "'");
					} 		
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return bookList;	
			
	}

	/*
	 * The toString overrides java.lang method 
	 * and returns custom string representing 
	 * the books in format: name by author ( year ).
	 */	
	
	@Override
	public String toString(){
		String blurb = getTitle() + " by " + getAuthor() + " ("+ getYear() + ") ";
		return blurb;
	}
	 
	/* 
	 * Comparable implements the natural order 
	 * but in class Book it should sort by title.
	 */
	
@Override
	public int compareTo(Object bk) {
		Book book = (Book)bk;
		String title1 = this.title;
		String title2 = book.title;
		return title1.compareTo(title2);		
	}

}


