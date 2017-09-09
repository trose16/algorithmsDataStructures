public class Book implements Comparable{
	private String title;
	private String author;
	private int year;
	
	// required methods
	public Book(String title, String author, int year){

	}

	public String getTitle(){}
	public String getAuthor(){}
	public int getYear(){}
	
	@Override
	public String toString(){}
	public static List<Book> getList(String file){}




@Override

	public int compareTo(){

	/*Comparable implements the natural order but in class Book it should sort by 	
	title. Class book is immutable. It has getters but no setters. */

	}


}