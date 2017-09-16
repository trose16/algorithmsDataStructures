package books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/* 
 * BookApp is a test client for the Book.java program.
 * It will use the Book class to read a csv file and 
 * return a list of instantiated book objects. It will
 * count the number of books read into the list, format the
 * strings, and sort by title using Collections in natural 
 * and reverse order.
 */

public class BookApp {

    public static void main(String[] args) throws IOException{
    	//Objects are set up
    	List<Book> bookList = new ArrayList<>();	
    	bookList = Book.getList("books.csv");
		System.out.println(
						"\n Number of books read in: " 
						+ bookList.size()
					);
		
		//Sorts in natural order
   	 	System.out.println(" \n ***Sorted Book List***");
    	Collections.sort(bookList);  	 	
		for(Book bk : bookList) { 	
   	 		System.out.println(
	   	 				" " + bk.getTitle() 
	   	 				+ " by " + bk.getAuthor() 
	   	 				+ " (" + bk.getYear() + ") "
   	 				);	
   	 	}
		
		//Sorts in reverse order
		Collections.sort(bookList, Collections.reverseOrder());
   	 	System.out.println(" \n ***Reverse Order Book List*** ");
		for(Book bk : bookList) { 	
   	 		System.out.println(
	   	 				" " + bk.getTitle() 
	   	 				+ " by " + bk.getAuthor() 
	   	 				+ " (" + bk.getYear() + ") "
   	 				);	
   	 	}
    	
    }

 }