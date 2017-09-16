package books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookApp {


    public static void main(String[] args) throws IOException{
    	
    	Book bk = new Book();
    	List<Book> bookList = new ArrayList<>();
    	bookList = bk.getList("books.csv");
    	
    	Collections.sort(bookList);
   	 	System.out.println("\nSorted Book List:\n");	 	
   	 	for(Book book : bookList)
   	 	{
   	 	
   	 		System.out.println(" " + book.getTitle()+" by "+book.getAuthor()+" ("+book.getYear()+") ");
   	 		
   	 	}
    	
    	
    }
 }