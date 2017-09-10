package books;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements Comparable{
	private String title;
	private String author;
	private int year;
	
	// required methods
	public Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getYear(){
		return year;
	}
	
	@Override
	public String toString(){
		String blurb = getTitle() + " by " + getAuthor() + "("+ getYear() + ")";
		return blurb;
	}
	 
	public static ArrayList<Book> getList(String file) throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader("books.csv"));
		String text = null;
		while((text = reader.readLine()) != null){
			System.out.println(text);
		}
		/* If a line doesn’t follow the pattern title,author,year System.err.println("Problem reading in" + title)The
program should continue reading in the next line. NO exception should be thrown . */
		return null;
		
	}



@Override
public int compareTo(Object o) {
	/* TODO Comparable implements the natural order but in class Book it should sort by 	
	title. Class book is immutable. It has getters but no setters. */
	return 0;
}


}